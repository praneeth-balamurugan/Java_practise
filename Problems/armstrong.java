public  class armstrong{
    public static void main(String args[]){
        int n=153;
        int or=n;
        int sum=0;
        int rem,cube;
        while (n>0){
            rem=n%10;
            cube=rem*rem*rem;
            sum+=cube;
            n/=10;
        }
        if(sum==or){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }

    }
}