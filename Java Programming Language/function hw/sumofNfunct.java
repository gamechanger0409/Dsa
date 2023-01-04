import java.util.*;
public class main{
    public static int sum(int n){
        int sum =0;
        int k =n;
        while(n>0){
            int lastdigit = n%10;
             sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println("integer sum of no. " + k + " is " + sum);
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sum(123));
    }
}