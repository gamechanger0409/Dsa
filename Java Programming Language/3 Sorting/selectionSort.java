import java.util.*;
public class main{
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){     //min Position
            int minPos = i;
            for(int j=i+1;j<n;j++){           // shortest from unsorted array
                if(arr[minPos] > arr[j]){ //chnge for desc;
                    minPos = j;
                }
            }
            int temp = arr[minPos];  //swap
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,1,5,8,9};
        selectionSort(arr);
    }
}