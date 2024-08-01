package oops_concepts;

public class multi_inheritance {
    public static void main(String[] args) {

        Boxs b=new Boxs(9,0,3);
        b.h=10;
        System.out.println(b.h);
        Boxsweight bb=new Boxsweight(3,3,2,2);
        bb.b=11;
        System.out.println(bb.b);
        BoxPrices bbb=new BoxPrices(4,2,4,5,8);
    }

   static class Boxs {
        int h;
        int w;
        int b;

        Boxs(int b,int h,int w) {
            this.b = 0;
            this.h = 0;
            this.w = 0;
        }
    }

    static class Boxsweight extends Boxs {
        int weight;

        Boxsweight(int b, int h, int w, int weight) {
            super( b, h,w);
            this.weight = 0;
        }
    }

    static class BoxPrices extends Boxsweight{
        int price=0;

        BoxPrices(int b, int h, int w, int weight,int price){
            super(b, h, w,weight);
            this.price=0;
        }
    }

}
