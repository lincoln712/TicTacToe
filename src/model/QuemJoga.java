package model;

public class QuemJoga {
    
    private String jogador;
    
    public String getJogador() {
        return jogador;
    }

    public void JogadorVez(){
        
        if(jogador.equals("x"))
            jogador = "o";
        else
            jogador = "x";
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }
    
    public QuemJoga() {
        this.jogador = "x";
    }
    
}
