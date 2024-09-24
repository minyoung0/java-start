package Array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);

        int[][] students=new int[4][3];
        int[] total=new int[4];
        double[] avg=new double[4];


        for(int i=0;i<students.length;i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            for(int j=0;j<students[i].length;j++){
                if(j==0)
                {
                    System.out.print("국어점수: ");
                }
                else if(j==1)
                {
                    System.out.print("영어점수: ");
                }
                else{
                    System.out.print("수학점수: ");
                }
                students[i][j]=score.nextInt();
                total[i]+=students[i][j];

            }
            avg[i]=(double)total[i]/3;
        }

        for(int k=0;k<students.length;k++){

                System.out.println((k+1)+"번 학생의 총점: "+total[k]+", 평균: "+avg[k]);
        }

    }
}
