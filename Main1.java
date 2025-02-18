import java.util.Scanner;
class A{
    double x,y;
    public double Sum2D(){
        return x+y;
    }
}
class B{
    double x , y, z;
    
    public double Sum3D(){
        return x+y+z;
    }
}
class Main1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        A a1=new A();
        B b1=new B();
        System.out.println("Enter a number : ");
        a1.x=sc.nextDouble();
        System.out.println("Enter a number : ");
        a1.y=sc.nextDouble();
        System.out.println("Enter a number : ");
        b1.x=sc.nextDouble();
        System.out.println("Enter a number : ");
        b1.y=sc.nextDouble();
        System.out.println("Enter a number : ");
        b1.z=sc.nextDouble();
        System.out.println("the sum is : "+a1.Sum2D());
        System.out.println("the sum is : "+b1.Sum3D());
    }
}