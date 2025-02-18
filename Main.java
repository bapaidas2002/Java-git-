class A{
    double x , y;
    A(double x , double y){
        this.x=x;
        this.y=y;
    }
    public void point2D(){
        System.out.println("The coordinates are : "+ x + " and "+ y);
    }
}
class B{
    double x , y, z;
    B(double x , double y , double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void point3D(){
        System.out.print("The coordinates are : "+x+" and "+y+" and "+z);
    }
}
class Main{
    public static void main(String[] args) {
        A a1=new A(2.0,3.1);
        B b1=new B(3.2,4.2,5.3);
        a1.point2D();
        b1.point3D();
    }
}