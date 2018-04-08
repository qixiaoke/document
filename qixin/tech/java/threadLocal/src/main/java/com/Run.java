package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qixin on 2017/8/19.
 */
public class Run {
    public static void main(String[] args) {
        Sequence sequenceImplA = new SequenceImpl();
        Sequence sequenceImplB = new SequenceImpl();
        Sequence sequenceImplC = new SequenceImpl();

        Sequence sequenceAtomicA = new SequenceAtomicImpl();
        Sequence sequenceAtomicB = new SequenceAtomicImpl();
        Sequence sequenceAtomicC = new SequenceAtomicImpl();

        Sequence sequenceThreadLocalA = new SequenceThreadLocalImpl();
        Sequence sequenceThreadLocalB = new SequenceThreadLocalImpl();
        Sequence sequenceThreadLocalC = new SequenceThreadLocalImpl();

        Sequence sequenceManualThreadLocalA = new SequenceManualThreadLocalImpl();
        Sequence sequenceManualThreadLocalB = new SequenceManualThreadLocalImpl();
        Sequence sequenceManualThreadLocalC = new SequenceManualThreadLocalImpl();

        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(new ClientThread(sequenceImplA));
//        executorService.execute(new ClientThread(sequenceImplB));
//        executorService.execute(new ClientThread(sequenceImplC));

//        executorService.execute(new ClientThread(sequenceAtomicA));
//        executorService.execute(new ClientThread(sequenceAtomicB));
//        executorService.execute(new ClientThread(sequenceAtomicC));

//        executorService.execute(new ClientThread(sequenceThreadLocalA));
//        executorService.execute(new ClientThread(sequenceThreadLocalB));
//        executorService.execute(new ClientThread(sequenceThreadLocalC));

        executorService.execute(new ClientThread(sequenceManualThreadLocalA));
        executorService.execute(new ClientThread(sequenceManualThreadLocalB));
        executorService.execute(new ClientThread(sequenceManualThreadLocalC));
        executorService.shutdown();
    }
}
