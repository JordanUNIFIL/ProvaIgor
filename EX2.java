package com.mycompany.provaigor;

public class EX2 {

    public static void main(String[] args) {
        System.out.println("O salário incial em 1995 era de: R$ 1000,00");
        int year;
        double salario, aumento, porcentagem;
        salario = 1150;
        porcentagem = 1.5;
        year = 1997;
        do {
                porcentagem = porcentagem * 2;
                aumento = salario * porcentagem;
                salario = salario + aumento;
                year = year + 1;
        } while (year == 2022);
        System.out.println("O salário atual em 2022 é de: R$ " + salario);
    }

}
