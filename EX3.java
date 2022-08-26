package com.mycompany.provaigor;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        int seconds = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a massa do material em gramas: ");
        int massain = sc.nextInt();
        double massa = massain;
        do {
            massa = massa / 2;
            seconds = seconds + 50;
        } while (massa > 0.5);
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.println("Massa Inicial: " + massain);
        System.out.println("Massa Final: " + massa);
        System.out.println("Horas: " + p2 + " Minutos: " + p3 + " Segundos: " + p1);
        System.out.println("\n");
        System.out.println("Total de segundos: " + seconds);
    }
}
