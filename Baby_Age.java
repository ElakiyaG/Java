import java.util.Scanner;
import java.time.LocalDateTime;
public class Baby_Age {
    public static void main(String args[]){
        System.out.println("-----------BABY'S AGE CALCULATOR(WITHIN A YEAR)-----------");
        Scanner scan=new Scanner(System.in);
        int curr_year=java.time.LocalDate.now().getYear();
        int curr_date=java.time.LocalDate.now().getDayOfMonth();
        int curr_mon=java.time.LocalDate.now().getMonthValue();
        System.out.println("Enter your Birth Date (yyyy): ");
        int birth_date=scan.nextInt();
        System.out.println("Enter your Birth Month (1-12): ");
        int birth_mon=scan.nextInt();
        System.out.println("Enter your Birth Year (yyyy): ");
        int birth_year=scan.nextInt();
        int n1=String.valueOf(birth_year).length();
        int n2=String.valueOf(birth_date).length();
        if (birth_mon<=12 && n1==4 && n2<=2) {
            if (curr_mon >= birth_mon && curr_year >= birth_year && birth_date <= curr_date) {
                System.out.println("You are "+(curr_year-birth_year)+" Years, "+(curr_mon-birth_mon)+" months and "+(curr_date-birth_date)+" Days Old.");
            } else if (curr_mon <= birth_mon && curr_year >= birth_year && curr_date <= birth_date) {
                System.out.println("You are "+(curr_year-birth_year)+" Years, "+(birth_mon-curr_mon)+" months and "+(curr_date-birth_date)+" Days Old.");
            }
        }
        else {
            System.out.println("Please check your Input!....");
        }
    }
}

