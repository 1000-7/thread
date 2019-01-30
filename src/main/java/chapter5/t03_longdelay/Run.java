package chapter5.t03_longdelay;

import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("运行了！时间为：" + new Date());
		}
	}
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		DateFormat formatter = DateFormat.getDateTimeInstance();
		System.out.println("当前时间：" + formatter.format(new Date()));
		timer.schedule(task, 2000);
	}
}
