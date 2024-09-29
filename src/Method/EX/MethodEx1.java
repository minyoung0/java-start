package Method.EX;

public class MethodEx1 {
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값: " + average);
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값: " + average);
//    }

    public static void main(String[] args) {

//        System.out.println("a=1, b=2, c=3일 때 합계: "+sum(1,2,3)+", 평균: "+average(sum(1,2,3)));
//        System.out.println("x=15, y=25, z=35일 때 합계: "+sum(15,25,35)+", 평균: "+average(sum(15,25,35)));

        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("합계: "+sum(a,b,c)+", 평균: "+average(sum(a,b,c)));

        int x = 15;
        int y = 25;
        int z = 35;
        System.out.println("합계: "+sum(x,y,z)+", 평균: "+average(sum(x,y,z)));

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum) {
        return sum / 3.0;
    }


}
