package Array;

import java.util.Scanner;

public class ArrayEx7Ref {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);

        int[][] students=new int[4][3];
        int[] total=new int[4];
        double[] avg=new double[4];
        String[] subject={"국어","영어","수학"};

        for(int i=0;i<students.length;i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            for(int j=0;j<students[i].length;j++){
                System.out.print(subject[j]+" 점수:");
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
