import java.util.*;
public class FactorialN {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate factorial ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        { 
            fact = fact*i;
        }
        System.out.print(fact);

    }
}