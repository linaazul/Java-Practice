package atividade01;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation){
            return true;
        } else if(weekday && !vacation){
            return false;
        } else if (!weekday && vacation) {
            return true;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        SleepIn obj = new SleepIn();
        boolean result = obj.sleepIn(true, true);
        System.out.println("Posso voltar a dormir? " + result);
    }
}