public class PersonDetails {
    public static void main(String[] args) {
        Person p1 = new Person("Bapai", 22);
        Person p2 = new Person("Aakash", 20);
        p1.ShowDetails();
        p2.ShowDetails();
    }
    
}
class Person {
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
    public void ShowDetails(){
        System.out.println("Name of Person : "+name);
        System.out.println("Age of Person : "+ age);
    }

    
}
