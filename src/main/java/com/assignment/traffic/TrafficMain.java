package com.assignment.traffic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TrafficMain {


    public static void main(String[] args) {

        Object obj = new Object();
        Traffic t = new Traffic();
        ExecutorService tp = Executors.newFixedThreadPool(3);
        tp.execute(() -> t.amber(obj, 100));
        tp.execute(() -> t.green(obj, 600));
        tp.execute(() -> t.red(obj, 1000));
        tp.shutdown();
    }
}