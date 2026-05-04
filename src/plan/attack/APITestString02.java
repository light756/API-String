package plan.attack;

public class APITestString02 {
    //本次实验，旨在测试不同的字符串对象创建方法
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = new String();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s3:  "+s3);
        char[] ch = {'h','e','l','l','o'};
        String s4 = new String(ch);
        System.out.println(s4);
        byte[] b = {97,98,99,100,101};
        String s5 = new String(b);
        System.out.println(s5);
    }
}
