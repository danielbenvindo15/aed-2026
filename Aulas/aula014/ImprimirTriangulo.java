package aula014;

public class ImprimirTriangulo {
    public static void main(String[] args) {
        //Variáveis
        int asterisco = 1;
        int hifem = 4;
        int i, j;

        //Processamento e Saída de Dados
        for (i = 0; i < 5; i++) {
            
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
    }
}
