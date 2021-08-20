package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o custo do produto!");
        double custo = teclado.nextDouble();

        System.out.println("Favor informar a fabrica em que o produto foi comprado! (de 1 a 3)");
        int fabrica = teclado.nextInt();

        double precoVenda = custo;
        switch (fabrica)
        {
            case 1:
                precoVenda += precoVenda * 7 / 100;
                break;
            case 2:
                precoVenda += precoVenda * 15 / 100;
                break;
            case 3:
                precoVenda += precoVenda * 22 / 100;
                break;
        }

        precoVenda += precoVenda * 25 / 100;

        System.out.println("O valor de venda será: " + precoVenda);
    }
}
