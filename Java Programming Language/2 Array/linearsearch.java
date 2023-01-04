import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class main{
    public static int linearSearch(int number[], int key){
       for(int i=0; i<number.length; i++){
        if(number[i]==key)
        return i;
       }
        return -1;
       }

    public static void main(String args[]){
        int number[] = {2,4,6,8,6,5,1};
        int key = 1;
        int result = linearSearch(number,key);
        if(result == -1)
        System.out.println("Not Found ");
        else 
        System.out.println("Found on index " + result);
    }
}
      
    

       