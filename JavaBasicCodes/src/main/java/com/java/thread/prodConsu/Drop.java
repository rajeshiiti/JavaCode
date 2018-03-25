package com.java.thread.prodConsu;

public class Drop {
    /*
     *  This message send by producer and consumed by consumer
     */
    private String message;


    /**
     *  Value of empty if true than consumer will wait and producer will produce.
     *  and if value of false than producer will wait and consumer will consume.
     */

    private boolean empty = true;


    /**
     *
     * @return String : message
     */
    public synchronized String comsume() {

        while (this.empty) {
            System.out.println("Waiting for consuming....");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }
        }
        String myMessage = this.message;
        this.empty = true;
        notifyAll();
        return myMessage;

    }


    public synchronized void produce(String message) {

        while (!this.empty) {
            System.out.println("Waiting for producing....");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.message = message;
        this.empty = false;
        notifyAll();
    }
}
