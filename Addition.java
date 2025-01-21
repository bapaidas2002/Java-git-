import java.util.Scanner;
class Addition1{
    public void add(int a , int b) {
        int c ;
        c=a+b;
        System.out.println("The Sum of Two number is : "+c);
    }
    public void sub(int a , int b){
        int c ;
        c=a-b;
        System.out.println("The Difference of Two number is : "+c);
    }
}
class Addition{
    public static void main(String[] args) {
        Addition1 ad=new Addition1();
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter a number");
        num1=sc.nextInt();
        System.out.println("Enter another number");
        num2=sc.nextInt();
        ad.add(num1,num2);
        ad.sub(num1,num2);
    }
}