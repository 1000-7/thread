package chapter2.t20_setNewPropertiesLockOne;

/**
 * 改变同一个对象，肯定同步呀，不管这个对象的字段属性有没有变。
 */
public class Service {

	public void serviceMethodA(Userinfo userinfo) {
		synchronized (userinfo) {
			try {
				System.out.println(Thread.currentThread().getName());
				userinfo.setUsername("abcabcabc");
				Thread.sleep(3000);
				System.out.println("end! time=" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
