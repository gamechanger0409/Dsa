import java.util.*;
public class main{
    public static String remove(String str){
        String newStr = new String("");
        for(int i=0;i<str.length();i++){
            if(newStr.contains("" + str.charAt(i))){

            }
            else
            newStr+=str.charAt(i);
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "aababddeecd";
        System.out.print(remove(str));

    }
}