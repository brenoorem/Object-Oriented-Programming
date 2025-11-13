/*
Breno Rosa Orem 248079
Fabiano Dantas de Souza 248153
Mateus Campos Smanioto 248056
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;

public class GerenciarAmigo {
    //inicializa a lista
    private ArrayList<Amigo> lista;

    //construtor com instancia da lista
    public GerenciarAmigo(){
        this.lista = new ArrayList<Amigo>();
    }

    //adiciona o amigo cadastrado a lista
    public void cadastrarAmigo(Amigo amigo){
        lista.add(amigo);
        JOptionPane.showMessageDialog(null, "Amigo cadastrado com sucesso!");;
    }

    //realiza a busca de um amigo atraves da comparacao de strings e imprime o tempo que falta ou passou o aniversario do amigo
    public String buscarAmigoPeloNome(String nome){
        for(Amigo amigo : lista){
            if(nome.equals(amigo.getNome())) {
                int dias = amigo.calcularDiasParaAniversariar();

                if (dias > 0) {
                    return amigo.imprimir() + "\n\nFaltam " + dias + " dias para o aniversário de " + nome;
                } else if (dias < 0) {
                    return amigo.imprimir() + "\n\nPassaram " + Math.abs(dias) + " dias do aniversário de " + nome;
                } else {
                    return amigo.imprimir() + "\n\nHoje é o aniversário de " + nome + "!";
                }
            }
            else
                return "Amigo não encontrado!";
        }
        return "Erro na busca!";
    }

    //busca e retorna os amigos que fazem aniversario no mes informado
    public String aniversariarNoMes(int mes){
        // validação do mês — 1 a 12
        if (mes < 1 || mes > 12) {
            return "O mês informado está fora do intervalo válido.";
        }

        String mensagem = "";
        boolean encontrou = false;

        for (Amigo amigo : lista) {
            if (amigo.getDataNascimento().get(Calendar.MONTH) == mes - 1) {
                mensagem += amigo.getNome() + "\n";
                encontrou = true;
            }
        }

        if (!encontrou) {
            return "Não há ninguém que faz aniversário nesse mês!";
        }

        return mensagem;
    }

    //lista todos os amigos presentes na lista
    public void listarTodosAmigos(){
        for(Amigo amigo : lista){
            JOptionPane.showMessageDialog(null, amigo.imprimir());
        }
    }
}