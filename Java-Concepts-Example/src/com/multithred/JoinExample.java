package com.multithred;

public class JoinExample {
    public static void main(String[] args) {
        // Thread 1: Simulates a long-running task
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: Starting long task...");
            try {
                Thread.sleep(3000); // Simulate task taking 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Task completed.");
        });

        // Thread 2: Simulates a shorter task
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: Starting short task...");
            try {
                Thread.sleep(1000); // Simulate task taking 1 second
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Task completed.");
        });

        
    
        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Main thread waits for thread1 to complete 
            thread1.join();
            System.out.println("Main thread: Thread 1 has finished."); //Thread1  has long task so it will take time for completed
        
            // Main thread waits for thread2 to complete
            thread2.join();
            System.out.println("Main thread: Thread 2 has finished.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread: All tasks are completed.");
    }
}
