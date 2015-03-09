
public class Tela22 {

    static int op, botao, tecla, mop;

    public static void menorvermelho(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(16, x, 11, 2);
    }

    public static void menorbranco(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(16, x, 11, 2);
    }

    static void verdefun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, x, 15, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setPosicaoCursor(7, 20);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Produtos");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setPosicaoCursor(7, 52);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Vendas");
                break;
        }
    }

    static void azulfun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
        Fjalp2.getTerminal().caixa(5, x, 15, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setPosicaoCursor(7, 20);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Produtos");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setPosicaoCursor(7, 52);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Vendas");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    static void botaosairfun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, x, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 73);
        Fjalp2.getTerminal().escreva("Fechar");
    }

    static void sairfun() throws Exception {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(13, 28, 26, 2);
        Fjalp2.getTerminal().setPosicaoCursor(14, 31);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().escreva(" O que deseja fazer?");
        Fjalp2.getTerminal().caixa(16, 22, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(17, 25);
        Fjalp2.getTerminal().escreva("Fechar");
        Fjalp2.getTerminal().caixa(16, 35, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(17, 38);
        Fjalp2.getTerminal().escreva("Logoff");
        Fjalp2.getTerminal().caixa(16, 48, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(17, 50);
        Fjalp2.getTerminal().escreva("Cancelar");
        //colar o que ta no bloco de notas aqui
        mop = 22;
        do {
            menorvermelho(mop);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (mop == 22) {
                menorvermelho(mop);
                if (tecla == 2) {
                    menorbranco(mop);
                    mop = 48;
                    tecla = 0;
                }
            }
            if (mop == 48) {
                menorvermelho(mop);
                if (tecla == 6) {
                    menorbranco(mop);
                    mop = 22;
                    tecla = 0;
                }
            }
            if (tecla == 6) {
                menorbranco(mop);
                mop = mop + 13;
                menorvermelho(mop);
            }
            if (tecla == 2) {
                menorbranco(mop);
                mop = mop - 13;
                menorvermelho(mop);
            }
        } while (tecla != 13);
        Fjalp2.getTerminal().resetCor();
        switch (mop) {
            case 22:
                Tela_Ani.animacaofinal();
                Fjalp2.getTerminal().limparTela();
                System.exit(0);
                break;
            case 35:
                Globe.Logoff();
                break;
            case 48:
                Tela2.TelaFuncionario();
                break;
        }

    }

    public static void TelaFuncionario() throws Exception {
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 80, 55);
        Fjalp2.getTerminal().setPosicaoCursor(2, 45);
        Fjalp2.getTerminal().escreva("Usuario:");
        Fjalp2.getTerminal().caixa(0, 53, 17, 3);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(2, 55);
        Fjalp2.getTerminal().escreva(Tela1.usuario);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 71, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 73);
        Fjalp2.getTerminal().escreva("Fechar");
        //Menu
        Fjalp2.getTerminal().caixa(5, 17, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 20);
        Fjalp2.getTerminal().escreva("Produtos");
        Fjalp2.getTerminal().caixa(5, 49, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 52);
        Fjalp2.getTerminal().escreva("Vendas");

        //Logo
        Tela1.logo();

        op = 17;
        botao = 1;
        azulfun(op);
       do {
            azulfun(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 17) {
                if (tecla == 2 || tecla == 6) {
                    verdefun(op);
                    op = 49;
                    botao = 2;
                    tecla = 0;
                }
            }
            if (op == 49) {
                verdefun(op);
                if (tecla == 6 || tecla == 2) {
                    verdefun(op);
                    op = 17;
                    botao = 1;
                    tecla = 0;
                }
            }
            if (tecla == 27) {
                verdefun(op);
                op = 71;
                botaosairfun(op);
            }
        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();
        switch (op) {
            case 17:
                Tela_Prod.Tela_Produtos();
                break;
            case 49:
                Tela_Vend.Tela_Venda();
                break;
            case 71:
                sairfun();
        }
    }
}
