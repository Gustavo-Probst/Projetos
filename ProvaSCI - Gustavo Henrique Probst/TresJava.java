import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TresJava {
    
    public static void main(String[] args) {
        
        //Comando para formatar números decimais para 2 casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        //Definição de variáveis e array para coletar notas
        int sim = 1;
        int nao = 2;
        double[] notas = new double[4];

        //Comando 'Scanner' para coleta de dados
        Scanner input = new Scanner(System.in);

            //Comando para coletar o nome do aluno
            System.out.println("\nDigite o nome do aluno: ");
            String aluno = input.nextLine();

            //laço 'for' para coleta de notas e teste lógico
            for (int i = 0; i < 4; i++) {
                
                //Coleta de notas
                System.out.print("\nDigite a "+(i+1)+"º nota:\n> ");
                Double num = input.nextDouble();
                notas[i] = (Double) num;
                
                //Teste lógico para fechamento do programa
                System.out.println("Deseja encerrar o programa?\nDigite \"1\" para continuar o programa\nDigite \"2\" para encerrar o programa");
                int resposta = input.nextInt();

                    if (resposta == nao) {
                        System.out.println("Encerrando Programa...");
                        System.exit(0);
                    } else if (resposta == sim) {
                        System.out.println("Ok.");
                    
                    }
            }

        input.close();

        //Comando para transformar números inteiros para números reais
        Double sum = Arrays.stream(notas).parallel().reduce(0,(a,b)->  a + b);
        
        //calculo de média das notas
        double media = sum/notas.length;
        
        //Saída de dados
        System.out.println("\nMédia do aluno: "+aluno+"\n> "+df.format(media));
        
        //Teste lógico para aprovação do aluno
        if (media >= 6) {
            System.out.println("Aprovado\n");
        } else {
            System.out.println("Reprovado\n");
        }
    }  
}
