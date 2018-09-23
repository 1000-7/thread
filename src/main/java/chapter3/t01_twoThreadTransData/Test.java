package chapter3.t01_twoThreadTransData;

public class Test {

    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.setPriority(10);
        b.start();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();


    }

}
