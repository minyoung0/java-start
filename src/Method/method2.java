package Method;

public class method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader(){//반환타입이 없는 경우에는 void로 정의
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }
    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다 =");
        return;
    }
}
