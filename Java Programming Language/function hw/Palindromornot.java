import java.util.*;
public class Java{
    public static boolean palindrom(int n){
        boolean isPalin = true;
        int revno = 0;
        int N = n;
        while(n>0){
            int lastdigit = n%10;
            revno = (revno*10) + lastdigit;
            n=n/10;
        }
        if(N == revno){
         return isPalin;
        }
        else{
      isPalin = false;
    }
    return isPalin;
}
    public static void main(String args[]){
       boolean ans= palindrom(4557);
       if (ans == true)
        System.out.println("No. is Palindrom");
        else
        System.out.println("No. is not palindrom");

    }
}