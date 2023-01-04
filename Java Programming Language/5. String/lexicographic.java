import java.util.*;
public class main{
    public static String lexico(String str[]){
        String largest = "";
        String smallest = "";
        largest = str[0];
        smallest = str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i])<0)       //<0 str1<str2
            largest = str[i];
            if(smallest.compareTo(str[i])>0)      //>0 str1>str2
            smallest = str[i];  
        }
        System.out.println("Smallest = " + smallest);
        return largest;
    }

    public static void main(String args[]){
        String str[] = {"apple", "mango" , "banana"};
        System.out.print(lexico(str));
    }
}