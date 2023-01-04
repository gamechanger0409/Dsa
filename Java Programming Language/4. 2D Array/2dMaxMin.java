import java.util.*;
public class Array{
    public static int MaxMin(int arr[][]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        int n = arr.length;
        int m = arr[0].length;

       
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(Largest < arr[i][j] ){
                    Largest = arr[i][j];
                    
                }
                
                if(Smallest > arr[i][j])
                  Smallest = arr[i][j];
            }
        }
        System.out.println("Smallest no. is " + Smallest );
        return Largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};    
        System.out.print("Largest no. is "  + MaxMin(arr));
        
    }
}

