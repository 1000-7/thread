package chapter3_ProducerAndConsumer.t02_valueManyManyNotifyAll;

public class ThreadC extends Thread {

    private C r;

    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }

}
