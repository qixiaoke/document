package com;

/**
 * Created by qixin on 2017/8/19.
 */
public class ClientThread implements Runnable {
    private Sequence sequence;

    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for(int i = 0; i < 30; i++) {
            System.out.println("thread name = " + Thread.currentThread().getName() + " ,sequence = " + sequence.getNumber());
        }
    }
}
