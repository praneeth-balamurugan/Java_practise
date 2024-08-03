package sorting;

public class bubble {

    public static void main(String args[]){

    int[] arr={5,4,3,2,1,9};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;}
        }
    }
    System.out.println("Sorted array is:"); 
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
}

}