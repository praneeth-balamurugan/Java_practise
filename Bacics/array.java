import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        // int[] arr=new int[5];
        // for (int i=0;i<5;i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        // for (int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }

        int[][] a2=new int [2][2];
        for (int row=0;row<a2.length;row++){
            for(int col=0;col<a2.length;col++){
                a2[row][col]=sc.nextInt();
            }
        }
        for (int row=0;row<a2.length;row++){
            for(int col=0;col<a2.length;col++){
                System.out.print(a2[row][col]+" ");
            }
            System.out.println();
        }
        for (int row=0;row<a2.length;row++){
            System.out.println(Arrays.toString(a2[row]));
        }
        for( int[] row:a2){
            System.out.println(Arrays.toString(row));
        }

    }
    
}
