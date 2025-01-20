import java.util.Scanner;
public class Addition {
    public  void add(int a , int b) {
        int c ;
        c=a+b;
        System.out.println("The Sum of Two number is : "+c);
    }
}
class DoAddition{
    public static void main(String[] args) {
        add ad=new add;
        Scanner sc=new Scanner;
        int num1,num2;
        System.out.println("Enter a number");
        num1=sc.nextInt();
        System.out.println("Enter another number");
        num2=sc.nextInt();
        ad.add(num1,num2);
    }
}