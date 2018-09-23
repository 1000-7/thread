package chapter3.t01_twoThreadTransData;

public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            System.out.println("b启动了");
            while (true) {
                int a = list.size();
                System.out.println("size:" + a);
                if (a == 5) {
                    System.out.println("==5了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
