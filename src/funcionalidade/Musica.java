package src.funcionalidade;

public class Musica {

    public void tocar(){
        System.out.println("MUSICA TOCANDO");
    }
    public void pausarMusica(){pausar();}
    private void pausar(){
        System.out.println("MUSICA PAUSADA");
    }
    public void selecionar(){
        System.out.println("SELECIONANDO MUSICA");
    }
}
