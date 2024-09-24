package Array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);

        System.out.print("입력받을 학생의 수를 입력하시오: ");
        int number=score.nextInt();

        int[][] students=new int[number][3];
//        int[] total=new int[number];
//        double[] avg=new double[number];
        String[] subject={"국어","영어","수학"};


//        for(int i=0;i<students.length;i++){
//            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
//            for(int j=0;j<students[i].length;j++){
//                System.out.print(subject[j]+" 점수:");
//                students[i][j]=score.nextInt();
//                total[i]+=students[i][j];
//
//            }
//            avg[i]=(double)total[i]/3;
//        }
//        for(int k=0;k<students.length;k++){
//
//                System.out.println((k+1)+"번 학생의 총점: "+total[k]+", 평균: "+avg[k]);
//        }

        for(int i=0;i<number;i++)
        {
            System.out.print(number+"번 학생의 성적을 입력하세요: ");
            for(int j=0;j<3;j++){
                System.out.println(subject[i]+" 점수: ");
                students[i][j]= score.nextInt();
            }
        }


        for(int i=0;i<number;i++)
        {
            int total=0;
            for(int j=0;j<3;j++){
                total+=students[i][j];
            }
            double average=total/3;
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+average);
        }
    }
}
