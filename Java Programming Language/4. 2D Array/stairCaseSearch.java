import java.util.*;
public class Array{
    public static boolean stairCaseSearch(int arr[][], int key){
        int row=0 , col = arr[0].length-1;
         while(row<arr.length && col>=0){
            if(key == arr[row][col]){
                System.out.println("Found on cell(" + row + ", " + col + ")");
                return true;
            }
            else if(key < arr[row][col])
                   col--;
            else 
                row++;        
            }

      System.out.print("Key not found ");
      return false;
         }

         public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int arr[][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
            int key = 33;
             stairCaseSearch(arr,key);
        }
    }

    
