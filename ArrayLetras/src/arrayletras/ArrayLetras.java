package arrayletras;

import java.util.ArrayList;
import java.util.List;

public class ArrayLetras {

    public static void main(String[] args) {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        List<Character> consonantes = new ArrayList();
        List<Character> vocales = new ArrayList();
        for (int i = 0; i < letras.length(); i++) {
            System.out.println((i + 1) + ". " + letras.toUpperCase().charAt(i) + " " + 
                    letras.toLowerCase().charAt(i));
        }
        for (int i = 0; i < letras.length(); i++) {
            if (letras.charAt(i) == 'a' ||
                    letras.charAt(i) == 'e'||
                    letras.charAt(i) == 'i'||
                    letras.charAt(i) == 'o'||
                    letras.charAt(i) == 'u') {
                vocales.add(letras.charAt(i));
            } else {
                consonantes.add(letras.charAt(i));
            }
        }
        System.out.print("Vocales: ");
        for (Character v : vocales) {
            System.out.print(v);
        }
        System.out.println("\n");
        System.out.print("Consonantes: ");
        for (Character c : consonantes) {
            System.out.print(c);
        }
        System.out.println("\n");
    }
    
}
