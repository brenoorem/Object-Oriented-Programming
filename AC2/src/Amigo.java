/*
Breno Rosa Orem 248079
Fabiano Dantas de Souza 248153
Mateus Campos Smanioto 248056
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Amigo {

    //parametros do amigo
    private String nome;
    private Endereco endereco;
    private String celular;
    private String email;
    private GregorianCalendar dataNascimento;

    //construtor vazio da classe amigo
    public Amigo() {}

    //construtor com os parametros da classe amigo
    public Amigo(String nome, Endereco endereco, String celular, String email, int dia, int mes, int ano) {
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
        setDataNascimento(dia, mes, ano);
    }

    //getters e setters da classe amigo
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public GregorianCalendar getDataNascimento() { return dataNascimento; }

    public void setDataNascimento(int dia, int mes, int ano) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        //validacao das entradas de dia, mes e ano
        if (dia < 1 || dia > 31)
            throw new IllegalArgumentException("Dia inválido!");

        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mês inválido!");

        if (ano >= anoAtual)
            throw new IllegalArgumentException("Ano inválido!");

        this.dataNascimento = new GregorianCalendar(ano, mes - 1, dia);
    }

    //imprime as informacoes do amigo
    public String imprimir() {
        return  "\nNome: " + nome +
                "\n" + endereco.imprimir() +
                "\nCelular: " + celular +
                "\nE-mail: " + email +
                "\nNascimento: " + dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" + (dataNascimento.get(Calendar.MONTH) + 1) + "/" + dataNascimento.get(Calendar.YEAR);
    }

    //calcula, atraves da data de hoje e o calculo do aniversario mais proximo, quantos dias faltam ou passaram do aniversario do amigo
    public int calcularDiasParaAniversariar() {
        Calendar hoje = Calendar.getInstance();
        Calendar aniversario = new GregorianCalendar(hoje.get(Calendar.YEAR), dataNascimento.get(Calendar.MONTH), dataNascimento.get(Calendar.DAY_OF_MONTH));

        long msHoje = hoje.getTimeInMillis();
        long msAniv = aniversario.getTimeInMillis();

        long diff = msAniv - msHoje;
        long dias = diff / (1000 * 60 * 60 * 24);

        return (int) dias; //casting de long para int
    }
}