package atividade03;

public class nearHundredClass {
    public boolean nearHundred(int n) {
        // Checa a distancia entre n - 100 e n - 200
        // Caso a distancia seja menor que 10 retorna true
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10){
            return true;
        }
        return false;
    }
}
