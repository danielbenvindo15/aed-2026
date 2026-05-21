package aula015;
import java.util.Scanner;

public class ExercicioSenha {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int i;

        do {
            System.out.print("");
            i = entrada.nextInt();
            switch (i) {
                case 2002:
                    System.out.println("Acesso Permitido");
                    break;
            
                default:
                    System.out.println("Senha Inválida");
                    break;
            }
        } while (i != 2002);
    }
}
