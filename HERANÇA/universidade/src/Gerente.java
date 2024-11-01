public class Gerente extends Funcionario {
    protected int senha;
    protected int numeroFuncionariosGerenciados;
    public double getBonificacao(){
        return (this.salario * 0.1) + 1000;
    }
}
