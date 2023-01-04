import java.util.*;
public class loop {
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1 ");
        float a= sc.nextFloat();
        System.out.print("Enter no 2 ");
        float b= sc.nextFloat();
        System.out.print("Enter operator ");
        char operator= sc.next().charAt(0);
    switch(operator) {
        case '+':
            System.out.print(a+b);
            break;
        case '-':  
            System.out.print(a-b);
            break;
        case '*':
            System.out.print(a*b);
            break;
        case '/':
            System.out.print(a/b);
            break;
        case '%':
             System.out.print(a%b);
             break;
        default:
            System.out.print("Enter Valid operator");
            break;
    }
  
    }
}