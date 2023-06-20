package com.mycompany.calculadora;


public class Operadores {
    
    
    public float escolha(int n, float v1, float v2){
        if(n==1){
            System.out.println("Voce escolheu soma ");
            return v1+v2;
        }else if(n==2){
            System.out.println("Voce escolheu subtração ");
            return v1-v2;
        }else if(n==3){
            System.out.println("Voce escolheu divisão ");
            return v1/v2;
        }else if(n==4){
            System.out.println("Voce escolheu multiplicação ");
            return v1*v2;
        }
        
        return 0;
    }
    
}
