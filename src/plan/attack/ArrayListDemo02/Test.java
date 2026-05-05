package plan.attack.ArrayListDemo02;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        //测试集合ArrayList储存Student类型的元素
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("12", "张三",114514);
        Student s2 = new Student("13", "li",1145);
        Student s3 = new Student("14", "wang",1919);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        //根据输入的id，查询其在ArrayList中的索引
        Scanner sc = new Scanner(System.in);
        //输入ID
        System.out.println("请输入ID：");
        String id = sc.next();
        int index=search(id, list);
        if (index != -1) {
            System.out.println("ID为" + id + "的索引为：" + index);
        } else {
            System.out.println("没有该ID");
        }
    }
    public static int search(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
