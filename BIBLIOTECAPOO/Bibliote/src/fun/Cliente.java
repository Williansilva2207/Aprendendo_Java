package fun;

import java.util.Scanner;
public class Cliente{
    String nome;
    String numeroCartao;

    public Cliente(String nome, String numeroCartao){
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }
    public void setColocarNome(String nome){
        System.out.println("Digite o seu nome:\n");
        Scanner scn = new Scanner(System.in);
        String Nam = scn.nextLine();
        this.nome = Nam;
    }
    public String getNome(String nome){
        return nome;
    }
    public String getNumeroCartao(String numeroCartao){
        return numeroCartao;
    }
    public void realizarEmprestimo(Livro livros){

    }
    public void devolverLivro(Livro livros){
        
    }
}