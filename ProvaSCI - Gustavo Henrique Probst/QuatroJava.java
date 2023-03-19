import java.util.Scanner;

public class QuatroJava {
    public static void main(String[] args) {
        
        //Comando 'Scanner' para coleta de dados
        Scanner input = new Scanner(System.in);
            
            //Arrays responsáveis por armazenar os números
            double[] numeros = new double[5];

            //Laço 'for' para coleta dos números
            for (int i = 0; i < 5; i++) {
                System.out.print("\nDigite o "+(i+1)+"º número:\n> ");
                Double num = input.nextDouble();
                numeros[i] = (Double) num;
            }

        input.close();

        //Saída do 3º número digitado
        System.out.println("\n3º Número:\n> "+numeros[2]);
}
}
