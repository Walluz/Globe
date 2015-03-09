/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele
 */
public class Sis_Med {
    
    public static void main(String[] args) {  
    
        Fjalp2.getTerminal().limparTela();
        
        Fjalp2.getTerminal().setCor(CorFonte.VERDE, CorFundo.PRETO);
        Fjalp2.getTerminal().caixa(15, 28, 21, 4);
        
        Fjalp2.getTerminal().setPosicaoCursor(10, 30);
        Fjalp2.getTerminal().escreva("    MENU\n=============\n |1-cadastro\n |2-consulta\n |3-sair\n");
        
        Fjalp2.getTerminal().leiaTecla();
    }
}
