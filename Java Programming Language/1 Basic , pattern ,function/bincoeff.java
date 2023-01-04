import java.util.*;
public class main{
    public static int bincoeff(int n, int r){
      int nfact = factorial(n);
      int rfact = factorial(r);
      int nmrfact = factorial(n-r);
      int ans = nfact/(rfact*nmrfact);
      return ans;
    }
    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++)
        { 
         fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Enter r ");
        int r = sc.nextInt();
        System.out.print("Biomial Coefficent of nCr=" + (bincoeff(n,r)));
    }
}