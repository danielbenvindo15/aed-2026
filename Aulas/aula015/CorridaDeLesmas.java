package aula015;
import java.util.Scanner;

public class CorridaDeLesmas {
    public static Scanner entrada = new Scanner(System.in);

    public static int lerInteiro(String mensagem){
        int n;

        System.out.println(mensagem);
        n = entrada.nextInt();

        return n;
    }

    public static void main(String[] args) {
    //Variáveis
        int i, numLesmas, vel, xp = 0;

    //Processamento

        //Número de lesmas
        do {
            i = lerInteiro("Quantas lesmas tem no grupo?");
            if (i < 1 || i > 500 ) {
                System.out.println("Número inválido. Digite um número entre 1 e 500.");
            }
        } while (i < 1 || i > 500);
        
        numLesmas = i;
        
        if (numLesmas > 50) {
            numLesmas = 50;
        }
        
        //Registro de velocidade
        for (i = 0; i != numLesmas; i++) {
            vel = lerInteiro("Qual a velocidade da sua lesma? (em cm/h)");
            if (vel > 50 || vel < 1) {
                System.out.println("Velocidade inválida. Digite uma velocidade entre 1 e 50.");
                vel = 0;
                i--;
            }

            if (vel > xp) {
                xp = vel;
            }
        }

        //Nivelamento
        if (xp < 10) {
            System.out.println("Nível 1");
        } else if (xp < 20) {
            System.out.println("Nível 2");
        } else {
            System.out.println("Nível 3");
        }
    }
}
