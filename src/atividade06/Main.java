package atividade06;

public class Main {
    public static void main(String[] args){
        StartExercise objetoStart = new StartExercise();
        String[] options = {"hi there", "hi", "hello hi", "he", "h", "", "ho hi", "hi ho"};

        for (String option : options){
            System.out.println(objetoStart.startHi(option));
        }
    }
}
