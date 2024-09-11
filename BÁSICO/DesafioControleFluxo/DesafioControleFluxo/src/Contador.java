import java.util.Scanner;
class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }
}
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
		if(parametroUm < parametroDois){
            for(int i = 0; i < contagem; i++){
                System.out.printf("Imprimindo o número %d \n", i+1);
            }
        }
        else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		
	}
}
