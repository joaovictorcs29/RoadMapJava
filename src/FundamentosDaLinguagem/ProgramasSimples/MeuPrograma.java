
// Declaração de pacote
package FundamentosDaLinguagem.ProgramasSimples;

//Importação de classes
import java.util.Scanner;

public class MeuPrograma {

    //Método principal
    public static void main(String[] args) {
        //Criação de um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Solicita o nome do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        //Exibe uma mensagem de boas-vindas
        System.out.println("Olá "+nome+"! seja bem-vindo ao mundo Java");

        //fecha o scanner
        scanner.close();
    }
}
