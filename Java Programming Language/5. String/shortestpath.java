import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class main{
    public static float distance(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N')
            y++;
            else if(str.charAt(i) == 'S')
             y--;
             else if(str.charAt(i)=='E')
             x++;
            else 
            x--;
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X+Y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "WNEENESENNN";
        System.out.println(distance(str));
    }
}