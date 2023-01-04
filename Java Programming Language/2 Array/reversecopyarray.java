import java.util.*;

public class Java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }
       System.out.print("Array is sorted ");
      for(int i=n-1;i>=0;i--){
       System.out.print(number[i] + " ");
    }
}
}
