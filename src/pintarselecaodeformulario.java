
public class pintarselecaodeformulario {

    public static void vermelhofun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(28, x, 6, 2);
        Fjalp2.getTerminal().resetCor();
    }

    public static void brancofun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(28, x, 6, 2);
        Fjalp2.getTerminal().resetCor();
    }

    public static void certezaexcluirverde(int x) {
        Fjalp2.getTerminal().setCor(CorFonte.VERDE, CorFundo.BRANCO);
        Fjalp2.getTerminal().caixa(17, x, 6, 2);
        Fjalp2.getTerminal().resetCor();
    }

    public static void certezaexcluirpreto(int x) {
        Fjalp2.getTerminal().setCor(CorFonte.PRETO, CorFundo.BRANCO);
        Fjalp2.getTerminal().caixa(17, x, 6, 2);
        Fjalp2.getTerminal().resetCor();
    }

    static void botaosairfun(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, x, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 73);
        Fjalp2.getTerminal().escreva("Fechar");
    }

    public static void linhaalterar() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Qual linha deseja alterar?");
        Fjalp2.getTerminal().caixa(17, 58, 7, 2);
    }

    public static void excluirfun() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Qual funcionario deseja excluir?");
        Fjalp2.getTerminal().caixa(17, 62, 7, 2);
    }

    public static void excluirprod() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 32);
        Fjalp2.getTerminal().escreva("Qual produto deseja excluir?");
        Fjalp2.getTerminal().caixa(17, 62, 7, 2);
    }

    public static void excluirfornecedor() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 32);
        Fjalp2.getTerminal().escreva("Qual fornecedor deseja excluir?");
        Fjalp2.getTerminal().caixa(17, 63, 7, 2);
    }

    public static void excluircliente() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 32);
        Fjalp2.getTerminal().escreva("Qual cliente deseja excluir?");
        Fjalp2.getTerminal().caixa(17, 61, 7, 2);
    }

    public static int certezaexcluirfun() {
        int certeza = 0;
        int op, tecla;
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);
        Fjalp2.getTerminal().setPosicaoCursor(15, 37);
        Fjalp2.getTerminal().escreva("Deseja realmente excluir?");
        Fjalp2.getTerminal().caixa(17, 40, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(18, 42);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().caixa(17, 53, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(18, 55);
        Fjalp2.getTerminal().escreva("Nao");
        op = 40;
        certezaexcluirverde(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 40) {
                if (tecla == 6 || tecla == 2) {
                    certezaexcluirpreto(op);
                    op = 53;
                    certezaexcluirverde(op);
                    tecla = 0;
                }
            }
            if (op == 53) {
                if (tecla == 6 || tecla == 2) {
                    certezaexcluirpreto(op);
                    op = 40;
                    certezaexcluirverde(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 40:
                certeza = 1;
                break;
            case 53:
                certeza = 0;
                break;
        }
        return certeza;
    }

    public static void infoalterar() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);
        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Qual informacao deseja alterar?");
        Fjalp2.getTerminal().caixa(17, 62, 7, 2);
    }

    public static void alterarinfo() {
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);
        Fjalp2.getTerminal().caixa(14, 36, 27, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 38);
        Fjalp2.getTerminal().escreva("Digite a nova informacao");
        Fjalp2.getTerminal().caixa(17, 29, 42, 2);
    }
}
