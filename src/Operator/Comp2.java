package Operator;

public class Comp2 {
    public static void main(String[] args) {
        //문자열이 같은지 확인하는 메서드는 .equals()

        String str1="문자열1";
        String str2="문자열2";

        boolean result1="hello".equals("hello");
        boolean result2=str1.equals("문자열1");
        boolean result3=str2.equals("문자열");

        System.out.println("result1 = "+result1);
        System.out.println("result2 = "+result2);
        System.out.println("result3 = "+result3);
    }
}
