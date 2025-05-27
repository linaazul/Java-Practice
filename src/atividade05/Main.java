package atividade05;

public class Main {
    public static void main(String[] args) {
        backExercise objBack = new backExercise();
        String[] exemplos = {"cat", "Hello", "a", "abc", "read", "boo"};

        for (String exemplo : exemplos){
            String resultado = objBack.backAround(exemplo);
            System.out.println(resultado);
        }
    }
}
