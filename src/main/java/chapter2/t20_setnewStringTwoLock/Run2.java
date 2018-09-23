package chapter2.t20_setnewStringTwoLock;

/**
 * 因为他们都是在用lock=123，这被认为是在争夺同一个"123"的锁，所以A运行完B在运行
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        b.start();
    }
}
