

package com.mycompany.calculadora;

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Bem vindo a calculadora. ");
        Scanner scanner = new Scanner(System.in);
        Operadores ops = new Operadores();
        
        System.out.println("Informe o primeioro valor");
        float v1=scanner.nextFloat();
        System.out.println("Informe o segundo valor");
        float v2=scanner.nextFloat();
        
        System.out.println("escolha\n 1 para soma\n 2 para subtração\r 3 para divisao\n 4 para multiplicação: ");
        
        int digitado=scanner.nextInt();
        float resultado=ops.escolha(digitado, v1, v2);
        System.out.println("O resultado e: "+resultado);
        
    }
}
