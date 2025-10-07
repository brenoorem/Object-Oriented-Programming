package lista8.ex1;

public class CriarContaCorrente {
    String nomeCliente;
    double saldo;
    double taxaJuros;

    public void exibirNome() {
        System.out.println("Nome do cliente: " + nomeCliente);
    }

    public void exibirSaldo(){
        System.out.println("Saldo do cliente: " + saldo);
    }

    public void exibirTaxaJuros(){
        System.out.println("Taxa Juros do cliente: " + taxaJuros);
    }
}
