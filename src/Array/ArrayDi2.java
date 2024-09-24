package Array;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2x3 2차원 배열

        int[][] arr=new int[][]{
                {1,2,3},
                {4,5,6}
        };


        for(int i=0;i<arr.length;i++)//행의 길이
        {
            for(int j=0;j<arr[i].length;j++)//그 행에서 열의 길이
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }



    }
}
