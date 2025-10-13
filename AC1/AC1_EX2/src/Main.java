import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o desempenho esperado da turma (1 a 10): ");
        double desempenhoEsperado = sc.nextDouble();
        sc.nextLine();

        Aluno aluno1 = new Aluno();
        System.out.print("\nNome do Aluno 1: ");
        aluno1.nome = sc.nextLine();

        System.out.print("RA do Aluno 1: ");
        aluno1.ra = sc.nextInt();

        System.out.print("Nota do TP do Aluno 1: ");
        aluno1.notaTP = sc.nextDouble();
        aluno1.pontuacao = aluno1.calcularPontuacao(desempenhoEsperado);
        sc.nextLine();
        System.out.println("Pontuação Aluno 1: " + aluno1.pontuacao);

        Aluno aluno2 = new Aluno();
        System.out.print("\nNome do Aluno 2: ");
        aluno2.nome = sc.nextLine();

        System.out.print("RA do Aluno 2: ");
        aluno2.ra = sc.nextInt();

        System.out.print("Nota do TP do Aluno 2: ");
        aluno2.notaTP = sc.nextDouble();
        aluno2.pontuacao = aluno2.calcularPontuacao(desempenhoEsperado);
        sc.nextLine();
        System.out.println("Pontuação Aluno 2: " + aluno2.pontuacao);

        Aluno aluno3 = new Aluno();
        System.out.print("\nNome do Aluno 3: ");
        aluno3.nome = sc.nextLine();

        System.out.print("RA do Aluno 3: ");
        aluno3.ra = sc.nextInt();

        System.out.print("Nota do TP do Aluno 3: ");
        aluno3.notaTP = sc.nextDouble();
        aluno3.pontuacao = aluno3.calcularPontuacao(desempenhoEsperado);
        System.out.println("Pontuação Aluno 3: " + aluno3.pontuacao);

        double maiorNota = Math.max(aluno1.pontuacao, Math.max(aluno2.pontuacao, aluno3.pontuacao));

        if (maiorNota == aluno1.pontuacao) {
            System.out.println("\nAluno " + aluno1.nome + " teve a maior pontuação!");
            System.out.println("RA: " + aluno1.ra);
            System.out.println("Nota TP: " + aluno1.notaTP);
            System.out.println("Pontuação: " + aluno1.pontuacao);
        } else if (maiorNota == aluno2.pontuacao) {
            System.out.println("\nAluno " + aluno2.nome + " teve a maior pontuação!");
            System.out.println("RA: " + aluno2.ra);
            System.out.println("Nota TP: " + aluno2.notaTP);
            System.out.println("Pontuação: " + aluno2.pontuacao);
        } else {
            System.out.println("\nAluno " + aluno3.nome + " teve a maior pontuação!");
            System.out.println("RA: " + aluno3.ra);
            System.out.println("Nota TP: " + aluno3.notaTP);
            System.out.println("Pontuação: " + aluno3.pontuacao);
        }
    }
}
