public class Aluno {
    public String nome;
    public int ra;
    public double notaTP;
    public double pontuacao;

    public double calcularPontuacao(double desempenhoEsperado) {
        return 4 * (this.notaTP - desempenhoEsperado);
    }
}