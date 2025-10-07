package lista7.ex7;

import java.util.Scanner;

public class RepeticaoLetraS {

    Scanner scanner = new Scanner(System.in);

    public void verificaInput() {

        String entrada = "";
        while(!entrada.equalsIgnoreCase("S")) {
            System.out.print("Digite um número: ");
            entrada = scanner.nextLine();
        }

        System.out.println("Fim do Programa!");
    }
}
