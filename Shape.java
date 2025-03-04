import java.util.Scanner;

class Circle2 {
	double radius;
	Circle2(){
		this.radius=5;
	}
	Circle2(double radius){
		this.radius=radius;
	}
	public double circumference(){
		return 2*Math.PI*this.radius;
	}
	public  double area(){
		return Math.PI*radius*radius;
	}
    public  double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

class Box2 {
	double height,depth,width;
	Box2(double height,double depth, double width){
		this.height=height;
		this.depth=depth;
		this.width=width;
	}
	public double area(){
		return this.height*this.depth;
	}
	public double volume(){
		return this.height*this.depth*this.width;
	}
    public double area(double height, double depth) {
        return height * depth;
    }

    public double volume(double height, double depth, double width) {
        return height * depth * width;
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=in.nextDouble();
		Circle2 c=new Circle2(r);
		System.out.println("Enter the Box dimensiton : Height, Width and Depth:");
		double h=in.nextDouble();
		double w=in.nextDouble();
		double d=in.nextDouble();
		Box2 box= new Box2(h,w,d);
		
		System.out.println("Circumference:\t"+c.circumference());
		System.out.println("Circumference:\t"+c.circumference(55));
		System.out.println("Area:\t"+c.area());
		System.out.println("Area:\t"+c.area(5.6));
		System.out.println("Box area:\t"+box.area());
		System.out.println("Box area:\t"+box.area(4,6.5));
		System.out.println("Box Volume:\t"+box.volume());
		System.out.println("Box Volume:\t"+box.volume(5,7,9));
		
	}
}