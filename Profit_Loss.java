import java.util.Scanner;
class calculation{
    void ans(float a,float b,String s){
        if(a>b){
            System.out.println("You have a loss of Rs."+(a-b)+" on product "+s);
            System.out.println("The Loss Percentage on Selling Price is of "+((a-b)/a) * 100+"%");
        }
        else if(a==b){
            System.out.println("You doesn't have a profit or loss on product "+s);
            System.out.println("Since you Selled the product on the Amount of Purchasing!...");
        }
        else{
            System.out.println("You earned a profit of Rs."+(b-a)+" on product "+s);
            System.out.println("The Profit Percentage on Selling Price is of "+((b-a) * 100)/ a+"%");
        }
    }
}
public class Profit_Loss {
    public static void main(String args[]){
        System.out.println("-------------PROFIT OR LOSS FINDER------------");
        calculation cal=new calculation();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Name of the product: ");
        String name=scan.nextLine();
        System.out.println("Enter the purchasing Amount of the product "+name+": ");
        float pamt=scan.nextFloat();
        System.out.println("Enter the Selling Amount of the product "+name+" :");
        float samt=scan.nextFloat();
        cal.ans(pamt,samt,name);
    }
}
