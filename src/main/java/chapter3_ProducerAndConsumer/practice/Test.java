package chapter3_ProducerAndConsumer.practice;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Storage();
        // 生产者对象
        Producer p1 = new Producer(factory);
        Producer p2 = new Producer(factory);
        Producer p3 = new Producer(factory);
        Producer p4 = new Producer(factory);
        Producer p5 = new Producer(factory);
        Producer p6 = new Producer(factory);
        Producer p7 = new Producer(factory);

        // 消费者对象
        Consumer c1 = new Consumer(factory);
        Consumer c2 = new Consumer(factory);
        Consumer c3 = new Consumer(factory);

        // 设置生产者产品生产数量
        p1.setNum(10);
        p2.setNum(10);
        p3.setNum(10);
        p4.setNum(10);
        p5.setNum(10);
        p6.setNum(10);
        p7.setNum(80);

        // 设置消费者产品消费数量
        c1.setNum(50);
        c2.setNum(20);
        c3.setNum(30);
        // 线程开始执行
        c1.start();
        c2.start();
        c3.start();

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
    }
}