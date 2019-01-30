package chapter7.t02_threadGroup.test4;

public class Run {

    public static void main(String[] args) {
        new Run().method1();
    }

    public void method2() {
        System.out.println("线程：" + Thread.currentThread().getName()
                + " 所在的线程组名为："
                + Thread.currentThread().getThreadGroup().getName());
        System.out
                .println("main线程所在的线程组的父线程组的名称是："
                        + Thread.currentThread().getThreadGroup().getParent()
                        .getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："
                + Thread.currentThread().getThreadGroup().getParent()
                .getParent().getName());
    }

    public void method1() {
        System.out.println("线程组名称："
                + Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量："
                + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组的数量-加之前："
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread()
                .getThreadGroup(), "newGroup");
        System.out.println("线程组中线程组的数量-加之之后："
                + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out
                .println("父线程组名称："
                        + Thread.currentThread().getThreadGroup().getParent()
                        .getName());

    }
}
