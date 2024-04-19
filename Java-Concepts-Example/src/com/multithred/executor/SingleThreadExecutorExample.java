package com.multithred.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
In this example:
We create a SingleThreadExecutor using the Executors.newSingleThreadExecutor() factory method.
We submit three tasks to the executor using the submit() method. Each task is a lambda expression that prints a message indicating the task being executed along with the name of the thread executing it.
Finally, we shut down the executor using the shutdown() method to gracefully terminate the executor after all tasks have completed.
When you run this program, you'll observe that the tasks are executed sequentially by the single thread maintained by the SingleThreadExecutor. This ensures that only one task is executed at a time, in the order they were submitted, providing a simple form of sequential execution with concurrency.
*/

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        // Create a SingleThreadExecutor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit tasks to the executor
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task 1 executed by thread: " + threadName);
        });

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task 2 executed by thread: " + threadName);
        });

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task 3 executed by thread: " + threadName);
        });

        // Shutdown the executor once all tasks are completed
        executor.shutdown();
    }
}
