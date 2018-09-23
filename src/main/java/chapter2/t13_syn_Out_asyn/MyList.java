package chapter2.t13_syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个例子可以看出来，这线程A和线程B循环调用同步方法时，因为线程A和线程B执行是异步的，所以可能会脏读
 */
public class MyList {

    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "执行了add方法！");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "执行了getSize方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "退出了getSize方法！");
        return sizeValue;
    }

}
