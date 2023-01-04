import java.util.*;
public class Main {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter number to reverse ");
       int n= sc.nextInt();
       while(n>0)
       { int lastdigit = n%10;
        System.out.print(lastdigit);
        n=n/10;
    }

    }
}