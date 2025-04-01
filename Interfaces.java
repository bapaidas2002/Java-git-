interface Animal {
    public void SayHi(){
        System.out.println("hii");
    }

} 
interface Mamals{
    public void SayHello(){
        System.out.println("hello");
    }
}
class Dog extends Animal , Mamals{
    public void Fn(){
        SayHi();
        SayHello();
    }

}
class Interfaces{
    public static void main(String args[]){
        Dog tommy = new Dog();
        tommy.Fn();
    }
}