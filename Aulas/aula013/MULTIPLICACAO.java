import java.util.Scanner;

public class MULTIPLICACAO {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número:");
        valor = entrada.nextInt();

        return valor;
    }

    public static char lerCaractere() {
        char letra;
        
        System.out.println("Digite um caractere:");
        letra = entrada.next().charAt(0);

        return letra;
    }

    public static void main(String[] args) {
        int numero = lerInteiro();
        char c = lerCaractere();
        int coluna; //Variável de coluna
        int i; //Variável de linha

        //Repetição de linhas
        for (i = 0; i < numero; i++) {
            //Repetição de colunas
            for (coluna = 0; coluna < numero; coluna++) {
                System.out.print(c);
            }
            System.out.println();
        
        }
    }
}