package oops_concepts;
public class main{
    public static void main(String args[]){
        Student student1= new Student();       
        System.out.println(student1.roll);
        Student bp=new Student(80,"b praneeth",100.0f);


        System.out.println(bp.roll);
        System.out.println(bp.name);
       // bp.greet();
        bp.changename("praneeth");
        bp.greet();
        System.out.println(bp.name);
        System.out.println(bp.marks);

        Student v=new Student(80,"vigneshwar",100.0f);
        Student v2=new Student(v);
        System.out.println(v2.roll);
        System.out.println(v.roll);



    }

    static class Student{
        int roll;
        String name;
        float marks;

        Student(){
            System.out.println("default constructor");
            this.marks=0.0f;
            this.name="default";
            this.roll=0;
        }

        Student(int rollno,String naam,float m){
            System.out.println("parameterized constructor");
            this.marks=m;
            this.name=naam;
            this.roll=rollno;
            
        }
        Student(Student other){
            this.name=other.name;
            this.marks=other.marks;
            this.roll=other.roll;
        }
        void changename(String naam){
            this.name=naam;
        }
        void greet(){
            System.out.println("hello "+this.name);
        }
    }
}