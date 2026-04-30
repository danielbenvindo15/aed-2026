public class SomaPares {
    public static void main(String[] args) {
        int somaPar = 0; //Variável contadora
        int i = 1; //Variável de inicialização

        //Processamento
        while (i <= 100) {
            
            if (i % 2 == 0) {
                somaPar += i;
            }
            
            i ++;
        }

        //Saída
        System.out.println("A soma dos pares de 1 a 100 é de: " + somaPar);
    }
}
