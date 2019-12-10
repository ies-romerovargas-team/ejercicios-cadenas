package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

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
            System.out.print("\t\t10. limpiaCadena");
            System.out.print("\t\t11. compruebaEmail");
            System.out.print(repiteCaracter(' ', 28));
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
                case 3: {
                    System.out.print("Introduzca una cadena: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println("[a, b, c, d, e]");
                    escribeArray(cuentaLetras(a));
                    System.out.println("[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ñ]");
                    escribeArray(cuentaLetrasPro(a));
                }
                break;
                case 4: {
                    // Método de entrada por teclado que permite los saltos de líneas
                    String texto = null;
                    System.out.println("Introduzca un texto:");
                    texto = leeTexto();
                    System.out.println();
                    //Submenu
                    System.out.println("1. Todas las letras en minúsculas");
                    System.out.println("2. Todas las letras en mayúsculas");
                    System.out.println("3. La primera letra de cada palabra en mayúsculas, el resto en minúsculas");
                    System.out.println("4. La primera letra de cada palabra en frase, el resto en minúsculas");
                    System.out.print("Indique su opción: ");
                    int b = sc.nextInt();
                    System.out.println(mayusculasMinusculas(texto, b));
                }
                break;
                case 5: {
                    System.out.print("Introduzca un texto: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(eliminaTags(a));
                }
                break;
                case 6: {
                    System.out.print("Introduzca un texto: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(ordenaPalabrasComas(a));
                }
                break;
                case 7: {
                    System.out.print("Introduzca un texto: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(acentosHTML(a));
                }
                break;
                case 8: {
                    System.out.print("Introduzca un texto: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    String[] b = palabrasMismaLetra(a);
                    System.out.print("{");
                    int i;
                    for (i = 0; i < b.length - 1; i++) {
                        System.out.print(b[i]);
                        System.out.print(", ");
                    }
                    System.out.print(b[i]);
                    System.out.print("}");
                }
                break;
                case 9: {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(numeroTexto999(i));
                    }
                }
                break;
                case 10: {
                    System.out.print("Introduzca un texto: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    System.out.println(limpiaCadena(a));
                }
                break;
                case 11: {
                    System.out.print("Introduzca una dirección de email: ");
                    String a = sc.nextLine();   // limpiar buffer
                    a = sc.nextLine();
                    if(compruebaEmail(a)) {
                        System.out.println("La dirección es válida");
                    }
                    else
                    {
                        System.out.println("La dirección no es válida");
                    }
                }
                default: {
                    // opcion no válida
                }
            }
        }
    }

    public static boolean compruebaEmail(String a)
    {
        /*if(a.matches("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$")){
            return true;
        } else return false;*/
        // Manual
        String permitidos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-.";
        boolean valido = false;
        String[] parte = a.split("@");
        if(parte.length==2) // Sólo hay una @
        {
            if(!parte[0].equals("")) // La @ no está al principio
            {
                // Cada parte (usuario/dominio) no podrá tener acentos ni ñ, ni empezar por punto
                for (int i = 0; i < parte.length; i++)
                {
                    for (int j = 0; j < parte[i].length(); j++)
                    {
                        // Sólo caracteres permitidos
                        if(permitidos.indexOf(parte[i].charAt(j))==-1){
                            valido = false;
                        }
                        // No empezar o terminar con punto, con guión, o contener dos puntos seguidos
                        if(parte[i].charAt(0)=='.' || parte[i].charAt(parte[i].length() - 1)=='.' ||
                                parte[i].charAt(0)=='-' || parte[i].charAt(parte[i].length() - 1)=='-' ||
                        parte[i].contains(".."))
                        {
                            valido = false;
                        }
                        else
                        {
                            valido = true;
                        }
                    }
                }
            }
        }
        return valido;
    }

    public static String limpiaCadena(String a)
    {
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if(Character.isLetter(a.charAt(i)))
            {
                b = b + a.charAt(i);
            }
            else
            {
                b = b + " ";
            }
        }
        b = quitaEspaciosSobrante(b);
        return b;
    }

    public static String leeTexto()
    {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String a = "";
        while (!cadena.equals(""))
        {
            a = a + cadena + "\n";
            cadena = sc.nextLine();
        }
        return a;
    }

    public static String numeroTexto999(int n)
    {
        String texto;
        int unidDec = n % 100;
        int centenas = n / 100;
        if(n < 100)
        {
            texto = numeroTexto99(n);
        }
        else
        {
            if(n == 100)
            {
                texto = "cien";
            }
            else
            {
                String[] textoCent = {"", "ciento", "doscientos", "trescientos", "cuatrocientos",
                        "quinientos", "seiscientos", "setecientos", "ochocientos",
                        "novecientos"};

                if(unidDec == 0)
                {
                    texto = textoCent[centenas];
                }
                else
                {
                    texto = textoCent[centenas] + " " + numeroTexto99(unidDec);
                }
            }
        }

        return texto;
    }

    public static String numeroTexto99(int a)
    {
        String[] diez = {"diez", "once", "doce", "trece", "catorce", "quince"};
        String[] siguientes = {"dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        if(a<0 || a>99)
        {
            return "";
        }
        else
        {
            String b = "";
            if(a < 10){
              return numeroTexto9(a);
            }
            else if(a>=10 && a<=15)
            {
                return diez[a - 10];
            }
            else if (a>15)
            {
                int decena = a/10;
                b = siguientes[decena - 1];
                if (a - decena * 10 != 0)
                {
                    if(decena==1 || decena==2)
                    {
                        if(a==22) {
                            b = "veintidós";
                        } else if(a==16)
                        {
                            b = "dieciséis";
                        } else {
                            b = b + numeroTexto9(a - (decena * 10));
                        }
                    }
                    else
                    {
                        b = b + " y " + numeroTexto9(a - (decena * 10));
                    }
                }
                else
                {
                    if(decena==2) b ="veinte";
                }
            }
            return b;
        }
    }

    public static String numeroTexto9(int a)
    {
        String[] texto = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        return texto[a];
    }

    public static String[] palabrasMismaLetra(String a) {
        a = a.toLowerCase();
        String[] palabras = a.split("[ ,.-]");
        String aux = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) {
                if (palabras[i].charAt(0) == palabras[i].charAt(palabras[i].length() - 1)) {
                    aux = aux + palabras[i];
                    if (i < palabras.length - 1) aux = aux + ";";
                }
            }
        }
        palabras = aux.split(";");
        return palabras;
    }

    public static String acentosHTML(String a) {
        String letraLat = "<>&\"áÁéÉíÍóÓúÚñÑüÜ";
        String[] htmlCode = {"&lt;", "&gt;", "&amp;", "&quot;", "&aacute;", "&Aacute;", "&aecute;", "&Eacute;", "&iacute;", "&Iacute;", "&oacute;", "&Oacute;", "&uacute;", "&Uacute;", "&ntilde;", "&Ntilde;", "&uuml;", "&Uuml;"};
        String aux = "";
        boolean encontrada = false;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < letraLat.length(); j++) {
                if (a.charAt(i) == letraLat.charAt(j)) {
                    aux = aux + htmlCode[j];
                    encontrada = true;
                }
            }
            if (!encontrada) {
                aux = aux + a.charAt(i);
            }
            encontrada = false;
        }
        return aux;
    }

    public static String ordenaPalabrasComas(String a) {
        // método burbuja
        String[] b;
        b = a.split(",");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j].compareTo(b[j + 1]) > 0) { // b[j] > b[j + 1]
                    String c = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = c;
                }
            }
        }
        String c = "";
        for (int i = 0; i < b.length; i++) {
            c = c + b[i];
            if (i < b.length - 1) c = c + ",";
        }
        return c;
    }

    public static String eliminaTags(String a) {
        StringBuilder sb = new StringBuilder();
        boolean proceso = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '<') {
                proceso = true;
            } else if (a.charAt(i) == '>') {
                proceso = false;
            } else if (!proceso) sb.append(a.charAt(i));
        }
        return sb.toString();
    }

    public static String mayusculasMinusculas(String a, int b) {
        String c = "";
        boolean may = true;
        if (b < 1 || b > 4) {
            return "Opción incorrecta";
        } else {
            switch (b) {
                case 1:
                    c = a.toLowerCase();
                    break;
                case 2:
                    c = a.toUpperCase();
                    break;
                case 3:
                    for (int i = 0; i < a.length(); i++) {
                        if(may)
                        {
                            c = c + Character.toUpperCase(a.charAt(i));
                            may = false;
                        }
                        else
                        {
                            c = c + a.charAt(i);
                        }
                        if(a.charAt(i)==' ' || a.charAt(i)=='\n') may = true;
                    }
                break;
                case 4:

                    for (int i = 0; i < a.length(); i++) {
                        if(may)
                        {
                            c = c + Character.toUpperCase(a.charAt(i));
                            may = false;
                        }
                        else
                        {
                            c = c + a.charAt(i);
                        }
                        if(a.charAt(i)=='.' || a.charAt(i)=='\n') may = true;
                    }
                    break;
            }
            return c;
        }
    }

    public static int[] cuentaLetrasPro(String a) {
        int j = 0;
        int[] array;
        array = new int[27];
        // preprocesado para optimizar la búsqueda
        // Pasamos todas a minúsculas
        a = a.toLowerCase();
        // Eliminamos acentos
        a = quitaAcentos(a);
        //int r = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 96 && a.charAt(i) < 123) {
                j = array[a.charAt(i) - 97];
                array[a.charAt(i) - 97] = ++j;
            }
            if (a.charAt(i) > 240 && a.charAt(i) < 243) {
                j = array[26];
                array[26] = ++j;
            }
        }
        return array;
    }

    public static int[] cuentaLetras(String a) {
        int j = 0;
        int[] array;
        array = new int[5];
        a = a.toLowerCase();// Pasamos todas a minúsculas
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 96 && a.charAt(i) < 102) {
                j = array[a.charAt(i) - 97];
                array[a.charAt(i) - 97] = ++j;
            }
        }
        return array;
    }

    public static void escribeNombres(String a) {
        a = a + ".";
        char[] cadena;
        cadena = new char[a.length()];
        String[] ristra;
        ristra = new String[3];
        int j = 0;
        int p = 0;
        int indice = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetter(a.charAt(i))) {
                ristra[j] = a.substring(indice, p);
                indice = ++p;
                j++;
            } else {
                cadena[p] = a.charAt(i);
                p++;
            }
            if (j == 3) {
                System.out.println(ristra[2] + " " + ristra[0] + " " + ristra[1]);
                j = 0;
            }
        }
    }

    public static String marcaSubCadena(String a, String b) {
        int i;
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < (a.length() - b.length()); i++) {
            if (b.equals(a.substring(i, i + b.length()))) {
                sb.append('*');
            } else {
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

    public static void escribeArray(int[] a) {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }

    public static String sustituyeCaracter(String a, char b, char c) {
        String aux = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                aux = aux + c;
            } else {
                aux = aux + a.charAt(i);
            }
        }

        return aux;
    }

    public static String quitaAcentos(String a) {
        String acentos = "áÁéÉíÍóÓúÚüÜ";
        String normal = "aAeEiIoOuUuU";
        for (int i = 0; i < acentos.length(); i++) {
            a = sustituyeCaracter(a, acentos.charAt(i), normal.charAt(i));
        }
        return a;
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
    }

}