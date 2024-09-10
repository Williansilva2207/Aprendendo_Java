public class Emprestimo{
    String dataEmprestimo;
    String numeroCartao;

    public Emprestimo(String dataEmprestimo, String numeroCartao){
        this.dataEmprestimo = dataEmprestimo;
        this.numeroCartao = numeroCartao;
    }
    public String getDataEmprestimo(String dataEmprestimo){
        return dataEmprestimo;
    }
    public String getNumeroCartao(String numeroCartao){
        return numeroCartao;
    }
    private int calcularMuta(){
        
    }
}