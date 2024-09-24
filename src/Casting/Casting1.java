package Casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue=10;
        long longValue;
        double doubleValue;

        longValue=intValue;
        System.out.println("longvalue="+longValue);

        doubleValue=intValue;
        //doubleValue=(double)intValue;
        //doubleValue=(double)10;
        //doublevalue=10.0;
        System.out.println("doublevalue="+doubleValue);

        doubleValue=20L;
        System.out.println("doubleValue2="+doubleValue);
    }
}
