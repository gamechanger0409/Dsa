import java.util.*;
public class sumofN{
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
         System.out.print("Enter n number ");
    int n =  sc.nextInt();
    int sum=0;

    for (int i=0;i<=n;i++)
    {
    sum = sum+i;
    }
    System.out.print("Sum of "+ n + " number is: "+ sum);

 }
}