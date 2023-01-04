import java.util.*;
public class main{
    public static void subArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
         
         prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
         prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println(currSum);
                if(maxSum < currSum)
                maxSum = currSum;
            }
        }
        System.out.print("Max sum =" + maxSum);
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,1,10};
        subArraySum(arr);
    }
}