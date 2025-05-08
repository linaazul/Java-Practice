package praticaJava;

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
        boolean result = obj.sleepIn(false, false);
        System.out.println("Podemos dormir? " + result);
    }
}
