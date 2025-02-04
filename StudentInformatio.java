import java.util.Scanner;
class Student {
    int eno;
    String name;
    float cgpa;
    void Display(){
        System.out.println("Student name is " + name);
        System.out.println("Student enrollment number is "+eno);
    }
    void Percentage(){
        float per;
        per = (cgpa *100)/10;
        System.out.println("Percentage of the student is "+per);
    }   
}
class StudentInformatio {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s1=new Student();
    Student s2=new Student();
    System.out.print("Enter name of student :");
    s1.name= sc.next();
    System.out.print("Enter enrollnment of student :");
    s1.eno= sc.nextInt();
    System.out.print("Enter cgpa of student :");
    s1.cgpa= sc.nextFloat();

    s1.Display();
    s2.Percentage();
    System.out.println("thank you");

    }

}