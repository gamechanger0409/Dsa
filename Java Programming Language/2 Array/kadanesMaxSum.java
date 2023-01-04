import java.util.*;
public class main{
    public static void subArraySum(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
          //  System.out.println(cs);
           if(cs<0){
              cs=0;
            }
           ms =Math.max(cs,ms);
        }
        System.out.println("Max subarray sum = " + ms);
    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        subArraySum(arr);
    }
}