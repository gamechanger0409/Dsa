 import java.util.*;
 public class main{
    public static String toUpper(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
            }  
            else
            sb.append(str.charAt(i));                              //space is not the last element 
        }
        return sb.toString();
    }
public static void main(String args[]){
    String str = "hi, i am boss ";
    System.out.print(toUpper(str));
}
 }