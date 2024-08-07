import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("----------Multiplication Table----------");
        System.out.println("Enter a Number for the Limit of Multipication:");
        int no=scan.nextInt();
        System.out.println("Multiplication Table upto "+no+" Numbers ");
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no;j++){
                int s=i*j;
                int length = String.valueOf(s).length();
                if(length==1) System.out.print(" 0"+s);
                else System.out.print(" "+s);
            }
            System.out.println();
        }
    }
}
