import java.util.Calendar;

public class DisplayCalendar {
    public static void main(String[] args) {
        System.out.println("-----------CALENDAR--------");
        Calendar cal = Calendar.getInstance();
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            if (day == currentDay) {
                System.out.printf("[%2d]", day);
            } else {
                System.out.printf(" %2d ", day);
            }
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}