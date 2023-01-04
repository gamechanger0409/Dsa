import java.util.*;
public class Strings{
    public static void print(String str){
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
          //  if(str.charAt(i)== 'H')
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String s = "Himanshu";
        System.out.print("Enter Secocnd string- ");
        String str = sc.nextLine();
        System.out.println(s.charAt(2));
        String s2 = s + " " + str;
        System.out.println(s2);
       print(s2);

    }
}