import java.util.*;
import java.math.*;
public class NickName {
    public static void main(String args[]){
        System.out.println("----------NAME-MONTH COMBINATION----------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=scan.nextLine();
        System.out.println("Enter your Birth Month (Eg:January): ");
        String mon=scan.nextLine();
        int l1=name.length();
        int l2=mon.length();
        int a= (int) (Math.random()*l1);
        int b= (int) (Math.random()*l2);
        System.out.println(name.substring(a,name.length())+(mon.substring(b,mon.length())));
    }
}
