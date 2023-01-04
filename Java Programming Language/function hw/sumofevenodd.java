import java.util.*;
public class main{
    public static void sum(int n){
        int evensum=0;
        int oddsum=0;
        int N =n;
        while(n>0){
            int lastdigit = n%10;
            if(lastdigit %2 ==0){
                evensum= evensum + lastdigit;
            }
            else{
                oddsum= oddsum + lastdigit;
            }
            n = n/10;
        }
        System.out.println("Even int sum of no. " + evensum );
        System.out.println("Odd int sum of no. "  + oddsum );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }
}
