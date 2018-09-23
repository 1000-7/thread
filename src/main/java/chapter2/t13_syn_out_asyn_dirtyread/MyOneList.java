package chapter2.t13_syn_out_asyn_dirtyread;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList();

	synchronized public void add(String data) {
		list.add(data);
	};

	synchronized public int getSize() {
		return list.size();
	};

}
