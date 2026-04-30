import java.util.Scanner;

public class Fatorial {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        int valor = lerInteiro();
        int valorInicial = valor;
        int i = valor - 1;
        int fatorial = 0;
        

        if (valor > 0) {
            while (i > 0) {
                fatorial = fatorial * valor * i;

                valor -= 2 ;
                i -= 2 ;
            }
            System.out.println(fatorial + valorInicial);
        }
    }
}
