package atividade04;

import java.util.ArrayList;

public class missingCharClass {
    public String missingChar(String str, int n){

        //solução do codebat
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;

        //minha solução mais complexa hehe
//        char [] lista = str.toCharArray();
//        ArrayList<Character> copiaLista = new ArrayList<Character>();
//
//        for(char caracter : lista){
//            copiaLista.add(caracter);
//        }
//
//        copiaLista.remove(n);;
//
//        return copiaLista.toString();
    }
}


