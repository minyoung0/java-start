package Array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3 2차원 배열

    int arr[][]=new int[5][8];
    int count=1;

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=count;
            count++;
            //arr[i][j]=count++;
        }
    }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
