package lista8.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CriarContaCorrente c1 = new CriarContaCorrente();
        CriarContaCorrente c2 = new CriarContaCorrente();

        System.out.print("Nome do Cliente: ");
        c1.nomeCliente = sc.nextLine();
        System.out.print("Saldo da Conta: ");
        c1.saldo = sc.nextDouble();
        System.out.print("Taxa Juros do Cliente: ");
        c1.taxaJuros = sc.nextDouble();

        System.out.print("\nNome do Cliente: ");
        c2.nomeCliente = sc.next();
        sc.nextLine();
        System.out.print("Saldo da Conta: ");
        c2.saldo = sc.nextDouble();
        System.out.print("Taxa Juros do Cliente: ");
        c2.taxaJuros = sc.nextDouble();

        System.out.println("\n-- Cliente 1 --");
        c1.exibirNome();
        c1.exibirSaldo();
        c1.exibirTaxaJuros();

        System.out.println("\n-- Cliente 2 --");
        c2.exibirNome();
        c2.exibirSaldo();
        c2.exibirTaxaJuros();
    }
}
