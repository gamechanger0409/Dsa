import java.util.*;
public class main{
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){     
            for(int j=i+1;j>0;j--){           
              
              if(arr[j]  < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
              }

            }
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,1,5,8,9};
        insertionSort(arr);
    }
}