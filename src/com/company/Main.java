package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //DADO UN NUMERO ENTERO, REALIZAR LAS SIGUIENTE VALIDACIONES
        System.out.println("ingrese un numero entero entre 1 y 100:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if(numero >= 1 && numero <= 100) {
            if (numero % 2 == 0) {
                if (numero >= 2 && numero <= 5) {
                    System.out.println("No Quipux");
                } else if (numero >= 6 && numero <= 20) {
                    System.out.println("No Quipux");
                } else if (numero > 20) {
                    System.out.println("No Quipux");
                }
            } else System.out.println("Quipux");
        }else System.out.println("por favor ingrese un numero entre 1 y 100");

    }
}
