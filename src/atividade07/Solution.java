package atividade07;

class Solution {
    /*
    * Given an array of integers nums and an integer target, return
    * indices of the two numbers such that they add up to target.
    * You may assume that each input would have exactly one solution,
    * and you may not use the same element twice. You can return the
    * answer in any order.
    * */
    public int[] twoSum(int[] nums, int target) {
        //Declarando e iniciando as variaveis!
        int value = 0, index1=0 , index2 = 0;
        //For para percorrer o nums
        for (int i = 0; i < nums.length; i++) {
            //variavel value pega o quanto falta pra chegar em target
            value = target - nums[i];
            //for para percorrer o nums
            for (int j = 0; j < nums.length; j++) {
                //o if checa se os indices dos dois fors sao iguais, se sim não pode ser usado
                //e como é só uma 'médida de segurança' pra nao repetir os indices só dou continue
                if(i == j){
                    continue;
                    // esse if checa se o valor nesse indice j é igual ao valor
                }else if(nums[j] == value){
                    index1 = i;
                    index2 = j;
                    //ao entrar nesse if encontramos o resultado
                    return new int[]{index1,index2};
                }
            }
        }
        //return null caso não entre no if de cima e como médida de segurança
        return null;
    }
}
