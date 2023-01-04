import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isPrime(n));
    }
    public static boolean isPrime(int n){
        if (n==2)
        return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
}