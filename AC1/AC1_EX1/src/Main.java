import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0, maior = 0, menor = 0, soma = 0, quantidade = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira números inteiros positivos repetidamente. Caso o número seja negativo, o programa encerrará.\n");

        while (true) {
            System.out.print("Digite um Número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            if (quantidade == 0) {
                menor = numero;
                maior = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            soma += numero;
            quantidade++;
        }

        if (quantidade > 0) {
            media = (double) soma / quantidade;
            System.out.println("-- Resultados --");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Não foram inseridos numeros positivos.");
        }
    }
}