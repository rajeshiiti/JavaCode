package com.java.thread.prodConsu;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable{

    private Drop drop;

    private List<String> messages;

    public Producer(Drop drop, List<String> messages) {
        this.drop = drop;
        this.messages = messages;
    }

    public void produce(String message) {
        System.out.println("Message Produced: "+message);
        drop.produce(message);
    }

    @Override
    public void run() {

        Random random = new Random();
        for (String message: this.messages
             ) {
            drop.produce(message);
            System.out.println("Message produces: "+message);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){}
        }

    }
}
