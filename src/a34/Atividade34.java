package a34;

import java.util.Random;

/*34. Exiba 50 números sorteados de 1 a 100 para o usuário.*/

public class Atividade34 {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 1; i <= 50; i++){
            
            System.out.println(i + "º numero aleatorio: " + (random.nextInt(100)+1));
            
        }
    }
}