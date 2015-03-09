/* sistema de loja */

public class Sis_loja {
    
    public static void main(String[] args) {
      
        Fjalp2.getTerminal().limparTela(); 
        
        /* caixa tela inteira */
        
        Fjalp2.getTerminal().setCor(CorFonte.VERDE, CorFundo.PRETO);
        Fjalp2.getTerminal().caixa(0, 0, 90, 80);
        
        /* caixas do menu de login, data e hora */ 
        
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 3, 30);
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 30, 3, 8);
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 38, 3, 13);
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 51, 3, 7);
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 58, 3, 13);
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(0, 71, 3, 9);
        
        /* caixas da logo 1 */
        
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(14, 20, 45, 40);
        
        /* caixa da logo 2 */
        
        Fjalp2.getTerminal().setCor (CorFonte.PRETO, CorFundo.VERDE);
        Fjalp2.getTerminal().caixa(63, 10, 13, 60);
        
        Fjalp2.getTerminal().setPosicaoCursor(10, 30);
        Fjalp2.getTerminal().escreva("BEM VINDO AO FJALP2");
        
        Fjalp2.getTerminal().leiaTecla();
        
    
    }
    
}
