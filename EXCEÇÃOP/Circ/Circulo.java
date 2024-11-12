package Circ;
public class Circulo {
    private double raio;

    public void setRaio(double novoRaio){
        if(novoRaio >= 0){
            this.raio = novoRaio;
        }else{
            throw new IllegalArgumentException("O raio não pode ser negativo.");
        }
    
    }
}
