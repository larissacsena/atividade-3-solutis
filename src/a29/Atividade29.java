package a29;

import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ponto X do item 1: ");
        int x1 = sc.nextInt();
        System.out.println("Informe o ponto Y do item 1: ");
        int y1 = sc.nextInt();

        System.out.println("Informe o ponto X do item 2: ");
        int x2 = sc.nextInt();
        System.out.println("Informe o ponto Y do item 2: ");
        int y2 = sc.nextInt();

        if (x1==x2 && y1==y2){
            System.out.println("As coordenadas representam um ponto");
        }
        // X mantém o mesmo valor, porém Y tem valores distintos, representando apenas mudança vertical
        else if (x1==x2){
            System.out.println("As coordenadas representam uma reta vertical");
        }
        // Y mantém o mesmo valor, porém X tem valores distintos, representando apenas mudança horizontal
        else if (y1==y2){
            System.out.println("As coordenadas representam uma reta horizontal");
        }
        else{
            System.out.println("As coordenadas podem representar um quadrado ou retângulo");
        }


    }

}
