import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class UmJava {
    public static void main(String[] args) {
        
        //Comando 'Scanner' para coleta de dados
        Scanner input = new Scanner(System.in);
        
        //Arrays responsáveis por armazenar os números
        int[] pares = new int[5];
        int[] impares = new int[5];
        double[] numeros = new double[5];
        
            //Processo de coleta dos números e teste lógico
            for (int i = 0; i < 5; i++) {
                System.out.print("\nDigite o "+(i+1)+"º número:\n> ");
                int num = input.nextInt();
                numeros[i] = (int) num;

                if (num%2 == 0) {
                    pares[i] = (int) num;
                } else if (num%2 == 1) {
                    impares[i] = (int) num;
                }
            
            }
        input.close();
        
        //Comando para transformar os números inteiros em números reais e somá-los
        Double sum = DoubleStream.of(numeros).sum();

        //Saída de dados
        System.out.println("\nMédia: " +sum/numeros.length);
        System.out.println("Pares: "    +Arrays.toString(pares));
        System.out.println("Impares: "  +Arrays.toString(impares));

    }
}
