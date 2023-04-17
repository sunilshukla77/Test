package com.assignment.traffic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrafficMain {


    public static void main(String[] args) {

        Object obj = new Object();
        Traffic t = new Traffic();
        ExecutorService tp = Executors.newFixedThreadPool(3);
        tp.execute(() -> {
            try {
                t.amber(obj, 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tp.execute(() -> {
            try {
                t.green(obj, 600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tp.execute(() -> {
            try {
                t.red(obj, 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        tp.shutdown();
    }
}