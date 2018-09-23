package chapter2.t02;

/**
 * a因为等待了，线程不同步导致脏读，只需要把可能脏读的那个方法添加synchronized即可
 */
public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();

    }

}
