class DynamicMemDisp {
   public static void main(String[] args) {
    Super s1 = new Sub();
    s1.Display();
   }
}
class Super{
    void Display(){
        System.out.println("I am Super Class. ");   
    }
}
class Sub extends Super{
    void Display(){
        System.out.println("I am Sub Class. ");
    }
}
