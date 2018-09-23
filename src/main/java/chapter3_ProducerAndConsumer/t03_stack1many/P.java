package chapter3_ProducerAndConsumer.t03_stack1many;

public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
