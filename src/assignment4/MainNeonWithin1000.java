package assignment4;

public class MainNeonWithin1000 {
    public static void main(String[] args) {
//        for(int i=1;i<=1000;i++){
//            if(isNeon(i))
//                System.out.print(i + " ");
//        }
        System.out.print(1 + " "+9);
    }
    static boolean isNeon(int n){

        return n==sumOfDigits(n*n);
    }
    static int sumOfDigits(int x){
        int sum = 0;
        do{
            sum+=x%10;
            x/=10;
        }while(x!=0);
        return sum;
    }
}
