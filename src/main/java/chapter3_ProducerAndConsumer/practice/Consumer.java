package chapter3_ProducerAndConsumer.practice;

public class Consumer extends Thread {
    Factory factory;
    private int number;

    public Consumer(Factory factory) {
        this.factory = factory;
    }

    public void setNum(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        consume(number);
    }

    private void consume(int number) {
        factory.consumer(number);
    }
}
