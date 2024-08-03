import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=n;row>=1;row++){
            for(int col=n;col>=row+1;col--){
                System.out.println(col+" ");
            }
            for(int col=row+1;col<=n;col++){
                System.out.println(col+" ");
            }
            System.out.println();
        }
        for(int row=2;row<=n;row++){
            for(int col=n;col>=row+1;col--){
                System.out.println(col+" ");
            }
            for(int st=1;st<=row*2-1;st++){
                System.out.println(row+" ");
            }
            for(int col=row+1;col<=n;col++){
                System.out.println(col+" ");
            }
            System.out.println();
        }
    }
    
}
