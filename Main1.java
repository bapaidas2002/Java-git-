class A{
    double x , y;
    A(double x , double y){
        this.x=x;
        this.y=y;
    }
    public double Sum2D(){
        return x+y;
    }
}
class B{
    double x , y, z;
    B(double x , double y , double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double Sum3D(){
        return x+y+z;
    }
}
class Main1{
    public static void main(String[] args) {
        A a1=new A(2.0,3.1);
        B b1=new B(3.2,4.2,5.3);
        System.out.println("the sum is : "+a1.Sum2D());
        System.out.println("the sum is : "+b1.Sum3D());
    }
}