import java.util.*;
public class main{
    public static void Pair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + " ," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total no. of pair= " + tp);
    }
public static void tp(int arr[]){
    int n = arr.length;
    int tp = n*(n-1)/2;
    System.out.print("Pair =" + tp);
}
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        Pair(arr);
      // tp(arr);

    }
}