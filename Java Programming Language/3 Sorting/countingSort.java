import java.util.*;
public class main{
    public static void countingSort(int arr[]){
        int Largest = Integer.MIN_VALUE;
        int N = arr.length;
        for(int i=0;i<N;i++){                    //range largest
            Largest = Math.max(Largest, arr[i]);
        }
        
        int count[] = new int[Largest+1];
        for(int i=0;i<count.length;i++){    // counting frequency array
            count[arr[i]]++;
        }

       int j=0;
       for(int i=0;i<N;i++){     //sort original array
        while(count[i]>0){  
            arr[j] = i;
            j++;
            count[i]--;
        }
       }
       for(int i=0;i<N;i++){
        System.out.print(arr[i]+ " ");
       }

    }
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
    }
}