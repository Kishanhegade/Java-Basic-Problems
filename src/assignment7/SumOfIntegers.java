package assignment7;

public class SumOfIntegers {
    public static void main(String[] args) {
        Object [] a={
                1,
                new int[]{1,2,3,4},
                "abc",
                10.0f,
                20.0,
                new Object[]{"142",8,10.0f}
        };
        printSum(a);
    }

    public static void printSum(Object[] a)
    {
        int sum=0;
        for(Object i:a){
            if(i instanceof Integer)
                sum+= (Integer) i;
            else if (i instanceof int[]) {
                int[] arr= (int[]) i;
                for (int j = 0; j < arr.length; j++) {
                    sum+=arr[j];
                }
            }
            else if(i instanceof Object[]){
                Object[] obj = (Object[]) i;
                for (int j = 0; j <obj.length ; j++) {
                    if (obj[j] instanceof Integer)
                        sum+=(Integer)obj[j];
                }
            }
        }
        System.out.println(sum);
    }
}
