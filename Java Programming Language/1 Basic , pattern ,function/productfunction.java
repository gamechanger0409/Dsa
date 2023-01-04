import java.util.*;
public class Main{

    public static float multiply(float no1 , float no2){
        float product = no1 * no2;
        return product;
    }
    public  static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float product = multiply(n1,n2);
        System.out.println(product);
    }
}

