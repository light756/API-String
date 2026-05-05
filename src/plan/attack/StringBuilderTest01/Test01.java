package plan.attack.StringBuilderTest01;

public class Test01 {
    static void main() {
        //StringBuilder使用实验
        /*
            append()
            reverse()
            toString()
         */
        String s="aaabbbccc";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.append("ddd"));
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}
