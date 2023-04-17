package com.assignment.nokia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    public static void main(String[] args) {

        int number = 40;
        Object obj = new Object();
        PrimeNumber prime = new PrimeNumber();
        ExecutorService theadPool = Executors.newFixedThreadPool(2);
        theadPool.execute(()-> {
            try {
                prime.primeNumber(obj);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        theadPool.execute(()-> {
            try {
                prime.nonPrimeNumber(obj);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        theadPool.shutdown();

    }
}
