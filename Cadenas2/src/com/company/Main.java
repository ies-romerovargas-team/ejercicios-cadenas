package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
            System.out.print("  MENÚ EJERCICIOS CADENAS (I)");
            System.out.print(repiteCaracter(' ', 61));
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 11. esNumero");
            System.out.print("\t\t\t12. quitaCaracter");
            System.out.print("\t13. quitaAcentos");
            System.out.print("\t\t14. invierteCadena   ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 15. vecesCaracter");
            System.out.print("\t\t16. vecesPalabra");
            System.out.print("\t17. mayusculasPrimera");
            System.out.print("\t18. sustituyePalabra ");
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.print(ANSI_NORMAL);
            System.out.print(ANSI_YELLOW_BACKGROUND);
            System.out.print(ANSI_BLACK);
            System.out.print(" 19. inviertePalabras");
            System.out.print("\t20. quitaEspaciosSobrantes");
            System.out.print(repiteCaracter(' ', 39));
            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(" ");
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BLACK_BACKGROUND);
            System.out.print(ANSI_YELLOW);
            System.out.print(ANSI_BOLD);
            System.out.print("  0. Finalizar");
            System.out.print(repiteCaracter(' ', 76));
            System.out.println(ANSI_RESET);

            System.out.print(ANSI_BOLD);
            System.out.print("Indique opcion: ");
            System.out.print(ANSI_RESET);
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 11: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    if (esNumero(a)) {
                        System.out.println("Formada por números");
                    } else {
                        System.out.println("No está formada sólo por números");
                    }
                }
                break;
                case 12: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.print("Introduzca un carácter: ");
                    char b = sc.next().charAt(0);
                    System.out.println(quitaCaracter(a, b));
                }
                break;
                case 13: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(quitaAcentos(a));
                }
                break;
                case 14: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(invierteCadena(a));
                }
                break;
                case 15: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.print("Introduzca un carácter: ");
                    char b = sc.next().charAt(0);
                    System.out.println(vecesCaracter(a, b));
                }
                break;
                case 16: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.print("Introduzca una palabra: ");
                    String b = sc.nextLine();
                    System.out.println(vecesPalabra(a, b));
                }
                break;
                case 17: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(mayusculasPrimera(a));
                }
                break;
                case 18: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.print("Introduzca la palabra a buscar: ");
                    String b = sc.nextLine();
                    System.out.print("Introduzca la palabra sustituta: ");
                    String c = sc.nextLine();
                    System.out.println(sustituyePalabra(a, b, c));
                }
                break;
                case 19: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(inviertePalabras(a));
                }
                break;
                case 20: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(quitaEspaciosSobrante(a));
                }
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static String quitaEspaciosSobrante(String a)
    {
        a = quitaEspaciosTrim(a);
        String a1 = quitaDobleEspacio(a);
        while(!a.equals(a1))
        {
            a = a1;
            a1 = quitaDobleEspacio(a1);
        }
        return a;
    }

    public static String quitaDobleEspacio(String a)
    {
        StringBuilder sb = new StringBuilder();
        boolean control = false;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
            {
                sb.append(' ');
                i++;
            } else {
                sb.append(a.charAt(i));
            }
        }
        sb.append(a.charAt(a.length() - 1));
        return sb.toString();

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == b) {
//                sb.append(c); // sb = sb + c;
//            } else {
//                sb.append(a.charAt(i)); // sb = sb + a.charAt(i)
//            }
//        }
//        return sb.toString();
    }

    public static String sustituyePalabra(String a, String b, String c) {
        boolean ini, fin;
        for (int i = 0; i < a.length() - b.length() + 1; i++) {
            if (b.equals(a.substring(i, b.length() + i))) {
                // Encontrada coincidencia ¿es una palabra?
                // Ver si antes y después existen otras letras
                ini = false;
                fin = false;
                if (i > 0) {
                    if (!Character.isLetter(a.charAt(i - 1))) {
                        ini = true;
                    }
                } else {
                    ini = true;
                }
                if (i < a.length() - b.length()) {
                    if (!Character.isLetter(a.charAt(i + b.length()))) {
                        fin = true;
                    }
                } else {
                    fin = true;
                }
                if (ini && fin) {
                    a = a.substring(0, i) + c + a.substring(i + b.length());
                }
            }
        }
        return a;
    }

    public static String inviertePalabras(String a) {
        String[] cadenaArray = a.split("[ ,.]");
        String b = "";
        for (int i = 0; i < cadenaArray.length; i++) {
            b = b + invierteCadena(cadenaArray[i]) + " ";
        }
        return b;
    }

    public static String mayusculasPrimera(String a) {
        boolean b = true;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                if (b) {
                    a = sustituyeCaracter(a, a.charAt(i), Character.toUpperCase(a.charAt(i)));
                    b = false;
                }
            } else b = true;
        }
        return a;
    }

    public static int vecesPalabra(String a, String b) {
        int c = 0;
        boolean ini, fin;
        for (int i = 0; i < a.length() - b.length() + 1; i++) {
            if (b.equals(a.substring(i, b.length() + i))) {
                // Encontrada coincidencia ¿es una palabra?
                // Ver si antes y después existen otras letras
                ini = false;
                fin = false;
                if (i > 0) {
                    if (!Character.isLetter(a.charAt(i - 1))) {
                        ini = true;
                    }
                } else {
                    ini = true;
                }
                if (i < a.length() - b.length()) {
                    if (!Character.isLetter(a.charAt(i + b.length()))) {
                        fin = true;
                    }
                } else {
                    fin = true;
                }
                if (ini && fin) c++;
            }
        }
        return c;
    }

    public static int vecesCaracter(String a, char b) {
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) c++;
        }
        return c;
    }

    public static String invierteCadena(String a) {
        String aux = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            aux = aux + a.charAt(i);
        }
        return aux;
    }

    public static String quitaCaracter(String a, char b) {
        String aux = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                aux = a.substring(0, i);
                aux = aux + a.substring(i + 1);
                a = aux;
            }
        }
        return a;
    }

    public static boolean esNumero(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) return false;
        }
        return true;
    }

    public static int cuentaPalabras(String a) {
        // Palabra: ristra de carácteres separados por cualquier cosa que no sea una letra
        int palabras = 0;

        // Explicación:
        // Recorremos la cadena en búsqueda de carácteres que no sean letras
        // Cuando encontramos algunos, ponemos la variable proc a true para indicar que se está procesando
        // Mientras proc sea true, no contamos más palabras aunque haya carácteres que no sean letras
        // Cuando encontramos la siguiente letra, proc pasa a ser false, con lo que habilitamos el algoritmo para contar más palabras

        boolean proc = true;

        // Añadimos un punto al final ya que no detectamos el salto de línea
        a = a + ".";

        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetter(a.charAt(i))) {
                if (!proc) palabras++;
                proc = true;
            } else {
                if (Character.isLetter(a.charAt(i))) proc = false;
            }
        }
        return palabras;
    }

    public static String sustituyeCaracter(String a, char b, char c) {
        String aux = "";

//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == b )
//            {
//                aux = a.substring(0, i);
//                aux = aux + c + a.substring(i + 1);
//                a = aux;
//            }
//        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                aux = aux + c;
            } else {
                aux = aux + a.charAt(i);
            }
        }

        return aux;
    }

    public static String sustituyeCaracterPro(String a, char b, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                sb.append(c); // sb = sb + c;
            } else {
                sb.append(a.charAt(i)); // sb = sb + a.charAt(i)
            }
        }
        return sb.toString();
    }


    public static String quitaEspaciosTrim(String a) {
        while (a.charAt(0) == ' ') {
            a = a.substring(1);
        }
        while (a.charAt(a.length() - 1) == ' ') {
            a = a.substring(0, a.length() - 1);
        }
        return a;
    }

    public static String padLeft(String a, int b) {
        int c = a.length(); // longitud original
        for (int i = 0; i < (b - c); i++) {
            a = "." + a;
        }
        return a;
    }

    public static String padRight(String a, int b) {
        int c = a.length(); // longitud original
        for (int i = 0; i < (b - c); i++) {
            a = a + ".";
        }
        return a;
    }

    public static String repiteCaracter(char a, int b) {
        String c = "";
        for (int i = 0; i < b; i++) {
            c = c + a;
        }
        return c;
    }

    public static String quitaAcentos(String a) {
        String acentos = "áÁéÉíÍóÓúÚüÜ";
        String normal = "aAeEiIoOuUuU";
        for (int i = 0; i < acentos.length(); i++) {
            a = sustituyeCaracter(a, acentos.charAt(i), normal.charAt(i));
        }
        return a;
    }

    public static String quitaEspacios(String a) {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                b = b + a.charAt(i);
            }
        }
        a = b;
        return a;
    }

    public static boolean contiene(String b, char a) {
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a) return true;
        }
        return false;
    }

    public static int numeroVocales(String a) {
        int vc = 0;
        String compara = "aáAÁeéEÉiíIÍoóOÓuúüUÚÜ";
        for (int i = 0; i < a.length(); i++) {
            if (contiene(compara, a.charAt(i))) vc++;
        }
        return vc;
    }

    public static int numeroEspacios(String a) {
        int sp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') sp++;
        }
        return sp;
    }
}
