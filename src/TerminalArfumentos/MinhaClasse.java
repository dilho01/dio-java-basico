package TerminalArfumentos;

import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("digite algo");
       String algo = scanner.next();

       System.out.println("voce falou " + algo);
    }
}
