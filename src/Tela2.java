
public class Tela2 {

    static int op, x, tecla, mop, botao;

    public static void verde(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, x, 15, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setPosicaoCursor(7, 3);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Funcionarios");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setPosicaoCursor(7, 20);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Produtos");
                Fjalp2.getTerminal().resetCor();
            case 3:
                Fjalp2.getTerminal().setPosicaoCursor(7, 35);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Fornecedores");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setPosicaoCursor(7, 52);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Vendas");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setPosicaoCursor(7, 69);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().escreva("Cliente");
                Fjalp2.getTerminal().resetCor();
                break;
        }

    }

    public static void azul(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
        Fjalp2.getTerminal().caixa(5, x, 15, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setPosicaoCursor(7, 3);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Funcionarios");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setPosicaoCursor(7, 20);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Produtos");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setPosicaoCursor(7, 35);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Fornecedores");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setPosicaoCursor(7, 52);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Vendas");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setPosicaoCursor(7, 69);
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().escreva("Cliente");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    public static void menorvermelho(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(16, x, 11, 2);
    }

    public static void menorbranco(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().caixa(16, x, 11, 2);
    }

    public static void botaosair(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, x, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 73);
        Fjalp2.getTerminal().escreva("Fechar");
    }

    public static void sair() throws Exception {
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
                Tela2.TelaPrincipal();
                break;
        }
    }

    static void logocentral() {
        int y = 4;
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(22, y);
        Fjalp2.getTerminal().escreva("               :::::    ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("   ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva(" ::: :::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("   ::::::");
        Fjalp2.getTerminal().setPosicaoCursor(23, y);
        Fjalp2.getTerminal().escreva("               :::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("   ::::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva(" : ::  ::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("   ::::::");
        Fjalp2.getTerminal().setPosicaoCursor(24, y);
        Fjalp2.getTerminal().escreva("  :::::::::::  :::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("  ::::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  :: ::   ::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  :::::");
        Fjalp2.getTerminal().setPosicaoCursor(25, y);
        Fjalp2.getTerminal().escreva(" ::::::::::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("  ::::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("    :: ::   :: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  ::::: ::::         :::::");
        Fjalp2.getTerminal().setPosicaoCursor(26, y);
        Fjalp2.getTerminal().escreva(":::::: ::::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("  ::: ::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("   ::: ::  :: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  ::::::::::::    ::::::::::");
        Fjalp2.getTerminal().setPosicaoCursor(27, y);
        Fjalp2.getTerminal().escreva(":::::   :::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva(" :::  ::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("   ::: ::   : ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  ::::::::::::   :::::: :::::");
        Fjalp2.getTerminal().setPosicaoCursor(28, y);
        Fjalp2.getTerminal().escreva(":::::   :::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva(" :::  ::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("   :::  ::  :  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva(" :::::  ::::::  :::::  :::::");
        Fjalp2.getTerminal().setPosicaoCursor(29, y);
        Fjalp2.getTerminal().escreva(":::::   :::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("  ::: :::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  :::  :  :: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  :::::   :::::  ::::::::::::");
        Fjalp2.getTerminal().setPosicaoCursor(30, y);
        Fjalp2.getTerminal().escreva(":::::::::::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("  :::  ::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  :::  :  :: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  :::::   :::::  ::::::::::::");
        Fjalp2.getTerminal().setPosicaoCursor(31, y);
        Fjalp2.getTerminal().escreva(" ::::::::::::  ::::: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("   :::  ::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  :::    ::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  :::::: ::::::  ::::: ");
        Fjalp2.getTerminal().setPosicaoCursor(32, y);
        Fjalp2.getTerminal().escreva("        :::::  :::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("   :::  :: ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  ::   :::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("  :::::::::::::    ::::::::::");
        Fjalp2.getTerminal().setPosicaoCursor(33, y);
        Fjalp2.getTerminal().escreva(" :::   :::::   :::::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("   :::: : ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva(" :: :::::  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("   :::::::::::       :::::::::");
        Fjalp2.getTerminal().setPosicaoCursor(34, y);
        Fjalp2.getTerminal().escreva(" :::::::::::         ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().escreva("       :::   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().escreva("  :::");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(35, y);
        Fjalp2.getTerminal().escreva("   :::::");
        Fjalp2.getTerminal().resetCor();
    }

    public static void TelaPrincipal() throws Exception {

        /* Tela Pricipal */
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

        /* Menu Principal */
        Fjalp2.getTerminal().caixa(5, 1, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 3);
        Fjalp2.getTerminal().escreva("Funcionarios");
        Fjalp2.getTerminal().caixa(5, 17, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 20);
        Fjalp2.getTerminal().escreva("Produtos");
        Fjalp2.getTerminal().caixa(5, 33, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 35);
        Fjalp2.getTerminal().escreva("Fornecedores");
        Fjalp2.getTerminal().caixa(5, 49, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 52);
        Fjalp2.getTerminal().escreva("Vendas");
        Fjalp2.getTerminal().caixa(5, 65, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 69);
        Fjalp2.getTerminal().escreva("Cliente");

        /* Logo Central */
        Tela1.logo();

        op = 1;
        botao = 1;
        do {
            azul(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 1) {
                if (tecla == 2) {
                    verde(op);
                    op = 65;
                    botao = 5;
                    tecla = 0;
                }
            }
            if (op == 65) {
                verde(op);
                if (tecla == 6) {
                    verde(op);
                    op = 1;
                    botao = 1;
                    tecla = 0;
                }
            }
            if (tecla == 6) {
                verde(op);
                op = op + 16;
                botao = botao + 1;
                azul(op);
            }
            if (tecla == 2) {
                verde(op);
                op = op - 16;
                botao = botao - 1;
                azul(op);
            }
            if (tecla == 27) {
                verde(op);
                op = 71;
                botaosair(op);
            }
        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();
        switch (op) {
            case 1:
                Tela_Fun.Tela_Funcionario();
                break;
            case 17:
                Tela_Prod.Tela_Produtos();
                break;
            case 33:
                Tela_Forn.Tela_Fornecedor();
                break;
            case 49:
                Tela_Vend.Tela_Venda();
                break;
            case 65:
                Tela_Clien.Tela_Cliente();
                break;
            case 71:
                sair();
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
        botao = 2;
        do {
            azul(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 17) {
                if (tecla == 2||tecla==4) {
                    verde(op);
                    op = 49;
                    botao = 4;
                    tecla = 0;
                }
            }
            if (op == 49) {
                verde(op);
                if (tecla == 6||tecla==2) {
                    verde(op);
                    op = 17;
                    botao = 4;
                    tecla = 0;
                }
            }
            if (tecla == 27) {
                verde(op);
                op = 71;
                botaosair(op);
            }
        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();
        switch (op) {
            case 1:
                Tela_Fun.Tela_Funcionario();
                break;
            case 17:
                Tela_Prod.Tela_Produtos();
                break;
            case 33:
                Tela_Forn.Tela_Fornecedor();
                break;
            case 49:
                Tela_Vend.Tela_Venda();
                break;
            case 65:
                Tela_Clien.Tela_Cliente();
                break;
            case 71:
                sair();
        }
    }
}
