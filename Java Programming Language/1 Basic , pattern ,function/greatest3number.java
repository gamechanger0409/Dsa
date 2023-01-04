import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. 1 ");
        int a = sc.nextInt();
        System.out.print("Enter no. 2 ");
        int b = sc.nextInt();
        System.out.print("Enter no. 3 ");
        int c = sc.nextInt();
        if (a>=b && a>=c)
        System.out.print("number 1 is greatest that is " + a);
        else if (b>c)
        System.out.print("number 2 is greatest that is " + b);
        else 
        System.out.print("number 3 is greatest that is " + c);    

    }
}