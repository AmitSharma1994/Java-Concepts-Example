package com.multithred;

/**
 *
 */
package com.java.multithreding;

/**
 * @author Amit Sharma
 *
 */
public class OddEvenMultiThread {
    static int N = 10;
    int counter = 1;

    public void printEven() {

        synchronized (this) {

            while (counter < N) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thead 1 is running");
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public void printOdd() {
        synchronized (this) {

            while(counter<N) {


                if(counter%2==1) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thead 2 is running");
                System.out.println(counter);
                counter++;
                notify();

            }
        }
    }

    public static void main(String[] args) {

        OddEvenMultiThread oet = new OddEvenMultiThread();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                oet.printEven();

            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {

                oet.printOdd();

            }
        });

        t1.start();
        t2.start();

    }

}