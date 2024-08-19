package a16;

import a15.Atividade15;

public class Atividade16 {
    public static void main(String[] args) {
        //Puxa as informações da classe referente e atribui a uma variável
        Atividade15 atividade15 = new Atividade15();
        //Executa o método da classe em evidência
        atividade15.dataNascimento();

        /*Executa uma verificação, onde ele coleta o número do mês informado e
        * informa ao usuário o número do trimestre ao mes respectivo */

        if (atividade15.validadeData) {
            String trimestre = "";

            if (atividade15.mes >= 1 && atividade15.mes <= 3) {
                trimestre = "1º Trimestre";
            } else if (atividade15.mes >= 4 && atividade15.mes <= 6) {
                trimestre = "2º Trimestre";
            } else if (atividade15.mes >= 7 && atividade15.mes <= 9) {
                trimestre = "3º Trimestre";
            } else if (atividade15.mes >= 10 && atividade15.mes <= 12) {
                trimestre = "4º Trimestre";
            }

            System.out.println("Você nasceu no " + trimestre + ".");
        }
    }
}
