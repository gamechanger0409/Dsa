import java.util.*;
public class Array{
    public static int count(int arr[][], int key){
        int c=0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j] == key) 
            c++; 
        }
       }
       return c;
         }

         public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int arr[][] = {{10,20,30,40},
                           {15,25,20,45},
                           {27,20,37,48},
                           {32,33,39,20}};
            int key = 20;
             System.out.print("No. Exist  " + count(arr,key) + " times");
        }
    }

    
