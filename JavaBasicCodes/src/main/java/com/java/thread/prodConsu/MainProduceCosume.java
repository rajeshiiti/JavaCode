package com.java.thread.prodConsu;

import java.util.ArrayList;
import java.util.List;

public class MainProduceCosume {
    public static void main(String args[]) {
        Drop drop = new Drop();
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("You");
        list.add("producing");
        list.add("messages");
        list.add("consumed");
        list.add("by");
        list.add("consumer...");
        list.add("done");


        Producer producer = new Producer(drop, list);

        Consumer consumer = new Consumer(drop);

        Thread produ = new Thread(producer);

        Thread consum = new Thread(consumer);

        produ.start();
        consum.start();


    }
}
