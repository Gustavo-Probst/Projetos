import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DoisJava {
    public static void main(String[] args) {
        
        //Comando de lista para armazenar os dados
        List<Integer> numeros = new ArrayList<>();
        
        //Comando 'Scanner' para coleta de dados
        Scanner input = new Scanner(System.in);

        //Laço 'for' para coleta de dados
            for (int i = 0; i < 5; i++) {
            System.out.print("\nDigite o "+(i+1)+"º número:\n> ");
            numeros.add(input.nextInt());
            }
        
        //Comando para solicitar o maior número da lista
        int maior = Collections.max(numeros);
        
        //Comando para solicitar o menor número da lista
        int menor = Collections.min(numeros);
        input.close();
    
        //Saída de dados
        System.out.println("\nO maior número é:\n> " +maior);
        System.out.println("O menor número é:\n> " +menor);

    }
}
