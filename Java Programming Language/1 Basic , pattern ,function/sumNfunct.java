import java.util.*;
public class main{
    public static int sumN(int n1){
        int sum =0;
        for(int i=0;i<=n1;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 5;
        System.out.println(ans);
        ans = sumN(a);
        System.out.print(ans);

    }


    }
