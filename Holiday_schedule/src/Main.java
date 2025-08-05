import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // LocalDate today = LocalDate.now();
        LocalDate holidays_in_January_1 = LocalDate.of(2025, 1, 1);
        LocalDate holidays_in_February = holidays_in_January_1.plusMonths(1);
        LocalDate holidays_in_March = holidays_in_January_1.plusMonths(2);
        LocalDate holidays_in_May = holidays_in_January_1.plusMonths(4);
        LocalDate holidays_in_June = holidays_in_January_1.plusMonths(5);
        LocalDate holidays_in_July = holidays_in_January_1.plusMonths(6);
        LocalDate holidays_in_November = holidays_in_June.plusMonths(5);
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Holidays in January(first week): "+ holidays_in_January_1 +" " + holidays_in_January_1.plusDays(1) +" "
                +holidays_in_January_1.plusDays(2) + " " +holidays_in_January_1.plusDays(3)+" "+holidays_in_January_1.plusDays(4));
        System.out.println("Holidays in January(second week): "+ holidays_in_January_1.plusDays(5)+" "+holidays_in_January_1.plusDays(6)+" "
        +holidays_in_January_1.plusDays(7));
        System.out.println("Holidays in February: "+holidays_in_February.plusDays(13) + " "+holidays_in_February.plusDays(22));
        System.out.println("Holidays in March: "+ holidays_in_March.plusDays(7));
        System.out.println("Holidays in May(first week): "+ holidays_in_May +" "+holidays_in_May.plusDays(1));
        System.out.println("Holidays in May(second week): "+ holidays_in_May.plusDays(7)+" "+ holidays_in_May.plusDays(8));
        System.out.println("Holidays in June: "+ holidays_in_June.plusDays(11)+ " "+holidays_in_June.plusDays(12));
        System.out.println("Holidays in July: "+ holidays_in_July.plusDays(25));
        System.out.println("Holidays in November: "+ holidays_in_November.plusDays(2)+ " "+holidays_in_November.plusDays(3));
        System.out.println("Holidays in December: "+holidays_in_January_1.minusDays(1).plusYears(1));
    }
}