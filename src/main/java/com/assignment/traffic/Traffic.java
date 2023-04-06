package com.assignment.traffic;

public class Traffic {

    int counter = 1;
    static int number = 10;

    public void green(Object obj, long time) {
        synchronized (obj) {
            while (counter<number) {
                while (counter % 3 != 0) {
                    try {
                        obj.wait(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter++;
                System.out.println("GREEN");
                obj.notifyAll();
            }
        }
    }

    public void red(Object obj, long time) {
        synchronized (obj) {
            while (counter< number) {
                while (counter % 3 != 2) {
                    try {
                        obj.wait(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter++;
                System.out.println("RED");
                obj.notifyAll();
            }
        }
    }

    public void amber(Object obj, long time) {
        synchronized (obj) {
            while (counter<number) {
                while (counter % 3 != 1) {
                    try {
                        obj.wait(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter++;
                System.out.println("AMBER");
                obj.notifyAll();
            }
        }

    }
}
