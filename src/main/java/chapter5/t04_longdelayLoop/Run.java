package chapter5.t04_longdelayLoop;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    //时间间隔
    private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(year, month, day, 23, 35, 00);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date().toLocaleString());
        timer.schedule(task, calendar.getTime(), PERIOD_DAY);
    }
}
