import java.util.*;
public class main{
    public static void reverse(int number[]){
        int first =0, last = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first]= temp;
            
            first++;
            last--;
        } 
    }
    public static void sortedarray(int number[]){
        for(int i = number.length-1;i>=0;i--){
           System.out.print(number[i] + " ");
        }

    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        //sortedarray(number);
       reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
    }
}