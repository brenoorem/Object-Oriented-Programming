/*
Breno Rosa Orem 248079
Fabiano Dantas de Souza 248153
Mateus Campos Smanioto 248056
 */


import javax.swing.*;

public class Agenda {
    public static void main(String[] args) {
        GerenciarAmigo listaAmigos = new GerenciarAmigo(); //instancia para a classe GerenciarAmigo
        String mensagem = "==================" +
                        "\n  Menu de Opções    " +
                        "\n==================" +
                        "\n1 - Cadastrar amigo na agenda" +
                        "\n2 - Buscar amigo pelo nome" +
                        "\n3 - Aniversariantes do Mês" +
                        "\n4 - Listar todos os amigos" +
                        "\n5 - Sair da Agenda" +
                        "\n\nEscolha uma opção:";

        while(true){ //loop para o menu
            String opcao = JOptionPane.showInputDialog(mensagem);

            switch (opcao) { //opcoes do menu
                case "1": { //cadastro de um novo amigo atraves da interface JOptionPane
                    Amigo novoAmigo = new Amigo(); //instacia para um novo amigo
                    Endereco novoEndereco = new Endereco(); //instacia para um novo endereco

                    String nome = JOptionPane.showInputDialog("Digite seu nome:");
                    novoAmigo.setNome(nome);

                    String rua = JOptionPane.showInputDialog("Digite sua rua:");
                    novoEndereco.setRua(rua);
                    String numero = JOptionPane.showInputDialog("Digite o número da sua residência:");
                    novoEndereco.setNumero(numero);
                    String complemento = JOptionPane.showInputDialog("Digite o complemento:");
                    novoEndereco.setComplemento(complemento);
                    String cidade = JOptionPane.showInputDialog("Digite sua Cidade:");
                    novoEndereco.setCidade(cidade);
                    String estado = JOptionPane.showInputDialog("Digite seu Estado:");
                    novoEndereco.setEstado(estado);
                    String cep = JOptionPane.showInputDialog("Digite sua CEP:");
                    novoEndereco.setCep(cep);

                    novoAmigo.setEndereco(novoEndereco); //vinculando o endereco ao amigo

                    String celular = JOptionPane.showInputDialog("Digite seu celular:");
                    novoAmigo.setCelular(celular);
                    String email = JOptionPane.showInputDialog("Digite seu email:");
                    novoAmigo.setEmail(email);
                    int diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento:"));
                    int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu nascimento:"));
                    int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento:"));
                    novoAmigo.setDataNascimento(diaNascimento, mesNascimento, anoNascimento);

                    listaAmigos.cadastrarAmigo(novoAmigo); //adicionando um novo amigo a lista
                    break;
                }

                case "2": { // busca amigo atraves de parametro nome
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome do amigo:");
                    JOptionPane.showMessageDialog(null, listaAmigos.buscarAmigoPeloNome(nomeBusca));
                    break;
                }

                case "3": { //retorna todos os aniversariantes do mes definido
                    String mesBusca = JOptionPane.showInputDialog("Digite o mês de anivesário do amigo:");
                    JOptionPane.showMessageDialog(null, listaAmigos.aniversariarNoMes(Integer.parseInt(mesBusca)));
                    break;
                }

                case "4": { //lista todos os amigos presentes na lista
                    listaAmigos.listarTodosAmigos();
                    break;
                }

                case "5": { //finaliza o programa!
                    System.exit(0);
                    break;
                }
            }
        }
    }
}