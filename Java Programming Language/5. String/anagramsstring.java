import java.util.*;
public class main{
    public static boolean anagrams(String s1, String s2){
       boolean isAnagrams = true;
       for(int i=0;i<s2.length();i++){
        if(s1.contains("" + s2.charAt(i))){

        }
        else
        return false;
       }
    return isAnagrams;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 ");
        String s1 = "";
        s1 = sc.next();
        System.out.println("Enter string 2 ");
        String s2 = "";
        s2 = sc.next();
        System.out.println(anagrams(s1,s2));


    }
}