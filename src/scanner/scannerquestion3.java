package scanner;

import java.util.Scanner;

public class scannerquestion3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요:");
        String foodName=scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice=scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity=scanner.nextInt();

        int price=foodPrice*foodQuantity;

        System.out.println(foodName+"을(를) "+foodQuantity+"개 주문하셨습니다.\n" +"총 가격은: "+price);
    }
}
