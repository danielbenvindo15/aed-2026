import java.util.Scanner;

public class Votacao {
    public static Scanner entrada = new Scanner(System.in);
    
    //Ler Caractere
    public static int lerInteiro() {
        int valor;

        System.out.println("Digite um número válido (1 ou 2)");
        valor = entrada.nextInt();

        return valor;
    }

    public static void main(String[] args) {
        //Variáveis
        int candidatoA = 0, candidatoB = 0;
        int i;
        int voto = 0;

        //Processamento
        for (i = 0; i < 10; i++){
            voto = lerInteiro();

            switch (voto) {
                case 1:
                    candidatoA++;
                    break;
                
                case 2:
                    candidatoB++;
                    break;
            
                default:
                    System.out.println("Voto inválido. Vote novamente.");
                    i--;
                    break;
            }
        }

        //Saída de Dados
        System.out.println("Candidato A: " + candidatoA + " votos.");
        System.out.println("Candidato B: " + candidatoB + " votos.");

        //Verificação de ganhador
        if (candidatoA > candidatoB) {
            System.out.println("Candidato A ganhou");
        }else if (candidatoB > candidatoA) {
            System.out.println("Candidato B ganhou");
        }else{
            System.out.println("Empate");
        }
    }
}
