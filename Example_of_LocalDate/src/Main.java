import java.time.LocalDate;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.time.temporal.ChronoField;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate my_Birthday = LocalDate.of(1991, 5, 4);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int Day_of_Week = my_Birthday.get(ChronoField.DAY_OF_WEEK);
        int Day_of_Year = my_Birthday.getDayOfYear();
        int Month = my_Birthday.getMonthValue();
        int Year = my_Birthday.getYear();

        System.out.println("День недели: "+ Day_of_Week);
        System.out.println("День в году: "+ Day_of_Year);
        System.out.println("Месяц: "+ Month);
        System.out.println("Год: "+ Year);

        LocalDate today = LocalDate.now();
        boolean after = my_Birthday.isAfter(today);
        boolean before = my_Birthday.isBefore(today);
        System.out.println("my_Birthday.isAfter(today): "+ after);
        System.out.println("my_Birthday.isBefore(today): " + before);
    }
}