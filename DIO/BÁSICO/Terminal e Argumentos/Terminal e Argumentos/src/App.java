import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.err.println ("Seu nome ?");
        String name = scanner.next();
        System.out.println(name);
    }
}
