public class DoCalculation {
    public static void main(String[] args) {
        
        Calculator c1=new Calculator();

        System.out.println("Sum : "+c1.Addition(4, 5));
        System.out.println("Subtraction : "+c1.Subtraction(10, 6));
        System.out.println("Multiplication : "+c1.Multiplication(5, 2));
        System.out.println("Division : "+c1.Division(6, 3));
    }
    
}
class Calculator {
    public int Addition(int a ,int b){
        return a+b;
    }
    public int Subtraction(int a ,int b){
        return a-b;
    }
    public int Multiplication(int a ,int b){
        return a*b;
    }
    public int Division(int a ,int b){
        return a/b;
    }
  
       
}
