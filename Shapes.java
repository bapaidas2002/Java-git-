class circle{
    circle(int r){
        this.r=r;
    }
    int area(int r){
        double ar = 3.14*r*r;
        return ar;
    }
    int circumference(int r){
        double circum =2*3.14*r;
        return circum;
    }
}
class Shapes{
    public static void main(String[] args) {
        circle c1 = new circle(10);
        c1.circumference(0)
    }
}