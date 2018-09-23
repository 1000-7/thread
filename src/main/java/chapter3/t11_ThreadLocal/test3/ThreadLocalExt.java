package chapter3.t11_ThreadLocal.test3;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
