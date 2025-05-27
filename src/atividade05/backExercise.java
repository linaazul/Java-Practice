package atividade05;

public class backExercise {
    public String backAround(String str) {
        String ultimaLetra = str.substring(str.length() -1);
        return ultimaLetra + str + ultimaLetra;
    }
}
