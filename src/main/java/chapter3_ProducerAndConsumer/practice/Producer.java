package chapter3_ProducerAndConsumer.practice;

public class Producer extends Thread {
    Factory factory;
    private int number;

    public Producer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        produce(number);
    }

    public void setNum(int number) {
        this.number = number;
    }

    private void produce(int number) {
        factory.produce(number);
    }
}
