import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       int arr[] = {2,4,6,8,10};
        reverse(arr);
    }
    public static void reverse(int arr[]){
       int n=arr.length;
       int ms=Integer.MIN_VALUE;
       int cs=0;
       int prefix[] = new int[arr.length];
       prefix[0]=arr[0];
       for(int i=1;i<n;i++){
        prefix[i]= prefix[i-1]+arr[i];
       }
       
  
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){

        cs = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
        System.out.println(cs);
      if(cs>ms)
      ms=cs;
      
    }
  }
    System.out.println("MAx SUM =" + ms);
  }
}

    
