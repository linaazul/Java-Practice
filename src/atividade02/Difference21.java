package atividade02;

public class Difference21 {
    public int diff21(int n) {
        if(n<21){
            return 21-n;
        }else{
            return (n-21)*2;
        }
    }

    public static void main(String[] args) {
        // instanciando o objeto da classe Difference21 chamado diff
        Difference21 diff = new Difference21();

        //criando a lista que armazena diferentes valores
        int[] valores = {19,10,21,22};

        //exibindo os resultados a partir de um for each
        for(int valor : valores){
            int result = diff.diff21(valor);
            System.out.println("Diferença: " + result);
        }
    }
}
