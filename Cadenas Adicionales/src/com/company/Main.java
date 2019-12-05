package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_BOLD = "\u001B[01m";
        String ANSI_NORMAL = "\u001B[02m";
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.print(ANSI_BOLD);
            System.out.print("  MENÚ EJERCICIOS CADENAS (ADICIONALES)");
            System.out.print(repiteCaracter(' ', 56));
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 1. marcaSubCadena");
            System.out.print("\t\t2. escribeNombres");
            System.out.print("\t\t3. cuentaLetras");
            System.out.print("\t\t4. mayusculasMinusculas   ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 5. eliminaTags");
            System.out.print("\t\t6. ordenaPalabrasComas");
            System.out.print("\t7. acentosHTML");
            System.out.print("\t\t8. palabrasMismaLetra     ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 9. numeroTexto99");
            System.out.print(repiteCaracter(' ', 76));
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.print(ANSI_BOLD);
            System.out.print("  0. Finalizar");
            System.out.print(repiteCaracter(' ', 81));
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BOLD);
            System.out.print("Indique opcion: ");
            System.out.print(ANSI_RESET);
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.print("Introduzca otra cadena: ");
                    String b = sc.nextLine();
                    System.out.println(marcaSubCadena(a, b));
                }
                break;
                case 2: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    escribeNombres(a);
                }
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                break;
                case 8:
                break;
                case 9:
                break;
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static void escribeNombres(String a)
    {
        a = a + ".";
        char[] cadena;
        cadena = new char[a.length()];
        String[] ristra;
        ristra = new String[3];
        int j = 0;
        int p = 0;
        int indice = 0;
        for (int i = 0; i < a.length(); i++) {
            if(!Character.isLetter(a.charAt(i)))
            {
                ristra[j] = a.substring(indice, p);
                indice = ++p;
                j++;
            }
            else
            {
                cadena[p] = a.charAt(i);
                p++;
            }
            if(j==3){
                System.out.println(ristra[2] + " " + ristra[0] + " " + ristra[1]);
                j = 0;
            }
        }
    }

    public static String marcaSubCadena(String a, String b)
    {
        int i;
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < (a.length()-b.length()); i++) {
            if(b.equals(a.substring(i,i+b.length())))
            {
                sb.append('*');
            }
            else
            {
                sb.append(a.charAt(i));
            }
        }
        sb.append(a.substring(i));
        return sb.toString();

    }

    public static String repiteCaracter(char a, int b) {
        String c = "";
        for (int i = 0; i < b; i++) {
            c = c + a;
        }
        return c;
    }
}
