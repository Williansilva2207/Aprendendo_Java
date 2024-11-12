import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        try{
            int numero = leitor.nextInt();
            System.out.println(numero);
        }catch(Exception java){
            System.out.println(java.toString());
        }finally{
            System.out.println("Ele ó roda, ninguém sabe porquÊ existe");
        }

    }
}