package com.multithred.executor;

import java.util.*;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) {
        // Create a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Create a list of tasks
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            tasks.add(() -> {
                // Simulate work
                Thread.sleep(1000);
                return "Task " + taskNumber + " executed by " + Thread.currentThread().getName();
            });
        }

        try {
            // Invoke all tasks
            List<Future<String>> futures = executorService.invokeAll(tasks);
            
            // Retrieve and print results
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executorService.shutdown();
        }
    }
}
