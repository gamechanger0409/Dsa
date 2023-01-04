import java.util.*;
public class main{

    
    public static void bin(int n)
    { int pow =0;
        int bin = 0;

         while(n>0){
            int rem = n%2;
          bin  = bin + (rem * (int)Math.pow(10,pow));
          n = n/2;
          pow++;
        }
        System.out.print(bin);
    }
       
    public static void main(String args[]){
    
        bin(11);
        
    }
}
