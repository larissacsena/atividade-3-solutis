package a34;

import java.util.Random;


public class Atividade34 {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 1; i <= 50; i++){
            
            System.out.println(i + "º numero aleatorio: " + (random.nextInt(100)+1));
            
        }
    }
}