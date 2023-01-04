import java.util.*;
public class main{
    public static int binary(int number[], int key){
        int start = 0;
        int end = number.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key)
            return mid;
            if(number[mid]<key){
            start = mid+1;
            }
            else{
            end = mid-1;
            }  
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size-");
        int n = sc.nextInt();
     int number[] = new int[n];
     System.out.print("Enter sorted array elements-");
     for(int i=0;i<number.length;i++) {
        number[i] = sc.nextInt();
     }
     System.out.print("Enter key to search- ");
     int key = sc.nextInt();
     int ans = binary(number,key);
     if(ans == -1)
     System.out.print("key don't exist on array ");
     else
     System.out.print("Key found on array index- " + ans);
    }
}
       