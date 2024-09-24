package Array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students;//배열 변수 선언
        students=new int[5];

        //변수 값 대입
        students[0]=90;
        students[1]=50;
        students[2]=60;
        students[3]=40;
        students[4]=80;


//        int student1=90;
//        int student2=10;
//        int student3=40;
//        int student4=50;
//        int student5=60;

        System.out.println("학생 1의 점수: "+students[0]);
        System.out.println("학생 2의 점수: "+students[1]);
        System.out.println("학생 3의 점수: "+students[2]);
        System.out.println("학생 4의 점수: "+students[3]);
        System.out.println("학생 5의 점수: "+students[4]) ;
    }
}
