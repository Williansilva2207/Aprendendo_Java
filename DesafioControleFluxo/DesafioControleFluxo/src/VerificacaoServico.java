import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = verificar(servico,  partes, entradaCliente);
        System.out.println(contratado);
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        scanner.close();
    }

    public static boolean verificar(String servico, String[] partes, String entradaCliente){
        for(int i = 1; i <= partes.length; i++){
            if(servico == partes[i]){
                return true;
            }
        }
        return false;
    }
}