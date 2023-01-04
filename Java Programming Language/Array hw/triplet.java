import java.util.*;
public class main{
    public static void triplet(int nums[]){
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j= i+1;j<n-1;j++){
                for(int k=j+1;j<n;j++){
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        triplet(nums);
    }
}