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
        A a1=new A();
        B b1=new B();
        a1.x=2;
        a1.y=3;
        b1.x=3;
        b1.y=4;
        b1.z=5;
        System.out.println("the sum is : "+a1.Sum2D());
        System.out.println("the sum is : "+b1.Sum3D());
    }
}