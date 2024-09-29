package Method.EX;

public class MethodEx2 {
    public static void main(String[] args) {

//        String message="Hello,world!";
//
//        for(int i=0;i<3;i++ ){
//            System.out.println(message);
//        }
//
//        for(int i=0;i<5;i++ ){
//            System.out.println(message);
//        }
//
//        for(int i=0;i<7;i++ ){
//            System.out.println(message);
//        }
        String message="Hello world!";
        roop(message,3);
        System.out.println();
        roop(message,5);
        System.out.println();
        roop(message,5);

    }

    public static void roop(String message, int a){
        for(int i=0;i<a;i++){
            System.out.println(message);
        }
    }
}
