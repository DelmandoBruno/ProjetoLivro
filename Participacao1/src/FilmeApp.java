import java.nio.file.*;
import static javax.swing.JOptionPane.*;
import java.io.*;

public class FilmeApp {
    public static void main(String[] args) throws IOException {
        String s = showInputDialog("Consultar filme na linha: ");
        int linha = Integer.parseInt(s);
        
        try {
            String nome = Filmes.consultar(linha-1);
            showMessageDialog(null, nome);
        }catch(IOException ex){
            showMessageDialog(null, "Erro ao acessar arquivo");
        }catch(NumberFormatException ex){
            showMessageDialog(null, "Por favor, entre com um número");
        }catch(ArrayIndexOutOfBoundsException ex){
            showMessageDialog (null, "Valor inválidao!");
        }
            showMessageDialog (null, "Fim!");
    }
}
class Filmes{
    public static String consultar(int indice) throws IOException{
        Path arquivo = Paths.get("filmes.txt");
        String[] nomesFilmes = Files.readAllLines(arquivo).toArray(new String[0]);
        return nomesFilmes[indice];
        
    }
}
