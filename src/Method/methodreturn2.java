package Method;

public class methodreturn2 {
    public static void main(String[] args) {
        chechAge(10);
    }

    public static void chechAge(int age){
        if(age<19){
            System.out.println(age+"살, 미성년자는 출입이 불가능합니다.");
            return;
        }
        System.out.println(age+"살, 입장하세요.");


    }
}
