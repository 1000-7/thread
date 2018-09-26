package chapter4.t08_ReentrantReadWriteLock.writeread;

import chapter4.t08_ReentrantReadWriteLock.readwrite.Service;
import chapter4.t08_ReentrantReadWriteLock.readwrite.ThreadA;
import chapter4.t08_ReentrantReadWriteLock.readwrite.ThreadB;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }

}
