package chapter3.t11_ThreadLocal.initValue;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
