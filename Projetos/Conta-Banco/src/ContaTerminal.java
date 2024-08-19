import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual é o número do banco ?");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual é a Agência do banco");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Qual é o seu nome e sobrenome ?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual é o seu saldo ?");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo "+ saldo+ " já está disponível para saque");

    }
}
