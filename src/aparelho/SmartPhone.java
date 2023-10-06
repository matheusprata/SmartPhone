package src.aparelho;

import src.funcionalidade.Internet;
import src.funcionalidade.Musica;
import src.funcionalidade.Telefone;

public class SmartPhone {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Musica musica = new Musica();
        musica.tocar();
        musica.pausarMusica();
        musica.selecionar();

        Internet internet = new Internet();
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}