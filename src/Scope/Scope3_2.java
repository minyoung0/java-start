package Scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m=10;
        if(m>0){
            int temp=m*2;
            System.out.println("temp="+temp);
            // if 안에서만 사용할 temp 변수를 main에 선언하면 메모리가 낭비됨.
        }
        System.out.println("m="+m);
    }
}
