package chapter3_ProducerAndConsumer.practice;

import java.util.LinkedList;

public class Storage implements Factory {
    public static final int MAX_STORAGE = 100;
    public static LinkedList<Product> products = new LinkedList<>();

    @Override
    synchronized public void produce(int number) {
        while (products.size() + number > MAX_STORAGE) {
            System.out.println("【要生产的产品数量】:" + number + "\t【库存量】:" + products.size() + "\t暂时不能执行生产任务!");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < number; i++) {
            String a = String.valueOf(i);
            Product product = new Product(a, a);
            products.push(product);
        }
        System.out.println("【已经生产产品数】:" + number + "\t【现仓储量为】:" + products.size());
        this.notifyAll();
    }

    @Override
    synchronized public void consumer(int number) {
        while (products.size() < number) {
            System.out.println("【要消费的产品数量】:" + number + "\t【库存量】:" + products.size() + "\t暂时不能执行生产任务!");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < number; i++) {
            products.pop();
        }
        System.out.println("【已经消费产品数】:" + number + "\t【现仓储量为】:" + products.size());
        this.notifyAll();
    }


}
