package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
    	Queue<String> qe=new LinkedList<String>(); ////elements order is FIFO
    	List<String> ls = new LinkedList<String>(); // FIFO
        qe.add("b");
        qe.add("a");
        qe.add("c");
        qe.add("e");
        qe.add("d");
        //qe.add(null);
        //qe.add(null);
        System.out.println(qe);
        
        //qe.remove();
        //qe.remove();
        System.out.println(qe);

        qe.offer("z");//[b, a, c, e, d, z]
        qe.add("y");//[b, a, c, e, d, z, y]
        System.out.println(qe);
        qe.element();//[b, a, c, e, d, z, y]
        qe.peek();//[b, a, c, e, d, z, y]
        qe.poll();	//[a, c, e, d, z, y]
        qe.remove(); //[c, e, d, z, y]
        System.out.println(qe);
    }
}
