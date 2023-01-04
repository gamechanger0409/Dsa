import java.util.*;
public class main{
    public static boolean nums(int arr[]){
        boolean isRepeat = false;
       int n = arr.length;
        for( int i=0;i<arr.length;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i] == arr[j])
            isRepeat = true;
            }
        }
        return isRepeat;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    arr[i] = sc.nextInt();
    System.out.print(nums(arr));
    
}
}