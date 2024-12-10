package com.multithred.executor;

import java.util.concurrent.*;

public class ParallelTasksExample {
    public static void main(String[] args) {
        // Create a thread pool with 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Create and submit tasks
        for (int i = 0; i < 10; i++) {
            int taskNumber = i;
            Runnable task = () -> {
                System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
                // Simulate work
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            };
            executorService.submit(task);
        }

        // Shutdown the executor
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
