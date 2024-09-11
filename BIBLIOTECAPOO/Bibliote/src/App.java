import fun.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Cliente> cliente = new ArrayList<>();
        int decision;
        System.out.println("Escolaha:\n1. Usuário.\n2. Autor.\n3. Administrado.\n");
        decision = scn.nextInt();
        switch (decision) {
            case 1:
                System.out.println("");
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                break;
        }
        scn.close();
    }
 
}
