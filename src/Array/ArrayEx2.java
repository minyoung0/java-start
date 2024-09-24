package Array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.print("정수 5개를 입력하세요: ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("출력");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
            if(j!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        //입력한 정수를 역순으로 출력
        System.out.println("역순 출력");
        for(int k=arr.length-1;k>=0;k--){
            System.out.print(arr[k]);
            if(k>0){
                System.out.print(", ");
            }
        }
    }
}
