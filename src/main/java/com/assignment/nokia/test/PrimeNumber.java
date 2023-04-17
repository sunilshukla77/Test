package com.assignment.nokia.test;

import org.junit.Test;

public class PrimeNumber {


    int count = 0;
    public void primeNumber(Object obj) throws InterruptedException {
        while (count< 40){
            synchronized (obj) {
                while (isPrime(count)) {
                    System.out.println("Prime number " + count);
                    obj.wait();
                }
                count++;
                obj.notify();
            }
        }
    }

    public void nonPrimeNumber(Object obj) throws InterruptedException {
        while (count< 40){
            synchronized (obj) {
                while (!isPrime(count)) {
                    System.out.println("Non Prime number " + count);
                    obj.wait();
                }
                count++;
                obj.notify();
            }
        }
    }
    boolean isPrime(int n){
        if(n==1||n==0)return false;

        //Run a loop from 2 to square root of n
        for(int i=2; i*i<=n; i++){
            // if the number is divisible by i, then n is not a prime number.
            System.out.println("n : " +n + " i "+ i);
            if(n%i==0) {
                System.out.println(n%i);
                return false;
            }
        }
        //otherwise, n is prime number.
        return true;
    }

    @Test
    public void test(){
        for (int i = 0; i < 12; i++) {
            if(isPrime(i)){
                System.out.println("Prime no : " + i);
            }
        }
    }
}
