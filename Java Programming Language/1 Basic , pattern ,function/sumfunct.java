import java.util.*;
public class main{
    public static int sumN(int n)
    { int sum =0;

        for(int i=0;i<=n;i++)
        { while(n>0){
            int temp= n%10;
          sum = sum + temp;
          n = n/10;
        }
    }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        System.out.print("Sum is " + sumN(num));
    }
}