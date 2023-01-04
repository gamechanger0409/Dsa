import java.util.*;
public class main{
    public static long sumPrime(int N){
        int sum =0;
        if(N==2)
        sum =2;
        else{
        for(int i=2; i<=N ;i++){
            if(isPrime(i)){
                sum = sum + i;
                
            }
        }
    }
         return sum;

    }
    public static boolean isPrime(int N){
        boolean isPrime = true;
        for(int i=2; i<N ;i++){
            if(N%i == 0){
                isPrime = false;
            }
    }
    return isPrime;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(sumPrime(N));
    }
}