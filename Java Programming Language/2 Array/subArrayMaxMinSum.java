import java.util.*;
public class main{
    public static void subArray(int arr[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum =0;
                for(int k=i;k<=j;k++){
                    currsum = currsum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                if(currsum >= maxSum)
                maxSum = currsum;
                if(currsum <= minSum)
                minSum = currsum;
                System.out.println(" = " + currsum);
            }
            System.out.println();
        }
        System.out.println("Maximum sum =" + maxSum);
        System.out.println("Minimum sum =" + minSum);

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,1,10};
        subArray(arr);
    }

}