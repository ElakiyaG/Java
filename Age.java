import java.util.Scanner;
import java.time.LocalDateTime;
public class Age {
    public static void main(String args[]){
        System.out.println("-----------AGE CALCULATOR-----------");
        Scanner scan=new Scanner(System.in);
        int curr_year=java.time.LocalDate.now().getYear();
        int curr_mon=java.time.LocalDate.now().getMonthValue();
        System.out.println("Enter your Birth Month (1-12): ");
        int birth_mon=scan.nextInt();
        System.out.println("Enter your Birth Year (yyyy): ");
        int birth_year=scan.nextInt();
        if(curr_mon>=birth_mon && curr_year>=birth_year){
            System.out.println("Your Present Age is "+((curr_year-birth_year)));
        }
        else if(curr_mon<=birth_mon || curr_year>=birth_year){
            System.out.println("Your Present Age is "+((curr_year-birth_year)-1));
        }
        else{
            System.out.println("Please check your Input!....");
        }
    }
}
