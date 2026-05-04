package plan.attack;

import java.util.Random;

public class APITestRandom01 {
    public static void main(String[] args) {
        //测试JAVA API-Random的用法
        //1、创建Random对象
        Random r = new Random();
        //2、获取随机数
        int num = r.nextInt(10);
        System.out.println(num);
        //3、获取0-1之间的随机数
        double num2 = r.nextDouble();
        System.out.println(num2);
        //4、获取其它范围的double随机数
        double num3=r.nextDouble(1.3,5.3);
        System.out.println(num3);
    }
}
