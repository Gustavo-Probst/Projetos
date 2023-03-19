import java.util.Arrays;
import java.util.Scanner;

public class CincoJava {
    public static void main(String[] args) {
        
        //Arrays responsáveis por armazenar os números
        String[] alunos = new String[3];
        double[] notas1 = new double[4];
        double[] notas2 = new double[4];
        double[] notas3 = new double[4];
        
        //Comando responsável pela matriz
        String[][] matriz = new String[3][1];
       
        //Comando 'Scanner' para coleta de dados
        Scanner input = new Scanner(System.in);

        //Comando para coletar os nomes do alunos
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDigite o nome do "+(i+1)+"º aluno: ");
            String aluno = input.nextLine();
            alunos[i] = aluno;    
        }
        

         //laço 'for' para coleta de notas dos alunos 
         for (int i = 0; i < 4; i++) {
            //Coleta de notas
            System.out.print("\nDigite a "+(i+1)+"ª nota do 1º aluno:\n> ");
            double num = input.nextDouble();
            notas1[i] = (double) num;
         }

         for (int i = 0; i < 4; i++) {
            //Coleta de notas
            System.out.print("\nDigite a "+(i+1)+"ª nota do 2º aluno:\n> ");
            double num = input.nextDouble();
            notas2[i] = (double) num;
         }

         for (int i = 0; i < 4; i++) {
            //Coleta de notas
            System.out.print("\nDigite a "+(i+1)+"ª nota do 3º aluno:\n> ");
            double num = input.nextDouble();
            notas3[i] = (double) num;
         }

         input.close();

    //Comando para soma dos arrays das notas
    Double sum1 = Arrays.stream(notas1).parallel().reduce(0,(a,b)->  a + b);
    Double sum2 = Arrays.stream(notas2).parallel().reduce(0,(a,b)->  a + b);
    Double sum3 = Arrays.stream(notas3).parallel().reduce(0,(a,b)->  a + b);
    
    //calculo de média das notas
    double media1 = sum1/notas1.length;
    double media2 = sum2/notas2.length;
    double media3 = sum3/notas3.length;

    //Posição da saída dos dados
    matriz[0][0] = alunos[0]+" - "+media1; 
    matriz[1][0] = alunos[1]+" - "+media2; 
    matriz[2][0] = alunos[2]+" - "+media3; 
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println("\t\t"+matriz[i][j]);
        }
    }

    //Teste lógico para saída do aluno com maior média
    if (media1 > media2) {
        System.out.println("\nAluno com maior média:\n> "+alunos[0]);
    } else if (media2 > media3) {
        System.out.println("\nAluno com maior média:\n> "+alunos[1]);
    } else if (media3 > media1) {
        System.out.println("\nAluno com maior média:\n> "+alunos[2]);
    } 

    //Teste lógico para saída do aluno com menor média
    if (media1 < media2) {
        System.out.println("\nAluno com menor média:\n> "+alunos[0]);
    } else if (media2 < media3) {
        System.out.println("\nAluno com menor média:\n> "+alunos[1]);
    } else if (media1 < media3) {
        System.out.println("\nAluno com menor média:\n> "+alunos[2]);
    } 
}
}