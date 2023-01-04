import java.util.*;
public class Array2d{
    public static boolean Search(int arr[][], int key){
        int n = arr.length;
        int m = arr[0].length;  //no of coloumn
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j] == key){
                    System.out.println("Found on (" + i + " , " + j + ")");  
                    return true;
                }
            }
        }
        System.out.print("Key not found ");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.print("Enter 2d array " + (n*m) + " elements - ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter key- ");
        int key = sc.nextInt();
        Search(arr,key);
    }
}