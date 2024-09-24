package scanner;

import java.util.Scanner;

public class scannerwhileEx3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int count=0;//횟수
        int total=0;//모든 수의 합
        double avg=0;



        while(true){//while((input=scanner.nextInt())!=-1)

            System.out.print("숫자를 입력하세요.(입력을 중단하려면 -1을 입력하세요): ");
            int num=input.nextInt();
            if(num==-1)
            {
                break;
            }
            count++;
            total+=num;
        }
        //avg=total/count; int와 int의 계산이라서 소수점 날아감
        avg=(double)total/(double)count;
        System.out.println("입력한 숫자들의 합계:"+total);
        System.out.println("입력한 숫자들의 평균:"+avg);
    }





}
