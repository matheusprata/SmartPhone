package src.funcionalidade;

public class Telefone extends Musica {
    public void ligar(){
        pausarMusica();
        System.out.println("FAZENDO CHAMADA");
    }
    public void atender() {
        pausarMusica();
        System.out.println("ATENDENDO CHAMADA");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
