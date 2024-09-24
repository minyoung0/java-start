package scanner;

import java.util.Scanner;

public class scannerquestion4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("구구단으로 나타낼 정수를 입력하세요: ");
        int num=scanner.nextInt();


        for (int i=1;i<10;i++)
        {
            int mul=num*i;
            System.out.println(num+"*"+i+"="+mul);

        }
    }
}
