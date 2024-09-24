package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scannerwhileex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(true)
        {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
            String name=scanner.nextLine();
            if(name.equals("종료"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;

            }


            System.out.print("나이를 입력하세요: ");
            int age=scanner.nextInt(); //nextInt는 10\n 중에 10만 가져가서 \n 이남아있는 채로 nextline으로 넘어가기때문에 두번째 반복문에서 이름 입력란이 안뜸
            scanner.nextLine();//여기서 \n을 날림

            System.out.println("입력한 이름: "+name+", 나이: "+age);

        }

    }
}
