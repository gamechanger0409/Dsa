import java.util.*;
public class main{
    public static int countlower(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "";
        str = sc.next();
        System.out.print(countlower(str));
    }
}