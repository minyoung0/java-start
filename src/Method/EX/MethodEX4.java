package Method.EX;

import java.util.Scanner;

public class MethodEX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("------------------------------------------");
            int num = scanner.nextInt();

            if (num == 1) {//deposit
                System.out.print("입금할 금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);

            }
            else if (num == 2) {//withdraw
                System.out.println("출금할 금액을 입력하세요: ");
                int amount=scanner.nextInt();
                balance=withdraw(balance,amount);
            }
            else if (num == 3) { //checkBalance
                checkBalance(balance);
            }
            else if (num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 번호를 입력해주십시오.");
                continue;
            }

        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원 입금되었습니다.");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("출금할 금액이 모자랍니다");
        }
        return balance;
    }

    public static void checkBalance(int balance) {
        System.out.println("현재 잔액은: " + balance + "원 입니다..");
    }


    //switch 문을 사용해서도 작성 가능
    //case 1,2,3,4 or default

}
