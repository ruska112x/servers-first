package org.karabalin.task8;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class AddingThreadWithLock extends Thread {

    private final Lock lock;

    private final List<Integer> integers;
    private final Random random = new Random();

    public AddingThreadWithLock(Lock lock, List<Integer> integers) {
        this.lock = lock;
        this.integers = integers;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; ++i) {
            lock.lock();
            try {
                integers.add(random.nextInt());
                System.out.println("A" + i);
            } finally {
                lock.unlock();
            }
        }
    }
}
