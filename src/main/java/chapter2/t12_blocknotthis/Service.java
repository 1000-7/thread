package chapter2.t12_blocknotthis;

public class Service {

	private String usernameParam;
	private String passwordParam;
	private String anyString = new String();//这一句放这就是顺序

	public void setUsernamePassword(String username, String password) {
		try {
//			String anyString = new String();//这一句放方法里就是异步执行了效果
			synchronized (anyString) {
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
