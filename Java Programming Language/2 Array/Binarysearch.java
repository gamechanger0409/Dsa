import java.util.*;
public class main{
    public static int binarySearch(int number[], int key){
        int start = 0; 
        int end = number.length-1;
        while(start<=end){

            int mid = (start+end)/2;
            if(number[mid]==key){  // found condition
                return mid;
            }
            if(number[mid]<key){ //second half
                start = mid+1;
            }
            else{              
                end = mid-1;    //first half
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,5,7,8,9,11,15};
        int key = 11;
        System.out.println("No. found on inder " + binarySearch(number,key));
    }
}