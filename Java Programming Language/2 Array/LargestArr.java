import java.util.*;

public class main{
    public static int Largest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
     for(int i=0; i<number.length; i++){
        if(largest<number[i])
        largest = number[i];
        if(smallest > number[i])
        smallest = number[i];
       }
       System.out.println("Smallest no. =" + smallest);
        return largest;
       }

    public static void main(String args[]){
        int number[] = {2,4,6,8,6,5,13};
        int result = Largest(number);
        System.out.println("Largest number = " + result);
    
        
    }
}