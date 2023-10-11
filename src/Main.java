import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        int opcao;
        do{
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Sistema de Cadastro de livros!\n1 - Cadastrar Livro\n2 - Listar Livro\n0 - Sair do Sistema"));
        switch(opcao){
            case 1:
                livro.cadastrarLivro(livro);
                break;
            case 2:
                livro.listarLivros();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Obrigado por usar nosso Sistema!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor nao encontrado, por favor coloque um valor valido ");
                break;
        }
        }while(opcao != 0);
    }
}