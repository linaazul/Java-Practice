package atividade06;

public class StartExercise {
    public boolean startHi(String str){
        str = str.toLowerCase();
        if(str.startsWith("hi")){
            return true;
        }
        return false;
    }
}
