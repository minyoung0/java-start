package Array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n=scanner.nextInt();

        System.out.println(n+"개의 정수를 입력하세요");

        int[] arr= new int[n];
        int minNum,maxNum=0;


        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        minNum=arr[0];
        maxNum=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]<minNum){
                minNum=arr[i];
            }
            else if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        System.out.println("가장 작은수는: "+minNum+", 가장 큰 수는: "+maxNum);


    }
}
