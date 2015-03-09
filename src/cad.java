/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 05289737545
 */
public class cad {

    public static void main(String[] args) {

        /* Limpa tela e barra indice */

        Fjalp2.getTerminal().limpar(0, 0, 80, 55);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 80, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 3);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva("CAIXA ABERTO");
        Fjalp2.getTerminal().setPosicaoCursor(2, 56);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva("NOME DA EMPRESA");

        /* caixa lateral */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(3, 55, 25, 48);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(4, 57, 21, 11);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(18, 57, 21, 5);
        Fjalp2.getTerminal().setPosicaoCursor(19, 59);
        Fjalp2.getTerminal().escreva("VENDEDOR:");
         Fjalp2.getTerminal().caixa(25, 57, 21, 17);
         Fjalp2.getTerminal().setPosicaoCursor(26, 59);
        Fjalp2.getTerminal().escreva("Cliente:");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(39, 60, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(40, 64);
        Fjalp2.getTerminal().escreva("Procurar");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(44, 60, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(45, 64);
        Fjalp2.getTerminal().escreva("Concluir");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(47, 60, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(48, 63);
        Fjalp2.getTerminal().escreva("Fecha PDV");
        
        /* caixa superior */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(3, 0, 55, 13);
        Fjalp2.getTerminal().setPosicaoCursor(5, 3);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva("DIGITE O CODIGO DO PRODUTO");
        Fjalp2.getTerminal().caixa(6, 3, 25, 2);
        Fjalp2.getTerminal().setPosicaoCursor(7, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva(" X ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(6, 34, 7, 2);
        Fjalp2.getTerminal().setPosicaoCursor(5, 36);
        Fjalp2.getTerminal().escreva("QTDE.");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(6, 44, 8, 2);
        Fjalp2.getTerminal().setPosicaoCursor(7, 47);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva("ADD.");
        Fjalp2.getTerminal().setPosicaoCursor(10, 3);
        Fjalp2.getTerminal().escreva("Produto:");
        Fjalp2.getTerminal().setPosicaoCursor(10, 20);
        Fjalp2.getTerminal().escreva("Qtde.:");
        Fjalp2.getTerminal().setPosicaoCursor(10, 27);
        Fjalp2.getTerminal().escreva(" x ");
        Fjalp2.getTerminal().setPosicaoCursor(10, 31);
        Fjalp2.getTerminal().escreva("Valor Und.:");
        Fjalp2.getTerminal().setPosicaoCursor(10, 41);
        Fjalp2.getTerminal().escreva(" = ");
        Fjalp2.getTerminal().setPosicaoCursor(10, 44);
        Fjalp2.getTerminal().escreva("Vl. Total:");
        

        /* caixa central */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(16, 0, 55, 35);

        /* Barra inferior */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(51, 0, 80, 4);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(52, 3, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(53, 7);
        Fjalp2.getTerminal().escreva("Remover");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(52, 20, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(53, 25);
        Fjalp2.getTerminal().escreva("Cupom");
        Fjalp2.getTerminal().setPosicaoCursor(53, 37);
        Fjalp2.getTerminal().escreva("TOTAL: ");        

        Fjalp2.getTerminal().leiaTecla();
    }
}
