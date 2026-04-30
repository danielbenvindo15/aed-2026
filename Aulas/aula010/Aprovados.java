import java.util.Scanner;

public class Aprovados {
    public static Scanner entrada = new Scanner(System.in);

    public static float lerNota(String mensagem) {
        float valor;

        System.out.println(mensagem);
        valor = entrada.nextFloat();

        return valor;
    }

    public static void main(String[] args) {
        int aprovado = 0;
        int reprovados = 0;
        float nota;
        float somaNotas = 0, mediaTurma = 0;
        int i = 0;

        
        while (i < 10) {
            nota = lerNota("Digite uma nota");
            somaNotas += nota;

            if (nota >= 7) {
                aprovado++ ; //variável contadora
            }else{
                reprovados++ ; //variável contadora
            }

            i++ ;
        }

        mediaTurma = somaNotas / i;

        
        System.out.println(aprovado + " foram aprovados e " + reprovados + " foram reprovados.");
        System.out.println("A média da turma foi de: " + mediaTurma);
    }
}
