package chapter4.t06_someMethod.is.test3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		} finally {
			lock.unlock();
		}
	}

}
