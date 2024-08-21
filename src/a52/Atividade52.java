package a52;

import java.math.BigInteger;

/* A história do rei que e tornou pobre: após perder uma aposta com um súdito,
ele teve que pagar uma quantia muito grande em sacos de arroz. A aposta feita
anteriormente era que se o súdito ganhasse o rei teria que pagar um grão de
arroz colocado na primeira casa de um tabuleiro de xadrez. Na segunda casa teria
que pagar o dobro, ou seja, dois grãos de arroz, e assim sucessivamente até a casa
número 64. Exiba quantos grãos de arroz este súdito teria que ganhar, somando
todas as 64 casas.Depois tente exibir a quantia de sacos de arroz? */
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
