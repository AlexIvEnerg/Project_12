import java.util.regex.Pattern;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.regex.Matcher;
import java.util.Locale;
import java.util.ResourceBundle;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Locale locale_en = Locale.of("en");
        Locale locale_fr = Locale.of("fr");
        Locale locale_ru = Locale.of("ru");
        // Matcher matcher4 = pattern.matcher("ссаб");
        // to see how IntelliJ IDEA suggests fixing it.
        test(locale_en); test(locale_fr); test(locale_ru);
        /* test(matcher4); */
    }

    public static void test(Locale locale) {
        ResourceBundle print = ResourceBundle.getBundle("Var",locale);
        String pat = print.getString("Pat");
        Pattern pattern = Pattern.compile(pat);
        String string1 = print.getString("Var1");
        String string2 = print.getString("Var2");
        String string3 = print.getString("Var3");
        Matcher matcher1 = pattern.matcher(string1);
        Matcher matcher2 = pattern.matcher(string2);
        Matcher matcher3 = pattern.matcher(string3);
        boolean equals1 = matcher1.matches();
        boolean equals2 = matcher2.matches();
        boolean equals3 = matcher3.matches();
        System.out.println(print.getString("Lang")+"\n");
        System.out.println(equals1+" "+equals2+" "+equals3);
    }
}