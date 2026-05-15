package aula014;
import java.util.Scanner;

public class ImprimirTriangulo {
    public static Scanner entrada = new Scanner(System.in);
    
    public static int lerInteiro() {
        int num;

        System.out.println("Digite um número");
        num = entrada.nextInt();

        return num;
    }

    public static void main(String[] args) {
        //Variáveis
        int asterisco = 1, quantidade = lerInteiro(),  hifem = quantidade - 1, i, j;
        

        //Processamento e Saída de Dados
        if (quantidade % 2 != 0) {
            
            System.out.println("ímpar");

            for (i = 0; i < quantidade; i++) {
            
                for (j = hifem; j > 0; j--) {
                    System.out.print("_");
                }

                for (j = asterisco; j > 0; j--) {
                    System.out.print("*");
                }

                for (j = hifem; j > 0; j--) {
                    System.out.print("_");
                }

            asterisco += 2;
            hifem--;
            System.out.println();
            }
            
        }else{
            System.out.println("é par.");
        }
        
    }
}
