package plan.attack.APITestString03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //字符串实验——计算字符串内部数组、大写字母、小写字母的数量
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count_num = 0;
        int count_upper = 0;
        int count_lower = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                count_num++;
            }
            else if (c >= 'a' && c <= 'z') {
                count_lower++;
            }
            else if (c >= 'A' && c <= 'Z') {
                count_upper++;
            }
        }
        System.out.println("数字：" + count_num);
        System.out.println("大写字母：" + count_upper);
        System.out.println("小写字母：" + count_lower);
    }
}
