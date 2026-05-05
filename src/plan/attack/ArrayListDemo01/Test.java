package plan.attack.ArrayListDemo01;

import java.util.ArrayList;

public class Test {
    static void main() {
        //测试集合Arraylist
        /*测试增删改查功能
        * add()
        * add(index,e)
        * remove(Object)
        * remove(index)
        * set(index,e)
        * get(index)
        * size()*/
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add(1,"world");
        list.add("java");
        System.out.println(list);
        list.remove("java");
        System.out.println(list);
        list.add(2,"java");
        list.remove(2);
        list.add(2,"java");
        list.set(0,"java");
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            list.set(i,"nothing");
            System.out.println(list.get(i));
        }
    }
}
