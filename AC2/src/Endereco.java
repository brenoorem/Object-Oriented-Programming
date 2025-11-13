/*
Breno Rosa Orem 248079
Fabiano Dantas de Souza 248153
Mateus Campos Smanioto 248056
 */

public class Endereco{
    //parametros do endereco
    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    //construtor vazio da classe endereco
    public Endereco(){
    }

    //construtor com os parametros da classe endereco
    public Endereco(String rua, String numero, String complemento, String cidade, String estado, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //getters e setters da classe endereco
    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    //imprime o endereco do amigo
    public String imprimir(){
        String mensagem = "Rua: " + this.rua
                        + "\nNumero: " + this.numero
                        + "\nComplemento: " + this.complemento
                        + "\nCidade: " + this.cidade
                        + "\nEstado: " + this.estado
                        + "\nCep: " + this.cep;

        return mensagem;
    }
}