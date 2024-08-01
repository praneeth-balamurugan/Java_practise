package oops_concepts;

public class inher {
    public static void main(String[] args) {
        Box b1=new Box(10, 10, 10);
        System.out.println(b1.h);

    }

   static class Box {
        int h;
        int w;
        int b;

        Box(int h, int w, int b) {
            this.h = h;
            this.w = w;
            this.b = b;
        }
    }

    class Boxweight extends Box {
        int weight;

        Boxweight(int h, int w, int b,int weight) {
            super(h, w, b);
            this.weight=weight;
        }
    }

}
