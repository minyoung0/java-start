package Array;

public class Array1Ref4 {
    public static void main(String[] args) {
//        int[] students;//배열 변수 선언
//        students=new int[]{90,80,70,30,40};
//        int[] students= new int[]{90,80,40,30,20};
        int[] students={90,80,70,40,30};
        // int[]students;
        //students={90,80,70,30,40}--> 이 형식은 x

        //변수 값 대입
//        students[0]=90;
//        students[1]=50;
//        students[2]=60;
//        students[3]=40;
//        students[4]=80;

//        int student1=90;
//        int student2=10;
//        int student3=40;
//        int student4=50;
//        int student5=60;

        for(int i=0;i<students.length;i++)
        {
            System.out.println("학생 "+(i+1)+"의 점수: "+students[i]);
        }


    }
}
