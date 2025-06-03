package atividade07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solucao = new Solution();
        int[] resultado = solucao.twoSum(new int[]{-1,-2,-3,-4,-5}, -8);
        System.out.println(Arrays.toString(resultado));
    }
}
