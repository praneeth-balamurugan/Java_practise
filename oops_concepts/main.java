package oops_concepts;
public class main{
    public static void main(String args[]){
        // Student student1= new Student();
        // student1.roll=1;
        // student1.name="John";
        // student1.marks=90;


        Student bp=new Student(80,"praneeth",100.0f);


        System.out.println(bp.roll);
    }

    static class Student{
        int roll;
        String name;
        float marks;

        Student(int rollno,String naam,float marks){
            System.out.println("Default constructor called");
            this.marks=marks;
            this.name=naam;
            this.roll=rollno;
            
        }
    }
}