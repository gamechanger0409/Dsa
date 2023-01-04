public class main{
    public static int swap(int a, int b)
    {
         a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("inside the function a " + a);
       System.out.println("inside the function b " + b);
       return a;
    }

    public static void main(String args[])
    {
       int n1 = 10;
       int n2 = 5;
      n1=  swap(n1,n2);
     System.out.println("inside the main a " + n1);
     System.out.println("inside the main b " + n2);
     System.out.println("inside the main by return a " + n1);

    }
    }