public class Gerente extends Funcionario {
    protected int senha;
    protected int numeroFuncionariosGerenciados;
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
}
