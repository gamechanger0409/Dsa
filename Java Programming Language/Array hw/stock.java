import java.util.*;
public class main{
    public static int maxProfit(int price[]){
        int n = price.length;
   int maxProfit= 0;
   int buyPrice = Integer.MAX_VALUE;
   for(int i=0;i<n;i++){
    if( buyPrice < price[i]){  //profit condition
        int profit = price[i] - buyPrice; //today's profit
        maxProfit = Math.max(maxProfit , profit);
    }
    else {
         buyPrice = price[i];
    }
   }
   return maxProfit;
    }

    public static void main(String args[]){
        
        int price[] = {7,6,4,3,1};
        System.out.print(maxProfit(price));
    }
}