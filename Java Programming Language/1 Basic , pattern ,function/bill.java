import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item 1 price ");
        float n1 = sc.nextFloat();
        System.out.print("Enter Item 2 price ");
        float n2 = sc.nextFloat();
        System.out.print("Enter Item 3 price ");
        float n3 = sc.nextFloat();
        float amt = n1+n2+n3;
        float billamt = amt + (18/100f*amt);
        System.out.println("total amt = " + amt);
        System.out.print("total bill amt " + billamt);
    
        
    }
}