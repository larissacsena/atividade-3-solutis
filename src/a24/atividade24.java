package a24;

import static a24.ValidaData.isDataValida;

/* Faça a verificação da validade de uma data completa (dia, mês e ano).
Obs. um ano é bissexto, cujo mês de fevereiro possui 29 dias, se o resto da divisão do ano
por 4 e também por 100 for zero, ou ainda se o resto da divisão por 400 for zero. Os meses
com 30 dias são 4, 6, 9 e 11, os demais tem 31 dias. */
public class atividade24 {
    public static void main(String[] args) {
        int dia = 29;
        int mes = 2;
        int ano = 2024;

        if (isDataValida(dia, mes, ano)) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }
    }
}
