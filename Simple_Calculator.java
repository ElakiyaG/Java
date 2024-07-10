import java.util.*;
class operation{
    String symbol;
    void ans(float a,float b){
        if(symbol.equals("+"))
            System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
        else if(symbol.equals("-"))
            System.out.println("Subraction of "+a+" and "+b+" is "+(a+b));
        else if(symbol.equals("*"))
            System.out.println("Multiplication of "+a+" and "+b+" is "+(a+b));
        else if(symbol.equals("/"))
            System.out.println("Division of "+a+" and "+b+" is "+(a+b));
        else if(symbol.equals("%"))
            System.out.println("Modulus of "+a+" and "+b+" is "+(a+b));
        else
            System.out.println("Operation not Found!...");
    }
    void ans(float x,float y,float z){
        if(symbol.equals("+"))
            System.out.println("Addition of "+x+" , "+y+" and "+z+" is "+(x+y+z));
        else if(symbol.equals("-"))
            System.out.println("Subraction of "+x+" , "+y+" and "+z+" is "+(x-y-z));
        else if(symbol.equals("*"))
            System.out.println("Multiplication of "+x+" , "+y+" and "+z+" is "+(x*y*z));
        else if(symbol.equals("/"))
            System.out.println("Division of "+x+" , "+y+" and "+z+" is "+(x/y/z));
        else if(symbol.equals("%"))
            System.out.println("Modulus of "+x+" , "+y+" and "+z+" is "+(x%y%z));
        else
            System.out.println("Operation not Found!...");
    }
}
public class Simple_Calculator {
    public static void main(String args[]){
        operation op=new operation();
        Scanner scan=new Scanner(System.in);
        System.out.println("---------SIMPLE ARITHMETIC CALCULATOR---------");
        System.out.println("Enter whether you need to preform operation with 2 0r 3 numbers: ");
        int no= scan.nextInt();
        if(no==2) {
            System.out.println("Enter a number for operation: ");
            float a = scan.nextFloat();
            System.out.println("Enter another number for operation: ");
            float b = scan.nextFloat();
            System.out.println("Enter symbol for operation to perform(+,-,*,/,%): ");
            scan.nextLine();
            op.symbol=scan.nextLine();
            op.ans(a,b);
        }
        else if(no==3) {
            System.out.println("Enter first number for operation: ");
            float c = scan.nextFloat();
            System.out.println("Enter second number for operation: ");
            float d = scan.nextFloat();
            System.out.println("Enter third number for operation: ");
            float e = scan.nextFloat();
            System.out.println("Enter symbol for operation to perform(+,-,*,/,%): ");
            scan.nextLine();
            op.symbol=scan.nextLine();
            op.ans(c,d,e);
        }
    }
}
