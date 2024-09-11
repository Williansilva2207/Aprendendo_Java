package fun;
import java.util.ArrayList;
import java.util.List;
public class Autor{
   
   private String nome;
   private String nascimento;
   private List<Livro> livros;


   public void autor(String nome, String nascimento){
      this.nome = nome;
      this.nascimento = nascimento;
      this.livros = new ArrayList<>();
   }

   public String getNome(){
      return nome;
   }
   public String getNascimento(){
      return nascimento;
   }
   
   public void adicionarLivros(Livro liv){
      livros.add(liv);
   }
      
}
      