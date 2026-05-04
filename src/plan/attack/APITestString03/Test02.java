package plan.attack.APITestString03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //字符串API实验——查找字符索引位置与遍历字符串
        String s = "hello world";
        System.out.println("索引“0”的字母 "+s.charAt(0));
        System.out.println("索引“1”的字母"+s.charAt(1));
        //打印字符串长度
        System.out.println("字符串长度："+s.length());
        //键盘录字符串，然后进行遍历打印
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        for(int i = 0;i < s1.length();i++){
            System.out.println(s1.charAt(i));
        }
        System.out.println("遍历结束");

    }
}
