package Method;

public class method1ref {
    public static void main(String[] args) {
        //계산1
//        int a=1;
//        int b=2;
//        System.out.println(a+"+"+b+"연산 수행");
//        int sum1=a+b;
//        System.out.println("결과1 출력: "+sum1);

        int sum1=add(1,10);
        System.out.println("결과 1 출력: "+sum1);


        //계산2
//        int x=10;
//        int y=20;
//        System.out.println(x+"+"+y+"연산 수행");
//        int sum2=x+y;
//        System.out.println("결과2 출력: "+sum2);

        int sum2=add(10,20);
        System.out.println("결과2 출력: "+sum2);
    }

    //add 메서드
    public static int add(int a, int b){
        System.out.println(a+"+"+b+"연산 수행");
        int sum=a+b;
        return sum;

    }
}

