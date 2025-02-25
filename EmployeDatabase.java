import java.util.Scanner;
class EmployeDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Details !");
    System.out.print("Enter name : ");
    String name =sc.nextLine();
    System.out.print("Enter Day of Birth : ");
    int day =sc.nextInt();
    System.out.print("Enter Month of Birth : ");
    int month =sc.nextInt();
    System.out.print("Enter Year of Birth : ");
    int year =sc.nextInt();
    System.out.print("Enter Mobile Number : ");
    Long mob =sc.nextLong();
    System.out.print("Enter Person ID : ");
    int id =sc.nextInt();
    System.out.print("Enter Salary : ");
    double sal =sc.nextDouble();
    Employe e1 = new Employe();
    Date dob =new Date(day,month,year);
    e1.GetEmployeData(name,mob,dob, id, sal);
    e1.DisplayEmploye();
    }

    
}
class Date{
    int d,m,y;
    Date(int d, int m,int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }
    public void DisplayDate(){
        System.out.println("DOB : "+d+"/"+m+"/"+y);
    }

}
class Person{
    String name;
    long number;
    Date dob;
    void GetPersonData(String n,long no,Date db){
        name=n;
        number=no;
        dob=db;
    }
    void DisplayPerson(){
        System.out.println("Name : "+name);
        dob.DisplayDate();
        System.out.println("Mobile no : "+number);
    }  
}
class Employe extends Person{
    int id ;
    double salary;
    void GetEmployeData(String n,long no,Date db,int id ,double salary){
        this.id=id;
        this.salary=salary;
        GetPersonData(n,no,db);
    }
    void DisplayEmploye(){
        DisplayPerson();
        System.out.println("Employe ID : "+id);
        System.out.println("Salary : "+salary);    
    }
}
