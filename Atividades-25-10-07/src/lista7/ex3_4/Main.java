package lista7.ex3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContadorCrescente contadorC = new ContadorCrescente();
        ContadorDecrescente contadorDec = new ContadorDecrescente();

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        System.out.println("-- Crescente --");
        contadorC.crescente(numero);
        System.out.println("-- Decrescente --");
        contadorDec.decrescente(numero);
    }
}
