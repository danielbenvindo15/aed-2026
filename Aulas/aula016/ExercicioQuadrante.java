package aula016;
import java.util.Scanner;

public class ExercicioQuadrante {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        
        x = entrada.nextInt();
        y = entrada.nextInt();

        if (x == 0 || y == 0) {
            System.out.println();
        }else if (x > 0) {
            if (y > 0) {
                System.out.println("primeiro");
            }else{
                System.out.println("quarto");
            }
        }else{
            if (y > 0) {
                System.out.println("segundo");
            }else{
                System.out.println("terceiro");
            }
        }

    }
}
