package chapter3_ProducerAndConsumer.t01_value11;

public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }

}
