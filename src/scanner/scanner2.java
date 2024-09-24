package scanner;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:" );
        int intValue=scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ") ;
        int intValue2=scanner.nextInt();

        int sum=intValue2+intValue;
        System.out.println("두 숫자의 합은?: "+ sum);
    }
}
