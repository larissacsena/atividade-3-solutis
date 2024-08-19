package a52;

import java.math.BigInteger;

public class Atividade52 {
    public static void main(String[] args) {

        int numberOfSquares = 64;
        BigInteger grainsPerBag = new BigInteger("50000");
        BigInteger totalGrains = BigInteger.ZERO;

        for (int i = 0; i < numberOfSquares; i++) {
            totalGrains = totalGrains.add(BigInteger.valueOf(2).pow(i));
        }
        BigInteger bagsOfRice = totalGrains.divide(grainsPerBag);

        System.out.println("Total de grãos de arroz: " + totalGrains);
        System.out.println("Quantidade de sacos de arroz: " + bagsOfRice);
    }
}
