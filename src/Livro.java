import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    public String Titulo;
    //public Autor autor;
    public float preco;
    public LocalDate dataLancamento;
    public int idadeLivro;

    public static List<Livro> listaLivros = new ArrayList<>();
    Autor Autor = new Autor();

public void cadastrarLivro(Livro livro){
    livro.Titulo = JOptionPane.showInputDialog("Digite o Titulo do Livro: " );
    livro.Autor.nome = JOptionPane.showInputDialog("Digite o nome do Autor: ");
    livro.Autor.localNasc = JOptionPane.showInputDialog("Digite o Local de Nascimento do Autor");
    livro.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Livro (Somente Numeros) "));
    livro.dataLancamento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de Lancamento do livro no formato dd/MM/aaaa "), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    verificarTempoLanc(livro.dataLancamento);
    if(idadeLivro < 5){

        JOptionPane.showMessageDialog(null,"Nao foi possivel cadastrar!");

    }else{
        listaLivros.add(livro);
        JOptionPane.showMessageDialog(null,"Cadastro do livro realizado com sucesso!!!");
    }


}
public List<Livro> listarLivros(){

   for(Livro livro: listaLivros){
       JOptionPane.showMessageDialog(null, "Titulo do livro: "+ livro.Titulo +
               "\nNome do Autor: "+ livro.Autor.nome +
               "\nLocal de Nascimento do Autor: "+ livro.Autor.localNasc +
               "\nPreco do livro: " + livro.preco +
               "\nData de Lancamento: " + livro.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
return listaLivros;
}
public int verificarTempoLanc(LocalDate date){
    Period periodo =  Period.between(date, LocalDate.now());

    return idadeLivro;
    }
}


