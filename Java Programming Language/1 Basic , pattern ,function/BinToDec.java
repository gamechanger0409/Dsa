import java.util.*;
public class main{
    public static void Dec(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int rem = n%10;
            dec = dec + (rem*(int)(Math.pow(2,pow)));
            n=n/10;
            pow++;
    
        }
        System.out.print(dec);
    }
    public static void main(String args[]){
    Dec(1011);
    }
    }
