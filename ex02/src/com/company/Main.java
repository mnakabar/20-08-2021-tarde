package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o RG do funcionario!");
        String rg = teclado.nextLine();

        System.out.println("Favor informar o salario atual do funcionario");
        double salarioAtual = teclado.nextDouble();

        double valorAumento = 0;

        if(salarioAtual <= 20000.0){
            valorAumento = salarioAtual * 20 / 100;

            System.out.println("O funcionario com o RG " + rg + " com salario " + salarioAtual + " teve concedido um aumento de 5% que equivale o valor " + valorAumento);
        }
        else if(salarioAtual > 20000.0 && salarioAtual <= 45000){
            valorAumento = salarioAtual * 10 / 100;

            System.out.println("O funcionario com o RG " + rg + " com salario " + salarioAtual + " teve concedido um aumento de 5% que equivale o valor " + valorAumento);
        }
        else{
            valorAumento = salarioAtual * 5 / 100;

            System.out.println("O funcionario com o RG " + rg + " com salario " + salarioAtual + " teve concedido um aumento de 5% que equivale o valor " + valorAumento);
        }
    }
}
