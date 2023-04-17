package com.assignment.nokia.test;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JsonPojo jsonPojo = new JsonPojo();
        jsonPojo.setStartTime("9.00 AM");
        jsonPojo.setNode("test1");
        jsonPojo.setCpu("4");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("json.ser"));
        oos.writeObject(jsonPojo);
        System.out.println(oos.hashCode());

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("json.ser"));
        ois.readObject();
        System.out.println(ois.hashCode());


    }
}
