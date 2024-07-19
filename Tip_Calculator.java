import java.util.Scanner;
import java.util.Currency;
class calculator{
    void ans(String s,float bamt,float tamt,int no){
        if(s.equals("Dollar")){
            Currency curr = Currency.getInstance("USD");
            String currency = curr.getSymbol();
            System.out.println("The US Dollars of Indian Rupee for the Bill Amount is Rs."+bamt+" is "+currency+"."+(0.012*bamt));
            System.out.println("The US Dollars of Indian Rupee for the Tip Amount for 1 Person is Rs."+tamt+" is "+currency+"."+(0.012*tamt));
            System.out.println("The US Dollars of Indian Rupee for the Total Tip Amount for "+no+" Persons is "+currency+"."+((tamt*no)*0.012));
        }
        else if(s.equals("Euro")){
            Currency curr = Currency.getInstance("EUR");
            String currency = curr.getSymbol();
            System.out.println("The US Dollars of Indian Rupee for the Bill Amount is Rs."+bamt+" is "+currency+"."+(0.011*bamt));
            System.out.println("The US Dollars of Indian Rupee for the Tip Amount for 1 Person is Rs."+tamt+" is "+currency+"."+(0.011*tamt));
            System.out.println("The US Dollars of Indian Rupee for the Total Tip Amount for "+no+" Persons is "+currency+"."+((tamt*no)*0.011));
        }
        else if(s.equals("Pound")){
            Currency curr = Currency.getInstance("GBP");
            String currency = curr.getSymbol();
            System.out.println("The British Pounds of Indian Rupee for the Bill Amount is Rs."+bamt+" is "+currency+"."+(0.093*bamt));
            System.out.println("The British Pounds of Indian Rupee for the Tip Amount for 1 Person is Rs."+tamt+" is "+currency+"."+(0.093*tamt));
            System.out.println("The British Pounds of Indian Rupee for the Total Tip Amount for "+no+" Persons is "+currency+"."+((tamt*no)*0.093));
        }
        else if(s.equals("Rupee")){
            Currency curr = Currency.getInstance("INR");
            String currency = curr.getSymbol();
            System.out.println("The Indian Rupee for the Bill Amount is "+currency+"."+bamt);
            System.out.println("The Indian Rupee for the Tip Amount for 1 Person is "+currency+"."+tamt);
            System.out.println("The Indian Rupee for the Total Tip Amount for "+no+" Persons is "+currency+"."+(tamt*no));
        }
        else{
            System.out.println("Please check your Currency Value!....");
        }
    }
}
public class Tip_Calculator {
    public static void main(String args[]){
        System.out.println("-----------------TIP CALCULATOR----------------");
        Scanner scan=new Scanner(System.in);
        calculator cal=new calculator();
        System.out.println("Select the Currency Value(Dollar/Euro/Pound/Rupee): ");
        String symbol=scan.nextLine();
        System.out.println("Enter the Bill Amount(in Rs): ");
        float bill=scan.nextFloat();
        System.out.println("Enter the Tip Amount for 1 Person(in Rs): ");
        float tip=scan.nextFloat();
        System.out.println("Enter number of Persons sharing the Tips: ");
        int no=scan.nextInt();
        cal.ans(symbol,bill,tip,no);
    }
}
