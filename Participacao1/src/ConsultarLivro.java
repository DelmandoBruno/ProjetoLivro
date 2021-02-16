import java.nio.file.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class ConsultarLivro{

    public static void main(String[] args){
        Path arquivo = Paths.get("livros.txt");
        try {
            String[] livros = Files.readAllLines(arquivo).toArray(new String[0]);
            String s = showInputDialog("Consultar livro da linha: ");
            int i = Integer.parseInt(s);
            showMessageDialog(null, livros[i-1]);
        }catch(IOException ex) {
            showMessageDialog(null, "Erro ao acessar o arquivo!");
        }catch(NumberFormatException ex){
            showMessageDialog(null, "Por favor, entre um número!");
        }catch(ArrayIndexOutOfBoundsException ex){
            showMessageDialog(null, "Valor Inválido!");
        }
        showMessageDialog(null, "Fim!");
    }
}   

