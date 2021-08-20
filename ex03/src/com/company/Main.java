package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor informar o tipo de serviço para a empresa 1. (1 e 2)");
        int tipoServicoEmpresa1 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 2. (1 e 2)");
        int tipoServicoEmpresa2 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 3. (1 e 2)");
        int tipoServicoEmpresa3 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 4. (1 e 2)");
        int tipoServicoEmpresa4 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 5. (1 e 2)");
        int tipoServicoEmpresa5 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 6. (1 e 2)");
        int tipoServicoEmpresa6 = teclado.nextInt();

        System.out.println("Favor informar o tipo de serviço para a empresa 7. (1 e 2)");
        int tipoServicoEmpresa7 = teclado.nextInt();

        if(tipoServicoEmpresa1 == 1)
            System.out.println("A empresa 1 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 1 tem a fatura: " + 2200);

        if(tipoServicoEmpresa2 == 1)
            System.out.println("A empresa 2 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 2 tem a fatura: " + 2200);

        if(tipoServicoEmpresa3 == 1)
            System.out.println("A empresa 3 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 3 tem a fatura: " + 2200);

        if(tipoServicoEmpresa4 == 1)
            System.out.println("A empresa 4 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 4 tem a fatura: " + 2200);

        if(tipoServicoEmpresa5 == 1)
            System.out.println("A empresa 5 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 5 tem a fatura: " + 2200);

        if(tipoServicoEmpresa6 == 1)
            System.out.println("A empresa 6 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 6 tem a fatura: " + 2200);

        if(tipoServicoEmpresa7 == 1)
            System.out.println("A empresa 7 tem a fatura: " + 1500);
        else
            System.out.println("A empresa 7 tem a fatura: " + 2200);


    }
}
