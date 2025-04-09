public interface A {
    String name ="bapai";    
}
public interface B {
    int age = 22;
}
public interface C extends A,B{
    public void Display();
}

public class Interfaceee implements C {
    Void Display(){
        System.out.println("Name :" + name);
        System.out.println("Age : "+ age);
        System.out.println("example of multipe inheritance.");
    }
    
}
class Interface2 {
    public static void main(String args []){
        Interfaceee i1 = new Interfaceee();
        i1.Display();
    }

}
