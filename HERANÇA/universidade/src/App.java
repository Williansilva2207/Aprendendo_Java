public class App {
    public static void main(String[] args) {
       Funcionario funcionario1 = new Gerente();
     
       funcionario1.setNome("Willian"); 
       funcionario1.setCpf("0765123450");
       funcionario1.setSalario(1000.50);
       GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
       relatorio.adiciona(funcionario1);
    } 
}
