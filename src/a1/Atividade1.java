package a1;
/*
Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de
nascimento e o ano atual.
 */

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int anoNascimento;
        int anoAtual;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = entrada.nextInt();
        System.out.println("Digite o ano de atual: ");
        anoAtual = entrada.nextInt();

        System.out.println("Neste ano de "+anoAtual+" você fez/fará "+(anoAtual-anoNascimento)+" anos de idade!");
    }
}
