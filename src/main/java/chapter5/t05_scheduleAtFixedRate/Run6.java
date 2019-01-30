package chapter5.t05_scheduleAtFixedRate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run6 {
	private static Timer timer = new Timer();

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
				System.out.println("1 begin 运行了！时间为：" + new Date());
				System.out.println("1   end 运行了！时间为：" + new Date());
		}
	}

	public static void main(String[] args) {
		MyTask1 task1 = new MyTask1();
		System.out.println("现在执行的时间："+new Date());
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-20);
		timer.scheduleAtFixedRate(task1, calendar.getTime(), 5000);
	}
}
