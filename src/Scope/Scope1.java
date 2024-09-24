package Scope;

public class Scope1 {
    public static void main(String[] args) {//지역변수 : 자기의 코드블록 안에서만 생존할 수 있음.
        int m=10;
        if(true){
            int x=20;
            System.out.println("if m="+m);
            System.out.println("if x="+x);
        }
        //System.out.println(x); -> x는 생존이 종료가 되서 사용할 수 없음
        System.out.println(m);
    }
}
