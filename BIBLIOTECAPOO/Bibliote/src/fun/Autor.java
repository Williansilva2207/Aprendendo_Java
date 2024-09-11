package fun;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Autor{
   
   private String nome;
   private String nascimento;
   private List<Livro> livros;


   public autor(String nome, String nascimento){
      this.livros = livro;
      this.nascimento = nascimento;
      this.livros = new ArrayList<>();
   }

   public String getNome(){
      return nome;
   }
   public String getNascimento(){
      return nascimento;
   }
   
   public void adicionarLivros(Livro livros){
      livros.add(livro);
   }
      
}
      