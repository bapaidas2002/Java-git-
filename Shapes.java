class Shapes{
    public static void main(String[] args) {
        Box b1 = new Box(10,20,30);
        b1.area();
        b1.volume();
        b1.area(8, 12);
        b1.volume(10,12 , 15);

        Circle c1 = new Circle(2.1);
        c1.area();
        c1.circumference();
        c1.area(10.0);
        c1.circumference(12);
        b1.l=10;b1.b=20;b1.h=30;
        System.out.println("Area of Box (type variable) : "+b1.area2());
        System.out.println("volume of Box (type variable) : "+b1.volume2());
        c1.r=10;
        System.out.println("Area of Circle (type variable) : "+c1.area2());
        System.out.println("Circumference of Circle (type variable)"+c1.circumference2());
    }
}

class Box{
    double ar,vol;
    double height,length,breadth;
    double h,l,b;
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
    public double area2(){
         return l*b;
    }
    public double volume2(){
       return l*b*h;
    }
}

class Circle{
    double ar,vol,radius;
    double r;
    Circle(double radius){
        this.radius=radius;
    }
    public void circumference(){
        ar=2*(22/7)*radius;
        System.out.println("Circumference of circle (type constructor) : "+ar);
    }
    public void area(){
        vol=(22/7)*radius*radius;
        System.out.println("Area of circle (type constructor) : "+vol);
    }
    public void circumference(double radius){
        this.radius=radius;
        ar=2*(22/7)*radius;
        System.out.println("Circumference of circle (type method) : "+ar);
    }
    public void area(double radius){
        this.radius=radius;
        vol=(22/7)*radius*radius;
        System.out.println("Area of circle (type method) : "+ vol);
    }
    public double circumference2(){
        return 2*(22/7)*r;        
    }
    public double area2(){
        return (22/7)*r*r;
    }

}