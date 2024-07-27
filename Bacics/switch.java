
import java.util.Scanner;

public class switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nn=sc.nextInt()
        switch(n){
        case 1-> {
            System.out.println("Monday");
            switch (nn) {
                case 1 -> System.out.println("First");
                case 2 -> System.out.println("Second");
                case 3 -> System.out.println("Third");
            }
        }

        case 2 ->{
            System.out.println("Tuesday");
        }
        default->System.out.println("Invalid");
    }
}
}