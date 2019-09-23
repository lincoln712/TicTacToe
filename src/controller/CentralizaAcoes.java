package controller;

import model.QuemJoga;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CentralizaAcoes {
    private int poslivre;
    
    
    public void bloqueiaBotoes(JButton a,JButton b,JButton c,JButton d,JButton v,JButton w,JButton x,JButton y,JButton z){
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        v.setEnabled(false);
        w.setEnabled(false);
        x.setEnabled(false);
        y.setEnabled(false);
        z.setEnabled(false);
        
    }
    
    public void bloqueiaTela(JFrame j){
        j.setEnabled(false);
    }
    
    public CentralizaAcoes() {
        this.poslivre = 9;
    }
    
    
    public void centraAcoesBotao(String[][]m,JButton b,JLabel label,QuemJoga qj,TestaVencedor v,int l,int c,
            JButton a,JButton d,JButton e,JButton f,JButton w,JButton x,JButton y,JButton z){
        
        setTextBotao(b,qj.getJogador());
        b.setEnabled(false);
        String jogadorvez = qj.getJogador();
        qj.JogadorVez();
        setLabelJogadorVez(label,qj.getJogador());
        setValoresMatriz(m,b.getText(), l, c);
        checaEmpate(v, label, m, l, c);
        imprimeMatriz(m);
        
        if(v.isVenceu(m, l, c)){
            setLabelVencedor(label,v.vencedor(m, jogadorvez, l, c));           
            bloqueiaBotoes(b,a,d,e,f,w,x,y,z);
        }
    }
    
    public void checaEmpate(TestaVencedor v,JLabel lemp,String[][]m,int l,int c){
        
        if(!v.isVenceu(m, l, c) && poslivre == 0){
            setLabelEmpate(lemp);
        }
    }
    
    public void imprimeMatriz(String[][]m){
        
        for (String[] m1 : m) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("\t" + m1[j]);
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }
    
    public void setLabelEmpate(JLabel l){
        l.setText("Empate!");
    }

    private void setLabelJogadorVez(JLabel l,String conteudo){
        l.setText("Jogador da vez "+conteudo.toUpperCase());
    }
    
    public void setLabelVencedor(JLabel l,String vencedor){
        l.setText(vencedor);
    }
    
    public void setPoslivre(int poslivre) {
        this.poslivre = poslivre;
    }
    
    private void setTextBotao(JButton b,String cont){
        b.setText(cont);
    }
    
    private void setValoresMatriz(String[][]m,String letra,int l,int c){
        m[l][c] = letra;
        poslivre--;
    }

    public void resetMatriz(String[][]m,JLabel l,JButton a,JButton b,JButton c,JButton d, JButton e,JButton f,JButton g,JButton h,JButton k){
        for (String[] m1 : m) {
            for (int j = 0; j < m.length; j++) {
                m1[j] = null;
            }
        }
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.setText("");
        g.setText("");
        h.setText("");
        k.setText("");
        
        l.setText("");
        
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        k.setEnabled(true);
        
    } 
    
}
