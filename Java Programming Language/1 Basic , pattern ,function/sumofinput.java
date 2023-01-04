import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        for(int i=0;i<=n;i++)
        { while(n>0){ // for n=1 it is important exception 123
            int temp = n%10;
            sum=sum+temp;
            n=n/10;
        }

        }
        System.out.println(sum);

    }
}