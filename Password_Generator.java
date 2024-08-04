import java.util.*;
import java.util.Scanner;

public class Password_Generator {
    public static String appendRandomNumbers(String base, int count, int maxRandomValue) {
        Random random = new Random();
        String result = base;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(10); // Random number between 0 and 9
            result += randomNumber;
        }

        return result;
    }
    public static void pass(String name,int year,String ch,int len) {
        int i = name.length();
        int ran_s = (int) (Math.random() * i);
        int ran_f = (int) (Math.random() * i);
        String n;
        if (ran_s < ran_f)
            n = name.substring(ran_s, ran_f);
        else
            n = name.substring(ran_f, ran_s);
        String y = String.valueOf(year);

        if (len >= 8 && len <= 16){
             String res = n + ch + y.substring(2, 4);
             if (res.length() == len) System.out.println(res);
             else {

                 int n1 = len-res.length();
                 int maxRandomValue = 9;

                 String result = appendRandomNumbers(res, n1, maxRandomValue);
                 System.out.println("Your Generated Password is '" + result +"'.");
             }
        } else {
            System.out.println("Check the length of the password!....");
        }
    }
    public static void main(String args[]){
        System.out.println("----------RANDOM PASSWORD GENERATOR---------");
        Random random = new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=scan.nextLine();
        System.out.println("Enter Birth Year(0000): ");
        int year=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a special Character:");
        String ch=scan.nextLine();
        System.out.println("Enter the Length of the password(8-16): ");
        int len=scan.nextInt();
        pass(name,year,ch,len);
    }
}
