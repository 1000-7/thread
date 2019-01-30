package chapter6.t07_staticCode;

public class MyObject {

	private static MyObject instance = null;

	private MyObject() {
	}

	static {
		System.out.println("lsdfsfdsf");
		instance = new MyObject();
	}

	public static MyObject getInstance() {
		System.out.println("现在返回");
		return instance;
	}

}
