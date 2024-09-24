package loop;

public class Count3 {
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");//println은 출력이후 다음 라인으로 넘어간다. 넘어가지 않으려면 print() 사용
            }
            System.out.println();
        }

    }
}
