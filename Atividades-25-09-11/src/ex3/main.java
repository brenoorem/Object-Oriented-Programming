// Desenvolva um programa em Java que concatene uma string com um número
// inteiro. Utilize o operador '+' e o metodo concat para realizar a operação e
// explique a diferença entre os dois métodos.

package ex3;

public class main {
    public static void main(String[] args) {
         String palavra = "Pão";
         int numero = 1;

        System.out.println(palavra + numero);

        System.out.println(palavra.concat(String.valueOf(numero)));
    }
}
