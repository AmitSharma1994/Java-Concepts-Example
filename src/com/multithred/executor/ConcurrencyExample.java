package com.multithred.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(() -> {
            System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 2 is running in thread: " + Thread.currentThread().getName());
        });
        
        executorService.submit(() -> {
            System.out.println("Task 3 is running in thread: " + Thread.currentThread().getName());
        });
        
        executorService.submit(() -> {
            System.out.println("Task 4 is running in thread: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            System.out.println("Task 5 is running in thread: " + Thread.currentThread().getName());
        });

        executorService.shutdown();
    }
}

