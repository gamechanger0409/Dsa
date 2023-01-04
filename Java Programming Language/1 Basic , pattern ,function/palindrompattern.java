public class main{
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++)
    {  // for space
        for(int j=i;j<=n-1;j++){
            System.out.print(" ");
            
        }
        //for desc. number to 1
        for(int j=i;j>=1;j--){
            System.out.print(j);
       }
       // for asc. number
       for(int j=2;j<=i;j++){
        System.out.print(j);
       }
        System.out.println();
    }

    }
}