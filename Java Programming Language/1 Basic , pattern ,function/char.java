import java.util.*;
public class main{
    public static void main(String args[]){
        char ch = 'Z';
        int n =4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
    }