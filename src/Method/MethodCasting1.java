package Method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number=1.5;
        //pringNumber(number);//컴파일 오류가 발생함
        printNumber((int)number);//명시적 형변환

    }
    public static void printNumber(int n){
        System.out.println("숫자: "+n);
    }
}
