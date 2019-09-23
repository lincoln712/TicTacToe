package controller;

public class TestaVencedor {
    
    
    private boolean achaVencedor(String[][]m,int l,int c){
        
        String pos = l+","+c;
        
        switch(pos){
            case "0,0":
                return m[0][0].equals(m[0][1]) && m[0][1].equals(m[0][2])||
                       m[0][0].equals(m[1][0]) && m[1][0].equals(m[2][0])||
                       m[0][0].equals(m[1][1]) && m[1][1].equals(m[2][2]);
                
            case "0,1":
                return m[0][1].equals(m[0][0]) && m[0][0].equals(m[0][2])||
                       m[0][1].equals(m[1][1]) && m[1][1].equals(m[2][1]);
                
            case "0,2":
                return m[0][2].equals(m[0][1]) && m[0][1].equals(m[0][0])||
                       m[0][2].equals(m[1][2]) && m[1][2].equals(m[2][2])||
                       m[0][2].equals(m[1][1]) && m[1][1].equals(m[2][0]);
            case "1,0":
                return m[1][0].equals(m[1][1]) && m[1][1].equals(m[1][2])||
                       m[1][0].equals(m[0][0]) && m[0][0].equals(m[2][0]);
            case "1,1":
                return m[1][1].equals(m[1][0]) && m[1][0].equals(m[1][2])||
                       m[1][1].equals(m[0][1]) && m[0][1].equals(m[2][1])||
                       m[1][1].equals(m[0][2]) && m[0][2].equals(m[2][0])||
                       m[1][1].equals(m[0][0]) && m[0][0].equals(m[2][2]);
            case "1,2":
                return m[1][2].equals(m[0][2]) && m[0][2].equals(m[2][2])||
                       m[1][2].equals(m[1][1]) && m[1][1].equals(m[1][0]);
            case "2,0":
                return m[2][0].equals(m[2][1]) && m[2][1].equals(m[2][2])||
                       m[2][0].equals(m[1][0]) && m[1][0].equals(m[0][0])||
                       m[2][0].equals(m[1][1]) && m[1][1].equals(m[0][2]);
            case "2,1":
                return m[2][1].equals(m[2][0]) && m[2][0].equals(m[2][2])||
                       m[2][1].equals(m[1][1]) && m[1][1].equals(m[0][1]);
            case "2,2":
                return m[2][2].equals(m[2][1]) && m[2][1].equals(m[2][0])||
                       m[2][2].equals(m[1][2]) && m[1][2].equals(m[0][2])||
                       m[2][2].equals(m[1][1]) && m[1][1].equals(m[0][0]);
        }
        
        return false;
    }
    
    public boolean isVenceu(String[][]m,int l,int c){
        return achaVencedor(m, l, c);
    }
    
    public String vencedor(String[][]m,String nome,int l,int c){
        
        if(achaVencedor(m,l,c)){
            return "O Jogador "+nome.toUpperCase()+" venceu!";
        }else{
            return "Nao venceu!";
        }
    }
}
