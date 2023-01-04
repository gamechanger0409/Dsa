import java.util.*;
public class main{
    public  static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        do{
        System.out.print("Enter number but not mutilple of 10- ");
        int n = sc.nextInt();
          if(n%10 == 0)
            continue;
        System.out.println(n);
        } while(true);
  //System.out.print("You enter multiple of 10");

    }

}