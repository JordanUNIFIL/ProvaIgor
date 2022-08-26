package com.mycompany.provaigor;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        int maior, menor;
        Scanner sc = new Scanner(System.in);
        maior = 0;
        menor = 0;
        System.out.println("Informe o valor do primeiro número");
        n1 = sc.nextInt();
        System.out.println("Informe o valor do segundo número");
        n2 = sc.nextInt();
        System.out.println("Informe o valor do terceiro número");
        n3 = sc.nextInt();
        System.out.println("Informe o valor do quarto número");
        n4 = sc.nextInt();
        System.out.println("Informe o valor do quinto número");
        n5 = sc.nextInt();
        if (n1 >= maior) {
            maior = n1;
            menor = n1;
        }
        if (n2 >= maior) {
            maior = n2;

        } else if (n2 <= menor) {
            menor = n2;

        }
        if (n3 >= maior) {
            maior = n3;

        } else if (n3 <= menor) {
            menor = n3;

        }
        if (n4 >= maior) {
            maior = n4;

        } else if (n4 <= menor) {
            menor = n4;

        }
        if (n5 >= maior) {
            maior = n5;

        } else if (n5 <= menor) {
            menor = n5;

        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: "+ menor);

    }
}
