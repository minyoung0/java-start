package Array;

public class EnhanceFor1 {

    //향상된 for문
    //for(변수:배열 또는 컬렉션){
    // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
    // }

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        for(int i=0;i<numbers.length;i++)
        {
            int number=numbers[i];
            System.out.println(number);
//            System.out.println(numbers[i]);
        }

        //향상된 for문, f or-each문
        for(int number:numbers){
            // :의 오른쪽에 탑색할 배열을 선택, :의 왼쪽엔 반복할 때마다 찾은 값을 저장할 변수를 선언
            // numbers 배열의 끝에 도달해서 더 값이 없으면 for문이 완전히 종료된다.
            System.out.println(number);
        }//사용할 수 없는 경우: 증가하는 index 값이 필요할때



       // 단축키 iter
        //단축키 itar
    }
}
