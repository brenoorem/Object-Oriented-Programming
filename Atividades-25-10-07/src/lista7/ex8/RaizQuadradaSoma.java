package lista7.ex8;

import java.util.Scanner;

public class RaizQuadradaSoma {
    public void RaizQuadradaSoma(){
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        double soma = 0;

        while(!entrada.equalsIgnoreCase("F")){
            System.out.print("Digite o valor desejado: ");
            entrada = scanner.nextLine();
            if(entrada.equalsIgnoreCase("F")){
                System.out.println("A soma dos números é: " + soma);
                System.out.println("A raiz quadrada da soma dos números é: " + Math.sqrt(soma));
            }
            else{
                soma += Integer.parseInt(entrada);
            }

        }

    }
}
