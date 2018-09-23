package chapter3_ProducerAndConsumer.t03_stack11;

public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop=" + myStack.pop());
    }
}
