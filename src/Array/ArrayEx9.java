package Array;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int maxProducts=10;
        String[] name= new String[maxProducts];//제품 명
        int[] price= new int[maxProducts];//제품 가격
        int ProductCount=0;

       while(true)
        {
            System.out.println("1. 상품등록, 2. 상품 목록, 3. 종료");
            System.out.println("원하시는 메뉴를 선택해주세요.");
            int num=scanner.nextInt();
            scanner.nextLine();

            if(num==1){
                if(ProductCount>=maxProducts)
                {
                    System.out.println("더 이상 제품을 추가 할 수 없습니다.");//다시 while문으로
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                name[ProductCount]=scanner.nextLine();
                System.out.println();

                System.out.print("상품 가격을 입력하세요: ");
                price[ProductCount]=scanner.nextInt();
                System.out.println();
                ProductCount++;
            }
            else if(num==2){
                if(ProductCount==0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int j=0;j<ProductCount;j++)
                {
                    System.out.println((j+1)+".");
                    System.out.println("제품명: "+name[j]);
                    System.out.println("가격: "+price[j]);
                    System.out.println();
                }

            }
            else if(num==3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else{
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }


    }
}
