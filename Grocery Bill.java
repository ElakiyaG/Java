import java.util.*;
class bills{
    void total(float a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("      ---------");
        System.out.println("Total Bill: Rs."+sum);
        System.out.println("      ---------");
    }
}
public class project3 {
    public static void main(String args[]){
        bills b=new bills();
        Scanner scan=new Scanner(System.in);
        System.out.println("--------------GROCERY BILL-------------");
        System.out.println("Enter the number of Items you purchased: ");
        int no=scan.nextInt();
        int quantity;
        String arritem[]=new String[no];
        float arrbill[]=new float[no];
        for(int i=0;i<no;i++){
            System.out.println("Enter the "+(i+1)+ "st Item you purchased: ");
            scan.nextLine();
            arritem[i]=scan.nextLine();
            System.out.println("Enter the Amount for the Item "+arritem[i]+" with Quantity 1: ");
            arrbill[i]=scan.nextFloat();
            System.out.println("Enter the Quantity of the Item (packet/kg/g):");
            quantity=scan.nextInt();
            arrbill[i]*=quantity;
            System.out.println("The Item "+arritem[i]+" with Quantity "+quantity+" costs Rs."+arrbill[i]);
        }
        System.out.println("Your Total Bill on Grocery List is");
        for(int i=0;i<no;i++){
            System.out.println(arritem[i]+" : Rs."+arrbill[i]);
        }
        b.total(arrbill);
    }
}
