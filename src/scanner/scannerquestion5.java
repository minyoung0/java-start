package scanner;

import java.util.Scanner;

public class scannerquestion5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1=scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2=scanner.nextInt();

        System.out.println("두 숫자 사이의 모든 정수는: ");
        if(num1<num2){
            for(int i=num1;i<=num2;i++)
            {
                System.out.print(i);
                if(i<num2) //or i !=num2
                {
                    System.out.print(",");
                }
            }
        }
        else{
            int temp=num1;
            num1=num2;
            num2=temp;
            for(int i=num1;i<=num2;i++)
            {
                System.out.print(i);
                if(i<num2)
                {
                    System.out.print(",");
                }
            }
        }

    }
}
