package chapter2.t13_syn_out_asyn_dirtyread;

public class MyService {

	/**
	 * @param list
	 * @param data
	 * @return
	 * 不对list加synchronize关键字两个都会添加到list
	 * 加了之后先加了一个不会再加了
	 */
	public MyOneList addServiceMethod(MyOneList list, String data) {
		try {
			synchronized (list) {
				if (list.getSize() < 1) {
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}

}
