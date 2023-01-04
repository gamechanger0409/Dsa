import java.util.*;
public class Array{
    public static int sum(int arr[][]){
        int sum =0;
        int s2= 0;
    int n = arr.length;
    int m = arr[0].length;
    
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(i==1)
            sum+=arr[i][j];
            if(j==2)
            s2+=arr[i][j];
        }
      }
      System.out.println("Sum of column 3 =" + s2);
      return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,4,9},
                       {11,4,3},
                       {2,2,3}};  
         System.out.println("Sum of row 2= " + sum(arr));
  
    }
}