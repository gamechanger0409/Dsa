import java.util.*;
public class main{
  public  static int ncr(int n, int r)
    { int nfact =1;
    int rfact =1;
    int nmrfact =1;
    int N = n-r;
        for(int i=1;i<=n;i++){
            nfact = nfact*i;
        }
        for(int i=1;i<=r;i++){
             rfact = rfact*i;
        }
        for(int i=1;i<=N;i++){
             nmrfact = nmrfact*i;
        }
        int ncr = nfact/(rfact*nmrfact);
        return ncr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
      System.out.print(ncr(n,r));
    }
}
