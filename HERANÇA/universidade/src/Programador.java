public final class Programador extends Funcionario {
    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public double getBonificacao(){
        double bonificacao = this.salario * 0.2;
        return bonificacao;
    }
}
