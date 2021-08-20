package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdeLeDiarioABC = 0;
        int qtdeLeDiarioAC = 0;
        int qtdeLeDiarioAB = 0;
        int qtdeLeDiarioBC = 0;
        int qtdeLeDiarioA = 0;

        for (int i = 0; i < 50; i++){
            int leDiarioA = 2;
            int leDiarioB = 2;
            int leDiarioC = 2;

            System.out.println("Vamos falar sobre o entrevistado numero: " + (i+1));
            System.out.println("Ele le o Diário A? (1 - Sim e 2 - Nao)");
            leDiarioA = teclado.nextInt();

            System.out.println("Ele le o Diário B? (1 - Sim e 2 - Nao)");
            leDiarioB = teclado.nextInt();

            System.out.println("Ele le o Diário C? (1 - Sim e 2 - Nao)");
            leDiarioC = teclado.nextInt();

            if(leDiarioA == 1 && leDiarioB != 1 && leDiarioC != 1)
                qtdeLeDiarioA += 1;
            else if(leDiarioA == 1 && leDiarioB != 1 && leDiarioC == 1)
                qtdeLeDiarioAC += 1;
            else if(leDiarioA == 1 && leDiarioB == 1 && leDiarioC != 1)
                qtdeLeDiarioAB += 1;
            else if(leDiarioA != 1 && leDiarioB == 1 && leDiarioC == 1)
                qtdeLeDiarioBC += 1;
            else if(leDiarioA == 1 && leDiarioB == 1 && leDiarioC == 1)
                qtdeLeDiarioABC += 1;
        }

        System.out.println("Quantidade de leitores que leem apenas o Diario A: " + qtdeLeDiarioA);
        System.out.println("Quantidade de leitores que leem apenas o Diario A e C: " + qtdeLeDiarioAC);
        System.out.println("Quantidade de leitores que leem apenas o Diario A e B: " + qtdeLeDiarioAB);
        System.out.println("Quantidade de leitores que leem apenas o Diario B e C: " + qtdeLeDiarioBC);
        System.out.println("Quantidade de leitores que leem o Diario A, B e C: " + qtdeLeDiarioABC);
    }
}
