
import java.util.Scanner;

public class fib{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int fib=sc.nextInt();
        for (int i=0;i<=fib;i++) {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;

        }


    }
}