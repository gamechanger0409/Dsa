import java.util.*;
public class Array{

public static int OptimiseDiagonalSum(int arr[][]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i][i];                              //i+j = n-1
                                                     //j= n-1-i
        if(i != arr.length-1-i)  {       //if(i!=j)
            sum+=arr[i][arr.length-1-i];
        }                               
    }
    return sum;
}


    public static int diagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j)
                sum+=arr[i][j];
                if((i+j) == arr.length-1)
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        // System.out.println(diagonalSum(arr));
        System.out.println(OptimiseDiagonalSum(arr));
    }
}