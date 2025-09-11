/*Desenvolva um programa em Java que compare dois nomes de alunos utilizando o
metodo compareTo. O objetivo é verificar a ordem lexicográfica entre os nomes e
imprimir qual nome vem primeiro na ordem alfabética.*/

package ex1;

public class Main {
    public static void main(String[] args) {

        String nome1 = "João";
        String nome2 = "Breno";

        if(nome1.compareTo(nome2) < 0){
            System.out.println(nome1);
            System.out.println(nome2);
        }
        else {
            System.out.println(nome2);
            System.out.println(nome1);
        }
    }
}
