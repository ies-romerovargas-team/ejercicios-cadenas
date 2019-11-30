package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ANSI_RED="\u001B[31m";
        String ANSI_GREEN="\u001B[32m";
        String ANSI_PURPLE="\u001B[35m";
        String ANSI_PURPLE_BACKGROUND="\u001B[45m";
        String ANSI_YELLOW="\u001B[33m";
        String ANSI_RESET="\u001B[0m";
        String ANSI_YELLOW_BACKGROUND="\u001B[43m";
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.print(ANSI_PURPLE_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.println("MENÚ EJERCICIOS ADICIONALES DE ARRAYS");
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_PURPLE);
            System.out.print("1. numeroEspacios");
            System.out.print("\t2. numeroVocales");
            System.out.print("\t3. esPalindromo");
            System.out.print("\t\t\t4. contiene");
            System.out.println("\t\t\t\t5. repiteCaracter");
            System.out.print("6. padLeft-padRight");
            System.out.print("\t7. quitaEspacios");
            System.out.print("\t8. quitaEspaciosTrim");
            System.out.print("\t\t9. sustituyeCaracter");
            System.out.println("\t10. cuentaPalabras");
            System.out.print(ANSI_PURPLE_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.println("0. Finalizar");
            System.out.print(ANSI_RESET);
            System.out.print("Indique opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1: {
                    String a = "En un lugar de la Mancha";
                    System.out.println(a);
                    System.out.println(numeroEspacios(a));
                }
                break;
                case 2: {
                    String a = "La cigüeña vino de París, pero con el pico vacío";
                    System.out.println(a);
                    System.out.println(numeroVocales(a));
                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;
                case 6: {

                }
                break;
                case 7: {

                }
                break;
                case 8: {

                }
                break;
                case 9: {
                }
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static boolean esPalindromo(String a)
    {
        //dabale arroz a la zorra el abad
    }

    public static boolean encuentra(String b, char a)
    {
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a ) return true;
        }
        return false;
    }

    public static int numeroVocales(String a)
    {
        int vc = 0;
        String compara = "aáAÁeéEÉiíIÍoóOÓuúüUÚÜ";
        for (int i = 0; i < a.length(); i++) {
            if(encuentra(compara, a.charAt(i))) vc++;
        }
        return vc;
    }

    public static int numeroEspacios(String a)
    {
        int sp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') sp++;
        }
        return sp;
    }
}