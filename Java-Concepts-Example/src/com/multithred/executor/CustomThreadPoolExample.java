package com.multithred.executor;

import java.util.concurrent.*;
import java.util.*;

public class CustomThreadPoolExample {
    public static void main(String[] args) {
        // Create a custom thread pool
        ThreadPoolExecutor customThreadPool = new ThreadPoolExecutor(
            2, // core pool size
            4, // maximum pool size
            60, // keep-alive time for idle threads
            TimeUnit.SECONDS, // time unit for keep-alive setting
            new LinkedBlockingQueue<Runnable>(), // work queue
            new CustomThreadFactory(), // custom thread factory
            new CustomRejectedExecutionHandler() // custom rejected execution handler
        );

        // Submit tasks to the custom thread pool
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            futures.add(customThreadPool.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskNumber + " is executed by " + threadName);
                Thread.sleep(1000); // Simulate task taking 1 second
                return "Result of Task " + taskNumber + " from " + threadName;
            }));
        }

        // Retrieve and print task results
        futures.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        // Shutdown the custom thread pool
        customThreadPool.shutdown();
        try {
            if (!customThreadPool.awaitTermination(60, TimeUnit.SECONDS)) {
                customThreadPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            customThreadPool.shutdownNow();
        }
    }
}

// Custom Thread Factory
class CustomThreadFactory implements ThreadFactory {
    private int threadCount = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("CustomThread-" + threadCount++);
        thread.setDaemon(false); // set as a non-daemon thread
        return thread;
    }
}

// Custom Rejected Execution Handler
class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task " + r.toString() + " rejected from " + executor.toString());
    }
}
