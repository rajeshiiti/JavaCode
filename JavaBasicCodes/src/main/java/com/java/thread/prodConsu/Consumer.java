package com.java.thread.prodConsu;

import java.util.Random;

public class Consumer implements Runnable{
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        Random random = new Random();

        while(true) {
            String message = drop.comsume();
            System.out.println("Message Consumed: "+message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            if(message.equals("done")) {
                break;
            }
        }

    }
}
