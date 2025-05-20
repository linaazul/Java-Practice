package atividade03;

public class Main {
    public static void main(String[] args) {
        nearHundredClass near = new nearHundredClass();
        // lista com os valores dados pelo codeBat
        int[] listaValores = {93, 90, 89, 110, 111, 121, -101, -209, 190, 209, 0,
                5, -50, 191, 189, 200, 210, 211, 290};

        //forEach para checar cada valor dado na lista sem repetir vários souts
        for (int valor : listaValores){
            boolean resultado = near.nearHundred(valor);
            System.out.println(valor+ " está 10 casas perto de " +
                    "100 ou de 200? "+ resultado);
        }
    }
}
