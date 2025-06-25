
import java.util.Locale;
import java.util.ResourceBundle;
// import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Locale locale_en = Locale.of("en", "US");
        Locale locale_ru = Locale.of("ru", "RU");

        printInfo(locale_en);
        printInfo(locale_ru);
    }

    private static void printInfo(Locale locale) {
        ResourceBundle print = ResourceBundle.getBundle("Theme", locale);
        /*
        Set<String> keys = print.keySet();
        for (String key : keys) {
            String value = print.getString(key);
            System.out.println(value);
            System.out.println();
        } */
        String line1 = print.getString("theme.key1");
        String line2 = print.getString("theme.key2");
        String line3 = print.getString("theme.key3");
        System.out.println(line1+line2+line3);
        System.out.println();
    }
}