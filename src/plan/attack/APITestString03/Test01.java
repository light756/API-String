package plan.attack.APITestString03;

import java.util.Scanner;

public class Test01 {
    static void main() {
        // 测试字符串常见的API——比较是否账号密码相同的实验
        String userName = "admin";
        String password = "000";
        Scanner sc = new Scanner(System.in);
        //给予三次输入账号密码的机会
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            if (name.equals(userName) && pwd.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("用户名或密码错误！");
            }
            if (i == 2) {
                System.out.println("登录失败！");
            }
        }
    }
}

