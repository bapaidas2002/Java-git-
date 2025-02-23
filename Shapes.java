class Shapes{
    public static void main(String[] args) {
        Box b1 = new Box(10,20,30);
        b1.area();
        b1.volume();
        b1.area(8, 12);
        b1.volume(10,12 , 15);

        Circle c1 = new Circle(2.1);
        c1.area();
        c1.volume();
        c1.area(10.0);
        c1.volume(12);
    }
}

class Box{
    double ar,vol,height,length,breadth;
    Box(double length,double breadth,double height){
        this.breadth=breadth;
        this.length=length;
        this.height=height;
    }
    public void area(){
        ar=length*breadth;
         System.out.println("Area of Box (type constructor) : "+ar);
    }
    public void volume(){
        vol=length*breadth*height;
        System.out.println("Volume of Box (type constructor) : "+vol);
    }
    public void area(double length,double breadth){
        this.breadth=breadth;
        this.length=length;
        ar=length*breadth;
        System.out.println("Area of Box (type method) : "+ar);
}
public void volume(double length,double breadth,double height){
    this.breadth=breadth;
    this.length=length;
    this.height=height;
   vol=length*breadth*height;
   System.out.println("Volume of Box (type method) : "+vol);
}
}
class Circle{
    double ar,vol,radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        ar=2*(22/7)*radius;
        System.out.println("Area of circle (type constructor) : "+ar);
    }
    public void volume(){
        vol=(22/7)*radius*radius;
        System.out.println("Area of circle (type constructor) : "+vol);
    }
    public void area(double radius){
        this.radius=radius;
        ar=2*(22/7)*radius;
        System.out.println("Area of circle (type method) : "+ar);
    }
    public void volume(double radius){
        this.radius=radius;
        vol=(22/7)*radius*radius;
        System.out.println("Area of circle (type method) : "+ vol);
    }

}