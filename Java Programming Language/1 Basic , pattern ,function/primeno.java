import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to check ");
        double n = sc.nextDouble();
        boolean prime = true;
        if(n==2)
        System.out.print("Prime Number ");
        else {
        //n = sq n * sq n  (After sq n= factors repeats for optimization)
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
           System.out.println("Not a Prime number ");
           prime= false;
           break;
           }
        }
        if (prime == true)
        System.out.print("Prime number ");
    }
          
    }
}