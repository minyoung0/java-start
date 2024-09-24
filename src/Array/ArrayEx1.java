package Array;

public class ArrayEx1 {
    public static void main(String[] args) {
         int[] students=new int[]{90,80,70,60,50};

         int total=0;
         double avg=0;

        for (int student : students) {
            total += student;

        }
        avg=(double)total/students.length;
        System.out.println("점수 총합: "+total);
        System.out.println("점수 평균: "+avg);



    }
}
