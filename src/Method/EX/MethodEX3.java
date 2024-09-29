package Method.EX;

public class MethodEX3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = depositAmount(balance, 1000);//depositAmount한 새로운 balance를 업데이트
        balance = withdrawAmount(balance, 2000);
//        //입금
//        int depositAmount = 1000;
//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금하였습니다. 현재잔액: " + balance + "원");
//
//        //출금
//        int withdrawAmount = 2000;
//        if (balance >= withdrawAmount) {
//            balance = +withdrawAmount;
//            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
//        } else {
//            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다");
//        }
//        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int depositAmount(int balance, int deposit) {
        balance += deposit;
        System.out.println(deposit + "원을 입금하였습니다.현재 잔액: " + balance + "원");
        return balance;//새로운 balance 값
    }

    public static int withdrawAmount(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다");
        }
        return balance;

    }

}
