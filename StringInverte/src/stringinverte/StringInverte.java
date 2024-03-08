package stringinverte;
import java.util.Scanner;
/**
 *
 * @author Katia
 */
public class StringInverte {

    


    public static void main(String[] args) {
        // Obter a string do usuário
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Inverter a string
        String invertedString = inverterString(input);
        
        // Exibir o resultado
        System.out.println("String original: " + input);
        System.out.println("String invertida: " + invertedString);
        
        scanner.close();
    }

    // Função para inverter a string
    private static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            // Trocar os caracteres nas posições inicio e fim
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            
            // Atualizar as posições
            inicio++;
            fim--;
        }
        
        // Criar uma nova string a partir do array de caracteres invertido
        return new String(caracteres);
    }
}

