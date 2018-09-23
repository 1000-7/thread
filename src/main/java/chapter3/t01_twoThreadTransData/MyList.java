package chapter3.t01_twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public void add() {
        list.add("高洪岩");
    }

    public int size() {
        return list.size();
    }

}
