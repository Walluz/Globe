
public class Tela_Forn {

    static int op, x, tecla, botao;
    static String nome, cnpj, est, end, bairro, cidade, estado, pais, matricula, tel1, tel2;

    public static void verde(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(x, 2, 16, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(15, 6);
                Fjalp2.getTerminal().escreva("Cadastros");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(21, 6);
                Fjalp2.getTerminal().escreva("Consulta");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(27, 6);
                Fjalp2.getTerminal().escreva("Alterar");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(33, 6);
                Fjalp2.getTerminal().escreva("Excluir");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(39, 6);
                Fjalp2.getTerminal().escreva("Relatorio");
                Fjalp2.getTerminal().resetCor();
                break;
            case 6:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(45, 7);
                Fjalp2.getTerminal().escreva("Voltar");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    public static void azul(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
        Fjalp2.getTerminal().caixa(x, 2, 16, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(15, 6);
                Fjalp2.getTerminal().escreva("Cadastros");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(21, 6);
                Fjalp2.getTerminal().escreva("Consulta");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(27, 6);
                Fjalp2.getTerminal().escreva("Alterar");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(33, 6);
                Fjalp2.getTerminal().escreva("Excluir");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(39, 6);
                Fjalp2.getTerminal().escreva("Relatorio");
                Fjalp2.getTerminal().resetCor();
                break;
            case 6:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(45, 7);
                Fjalp2.getTerminal().escreva("Voltar");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    public static void movesub() {
        op = 13;
        botao = 1;
        do {
            azul(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 13) {
                if (tecla == 16) {
                    verde(op);
                    op = 43;
                    botao = 6;
                    tecla = 0;
                }
            }
            if (op == 43) {
                azul(op);
                if (tecla == 14) {
                    verde(op);
                    op = 13;
                    botao = 1;
                    tecla = 0;
                }
            }
            if (tecla == 16) {
                verde(op);
                op = op - 6;
                botao = botao - 1;
                azul(op);
            }
            if (tecla == 14) {
                verde(op);
                op = op + 6;
                botao = botao + 1;
                azul(op);
            }
        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();
    }

    static void ascii() {
        int x = 23;
        int y = 31;
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("                     .------.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("                    :|||'''`.`.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("                    :|||     7.`.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println(" .===+===+===+===+===||`----L7'-`7`---.._");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println(" []                  || ==       |       '''-.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println(" []...._____.........||........../ _____ ____|");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("c\\____/,---.\\_       ||_________/ /,---.\\_  _/");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("  /_,-/ ,-. \\ `._____|__________||/ ,-. \\ \\_[");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("     /\\ `-' /                    /\\ `-' /");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 1, y);
        System.out.println("       `---'                       `---'");
    }

    static void selecaodecadastro() throws Exception {
        Fjalp2.getTerminal().limpar(20, 30, 47, 34);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(13, 32, 43, 35);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 32, 43, 35);
        Fjalp2.getTerminal().setPosicaoCursor(15, 34);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(14, 39, 34, 2);
        Fjalp2.getTerminal().setPosicaoCursor(18, 34);
        Fjalp2.getTerminal().escreva("CNPJ:");
        Fjalp2.getTerminal().caixa(17, 39, 22, 2);
        Fjalp2.getTerminal().setPosicaoCursor(21, 34);
        Fjalp2.getTerminal().escreva("Ins. Est.:");
        Fjalp2.getTerminal().caixa(20, 44, 19, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 34);
        Fjalp2.getTerminal().escreva("End:");
        Fjalp2.getTerminal().caixa(23, 38, 35, 2);
        Fjalp2.getTerminal().setPosicaoCursor(27, 34);
        Fjalp2.getTerminal().escreva("Bairro:");
        Fjalp2.getTerminal().caixa(26, 41, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(27, 54);
        Fjalp2.getTerminal().escreva("Cidade:");
        Fjalp2.getTerminal().caixa(26, 61, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(30, 34);
        Fjalp2.getTerminal().escreva("Estado:");
        Fjalp2.getTerminal().caixa(29, 41, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(30, 49);
        Fjalp2.getTerminal().escreva("Pais:");
        Fjalp2.getTerminal().caixa(29, 54, 10, 2);
        Fjalp2.getTerminal().setPosicaoCursor(33, 34);
        Fjalp2.getTerminal().escreva("Matricula:");
        Fjalp2.getTerminal().caixa(32, 44, 19, 2);
        Fjalp2.getTerminal().setPosicaoCursor(36, 34);
        Fjalp2.getTerminal().escreva("Tel 1:");
        Fjalp2.getTerminal().caixa(35, 40, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(39, 34);
        Fjalp2.getTerminal().escreva("Tel 2:");
        Fjalp2.getTerminal().caixa(38, 40, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(45, 43);
        Fjalp2.getTerminal().escreva("Salvar");
        Fjalp2.getTerminal().caixa(44, 40, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(45, 60);
        Fjalp2.getTerminal().escreva("Cancelar");
        Fjalp2.getTerminal().caixa(44, 58, 11, 2);
        op = 0;
        tecla = 0;
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(25, 37, 6, 2);
        Fjalp2.getTerminal().caixa(25, 37, 32, 2);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(26, 39);
        Fjalp2.getTerminal().escreva("Deseja fazer um novo cadastro?");
        Fjalp2.getTerminal().limpar(28, 46, 6, 2);
        Fjalp2.getTerminal().caixa(28, 46, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 48);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().limpar(28, 57, 6, 2);
        Fjalp2.getTerminal().caixa(28, 57, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 59);
        Fjalp2.getTerminal().escreva("Nao");
        op = 46;
        pintarselecaodeformulario.vermelhofun(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 46) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 57;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
            if (op == 57) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 46;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 46:
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(25, 37, 35, 10);
                cadastro_forn();
                break;
            case 57:
                Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
                Fjalp2.getTerminal().limpar(13, 32, 45, 37);
                Tela_Fornecedor();
        }
    }

    static void cadastro_forn() throws Exception {
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 32, 43, 35);
        Fjalp2.getTerminal().setPosicaoCursor(15, 34);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(14, 39, 34, 2);
        Fjalp2.getTerminal().setPosicaoCursor(18, 34);
        Fjalp2.getTerminal().escreva("CNPJ:");
        Fjalp2.getTerminal().caixa(17, 39, 22, 2);
        Fjalp2.getTerminal().setPosicaoCursor(21, 34);
        Fjalp2.getTerminal().escreva("Ins. Est.:");
        Fjalp2.getTerminal().caixa(20, 44, 19, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 34);
        Fjalp2.getTerminal().escreva("End:");
        Fjalp2.getTerminal().caixa(23, 38, 35, 2);
        Fjalp2.getTerminal().setPosicaoCursor(27, 34);
        Fjalp2.getTerminal().escreva("Bairro:");
        Fjalp2.getTerminal().caixa(26, 41, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(27, 54);
        Fjalp2.getTerminal().escreva("Cidade:");
        Fjalp2.getTerminal().caixa(26, 61, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(30, 34);
        Fjalp2.getTerminal().escreva("Estado:");
        Fjalp2.getTerminal().caixa(29, 41, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(30, 49);
        Fjalp2.getTerminal().escreva("Pais:");
        Fjalp2.getTerminal().caixa(29, 54, 10, 2);
        Fjalp2.getTerminal().setPosicaoCursor(33, 34);
        Fjalp2.getTerminal().escreva("Matricula:");
        Fjalp2.getTerminal().caixa(32, 44, 19, 2);
        Fjalp2.getTerminal().setPosicaoCursor(36, 34);
        Fjalp2.getTerminal().escreva("Tel 1:");
        Fjalp2.getTerminal().caixa(35, 40, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(39, 34);
        Fjalp2.getTerminal().escreva("Tel 2:");
        Fjalp2.getTerminal().caixa(38, 40, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(45, 43);
        Fjalp2.getTerminal().escreva("Salvar");
        Fjalp2.getTerminal().caixa(44, 40, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(45, 60);
        Fjalp2.getTerminal().escreva("Cancelar");
        Fjalp2.getTerminal().caixa(44, 58, 11, 2);

        cadastrar();

    }

    static void cadastrar() throws Exception {
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(15, 41);
        nome = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(18, 41);
        cnpj = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(21, 46);
        est = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(24, 40);
        end = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(27, 43);
        bairro = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(27, 63);
        cidade = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(30, 43);
        estado = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(30, 56);
        pais = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(33, 46);
        matricula = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(36, 42);
        tel1 = Fjalp2.getTerminal().leiaString();
        Fjalp2.getTerminal().setPosicaoCursor(39, 42);
        tel2 = Fjalp2.getTerminal().leiaString();
        Funcoes.escrever("fornecedores.txt", nome + "," + cnpj + "," + est + "," + end + "," + bairro + "," + cidade + "," + estado + "," + pais + "," + matricula + "," + tel1 + "," + tel2 + "\r\n");
        Fjalp2.getTerminal().resetCor();
        selecaodecadastro();
    }

    static void selecaodeconsulta() throws Exception {
        Fjalp2.getTerminal().limpar(20, 38, 40, 34);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        Fjalp2.getTerminal().caixa(23, 26, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 28);
        Fjalp2.getTerminal().escreva("Matricula");
        Fjalp2.getTerminal().caixa(23, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 48);
        Fjalp2.getTerminal().escreva("Nome");
        Fjalp2.getTerminal().caixa(23, 61, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 66);
        Fjalp2.getTerminal().escreva("CNPJ");
        op = 0;
        tecla = 0;
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(25, 38, 6, 2);
        Fjalp2.getTerminal().caixa(25, 38, 32, 2);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(26, 39);
        Fjalp2.getTerminal().escreva("Deseja fazer uma nova consulta?");
        Fjalp2.getTerminal().limpar(28, 46, 6, 2);
        Fjalp2.getTerminal().caixa(28, 46, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 48);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().limpar(28, 57, 6, 2);
        Fjalp2.getTerminal().caixa(28, 57, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 59);
        Fjalp2.getTerminal().escreva("Nao");
        op = 46;
        pintarselecaodeformulario.vermelhofun(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 46) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 57;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
            if (op == 57) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 46;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 46:
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(25, 37, 35, 10);
                consultas();
                break;
            case 57:
                Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
                Fjalp2.getTerminal().limpar(13, 25, 60, 40);
                Tela_Fornecedor();
        }
    }

    static void consultas() throws Exception {
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        Fjalp2.getTerminal().caixa(23, 26, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 28);
        Fjalp2.getTerminal().escreva("Matricula");
        Fjalp2.getTerminal().caixa(23, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 48);
        Fjalp2.getTerminal().escreva("Nome");
        Fjalp2.getTerminal().caixa(23, 61, 13, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 66);
        Fjalp2.getTerminal().escreva("CNPJ");
        consultar();

    }

    static void consultar() throws Exception {
        String nome;
        int encontrado = 0;
        Fjalp2.getTerminal().setCor(CorFonte.PRETO, CorFundo.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(18, 35);
        nome = Fjalp2.getTerminal().leiaString();
        String[][] procurado = Funcoes.buscavendedor("fornecedores.txt");
        int linha = 26;
        for (int x = 0; x < procurado.length; x++) {
            if (nome.equalsIgnoreCase(procurado[x][0])) {
                Fjalp2.getTerminal().setPosicaoCursor(linha, 27);
                Fjalp2.getTerminal().escreva(procurado[x][2]);
                Fjalp2.getTerminal().setPosicaoCursor(linha, 45);
                Fjalp2.getTerminal().escreva(procurado[x][0]);
                Fjalp2.getTerminal().setPosicaoCursor(linha, 63);
                Fjalp2.getTerminal().escreva(procurado[x][1]);
                linha++;
                encontrado = 1;
            }
        }
        if (encontrado != 1) {
            Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
            Fjalp2.getTerminal().limpar(25, 37, 15, 2);
            Fjalp2.getTerminal().caixa(25, 37, 27, 2);
            Fjalp2.getTerminal().resetCor();
            Fjalp2.getTerminal().setPosicaoCursor(26, 39);
            Fjalp2.getTerminal().escreva("Fornecedor nao encontrado");
        }
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().resetCor();
        selecaodeconsulta();
    }

    static void selecaodealteracao() throws Exception {

        Fjalp2.getTerminal().limpar(20, 38, 40, 34);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        op = 0;
        tecla = 0;
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(25, 33, 35, 2);
        Fjalp2.getTerminal().caixa(25, 33, 35, 2);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(26, 35);
        Fjalp2.getTerminal().escreva("Deseja fazer uma nova alteracao?");
        Fjalp2.getTerminal().limpar(28, 43, 6, 2);
        Fjalp2.getTerminal().caixa(28, 43, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 45);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().limpar(28, 54, 6, 2);
        Fjalp2.getTerminal().caixa(28, 54, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 56);
        Fjalp2.getTerminal().escreva("Nao");
        op = 43;
        pintarselecaodeformulario.vermelhofun(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 43) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 54;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
            if (op == 54) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 43;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 43:
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(25, 37, 35, 10);
                alteracao();
                break;
            case 54:
                Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
                Fjalp2.getTerminal().limpar(13, 25, 52, 42);
                Tela_Fornecedor();
        }
    }

    static void alteracao() throws Exception {
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        Alterar();
    }

    static void tabelaalteracao() {
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        Fjalp2.getTerminal().setPosicaoCursor(23, 27);
        Fjalp2.getTerminal().escreva("0 - Nome");
        Fjalp2.getTerminal().setPosicaoCursor(25, 27);
        Fjalp2.getTerminal().escreva("1 - CNPJ");
        Fjalp2.getTerminal().setPosicaoCursor(27, 27);
        Fjalp2.getTerminal().escreva("2 - Estado");
        Fjalp2.getTerminal().setPosicaoCursor(29, 27);
        Fjalp2.getTerminal().escreva("3 - Endereco");
        Fjalp2.getTerminal().setPosicaoCursor(31, 27);
        Fjalp2.getTerminal().escreva("4 - Bairro");
        Fjalp2.getTerminal().setPosicaoCursor(33, 27);
        Fjalp2.getTerminal().escreva("5 - Cidade");
        Fjalp2.getTerminal().setPosicaoCursor(35, 27);
        Fjalp2.getTerminal().escreva("6 - Estado");
        Fjalp2.getTerminal().setPosicaoCursor(37, 27);
        Fjalp2.getTerminal().escreva("7 - Pais");
        Fjalp2.getTerminal().setPosicaoCursor(39, 27);
        Fjalp2.getTerminal().escreva("8 - Matricula");
        Fjalp2.getTerminal().setPosicaoCursor(41, 27);
        Fjalp2.getTerminal().escreva("9 - Telefone 1");
        Fjalp2.getTerminal().setPosicaoCursor(43, 27);
        Fjalp2.getTerminal().escreva("10 - Telefone 2");
    }

    static void Alterar() throws Exception {
        String nome;
        int poslinha = 24;
        int numlinha = 0;
        int encontrado = 0;
        int linhaalterar;
        int colunaalterar;
        Fjalp2.getTerminal().setCor(CorFonte.PRETO, CorFundo.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(18, 35);
        nome = Fjalp2.getTerminal().leiaString();
        String alterar[][] = Funcoes.infofornecedor("fornecedores.txt");
        int escolha[] = new int[alterar.length];
        for (int x = 0; x < alterar.length; x++) {
            if (nome.equalsIgnoreCase(alterar[x][0])) {
                Fjalp2.getTerminal().setPosicaoCursor(poslinha, 27);
                Fjalp2.getTerminal().escreva(numlinha + " - " + alterar[x][0]);
                Fjalp2.getTerminal().setPosicaoCursor(poslinha, 60);
                Fjalp2.getTerminal().escreva(alterar[x][8]);
                escolha[numlinha] = x;
                numlinha++;
                poslinha++;
                encontrado++;
            }
        }
        if (encontrado == 0) {
            Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
            Fjalp2.getTerminal().limpar(25, 39, 15, 2);
            Fjalp2.getTerminal().caixa(25, 39, 22, 2);
            Fjalp2.getTerminal().resetCor();
            Fjalp2.getTerminal().setPosicaoCursor(26, 41);
            Fjalp2.getTerminal().escreva("Nome nao encontrado ");
        }
        if (encontrado != 0) {
            Fjalp2.getTerminal().aguardar(1);
            pintarselecaodeformulario.linhaalterar();
            Fjalp2.getTerminal().setPosicaoCursor(18, 60);
            linhaalterar = Fjalp2.getTerminal().leiaInt();
            Fjalp2.getTerminal().aguardar(1);
            tabelaalteracao();
            pintarselecaodeformulario.infoalterar();
            Fjalp2.getTerminal().setPosicaoCursor(18, 64);
            colunaalterar = Fjalp2.getTerminal().leiaInt();
            Fjalp2.getTerminal().aguardar(1);
            pintarselecaodeformulario.alterarinfo();
            Fjalp2.getTerminal().setPosicaoCursor(18, 31);
            alterar[escolha[linhaalterar]][colunaalterar] = Fjalp2.getTerminal().leiaString();
            Funcoes.sobreescrever("fornecedores.txt", "");
            for (int y = 0; y < alterar.length; y++) {
                for (int z = 0; z < alterar[0].length; z++) {
                    if (z == 10) {
                        Funcoes.escrever("fornecedores.txt", alterar[y][z] + "\r\n");
                    } else {
                        Funcoes.escrever("fornecedores.txt", alterar[y][z] + ",");
                    }
                }
            }
        }
        Fjalp2.getTerminal().aguardar(1);
        Fjalp2.getTerminal().resetCor();
        selecaodealteracao();
    }

    static void selecaodeexclusao() throws Exception {
        Fjalp2.getTerminal().limpar(20, 38, 40, 34);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(13, 25, 50, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        op = 0;
        tecla = 0;
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(25, 37, 35, 2);
        Fjalp2.getTerminal().caixa(25, 36, 35, 2);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(26, 39);
        Fjalp2.getTerminal().escreva("Deseja fazer uma nova exclusao?");
        Fjalp2.getTerminal().limpar(28, 46, 6, 2);
        Fjalp2.getTerminal().caixa(28, 46, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 48);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().limpar(28, 57, 6, 2);
        Fjalp2.getTerminal().caixa(28, 57, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 59);
        Fjalp2.getTerminal().escreva("Nao");
        op = 46;
        pintarselecaodeformulario.vermelhofun(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 46) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 57;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
            if (op == 57) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 46;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 46:
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(25, 37, 35, 10);
                exclusao();
                break;
            case 57:
                Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
                Fjalp2.getTerminal().limpar(13, 25, 52, 42);
                Tela_Fornecedor();
        }
    }

    static void exclusao() throws Exception {

        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 7);

        Fjalp2.getTerminal().caixa(14, 40, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 46);
        Fjalp2.getTerminal().escreva("Pesquisa");
        Fjalp2.getTerminal().setPosicaoCursor(18, 28);
        Fjalp2.getTerminal().escreva("Nome:");
        Fjalp2.getTerminal().caixa(17, 33, 38, 2);

        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(22, 25, 50, 30);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(22, 25, 50, 30);
        excluir();
    }

    static void excluir() throws Exception {
        String nome;
        int numlinha = 0;
        int poslinha = 24;
        int encontrado = 0;
        int linhaexcluir;
        Fjalp2.getTerminal().setCor(CorFonte.PRETO, CorFundo.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(18, 35);
        nome = Fjalp2.getTerminal().leiaString();
        String[][] excluir = Funcoes.infofornecedor("fornecedores.txt");
        int escolha[] = new int[excluir.length];
        for (int x = 0; x < excluir.length; x++) {
            if (nome.equalsIgnoreCase(excluir[x][0])) {
                Fjalp2.getTerminal().setPosicaoCursor(poslinha, 27);
                Fjalp2.getTerminal().escreva(numlinha + " - " + excluir[x][0]);
                Fjalp2.getTerminal().setPosicaoCursor(poslinha, 60);
                Fjalp2.getTerminal().escreva(excluir[x][8]);
                escolha[numlinha] = x;
                numlinha++;
                poslinha++;
                encontrado++;
            }
        }
        if (encontrado == 0) {
            Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
            Fjalp2.getTerminal().limpar(25, 39, 15, 2);
            Fjalp2.getTerminal().caixa(25, 39, 22, 2);
            Fjalp2.getTerminal().resetCor();
            Fjalp2.getTerminal().setPosicaoCursor(26, 41);
            Fjalp2.getTerminal().escreva("Nome nao encontrado ");
        }
        if (encontrado != 0) {
            int certeza;
            Fjalp2.getTerminal().aguardar(1);
            pintarselecaodeformulario.excluirfornecedor();
            Fjalp2.getTerminal().setPosicaoCursor(18, 64);
            linhaexcluir = Fjalp2.getTerminal().leiaInt();
            certeza = pintarselecaodeformulario.certezaexcluirfun();
            if (certeza == 1) {
                for (int x = 0; x < excluir[0].length; x++) {
                    excluir[escolha[linhaexcluir]][x] = "";
                }
                Funcoes.sobreescrever("fornecedores.txt", "");
                for (int y = 0; y < excluir.length; y++) {
                    for (int z = 0; z < excluir[0].length; z++) {
                        if (excluir[y][z].equals("")) {
                        } else {
                            if (z == 10) {
                                Funcoes.escrever("fornecedores.txt", excluir[y][z] + "\r\n");
                            } else {
                                Funcoes.escrever("fornecedores.txt", excluir[y][z] + ",");
                            }
                        }
                    }
                }
            }
        }
        Fjalp2.getTerminal().aguardar(1);
        Fjalp2.getTerminal().resetCor();
        selecaodeexclusao();
    }

    static void selecaoderelatorio() throws Exception {
        Fjalp2.getTerminal().limpar(13, 25, 50, 40);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(13, 25, 50, 40);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 40);

        Fjalp2.getTerminal().caixa(14, 40, 21, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 47);
        Fjalp2.getTerminal().escreva("Pesquisa");
        op = 0;
        tecla = 0;
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(25, 37, 35, 2);
        Fjalp2.getTerminal().caixa(25, 36, 35, 2);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(26, 39);
        Fjalp2.getTerminal().escreva("Deseja vizualizar o relatorio?");
        Fjalp2.getTerminal().limpar(28, 46, 6, 2);
        Fjalp2.getTerminal().caixa(28, 46, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 48);
        Fjalp2.getTerminal().escreva("Sim");
        Fjalp2.getTerminal().limpar(28, 57, 6, 2);
        Fjalp2.getTerminal().caixa(28, 57, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(29, 59);
        Fjalp2.getTerminal().escreva("Nao");
        op = 46;
        pintarselecaodeformulario.vermelhofun(op);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 46) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 57;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
            if (op == 57) {
                if (tecla == 2 || tecla == 6) {
                    pintarselecaodeformulario.brancofun(op);
                    op = 46;
                    pintarselecaodeformulario.vermelhofun(op);
                    tecla = 0;
                }
            }
        } while (tecla != 13);
        switch (op) {
            case 46:
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(24, 35, 38, 10);
                relatorios();
                break;
            case 57:
                Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
                Fjalp2.getTerminal().limpar(13, 25, 52, 42);
                Tela_Fornecedor();
        }
    }

    static void relatorios() {

        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().caixa(13, 25, 50, 40);

        Fjalp2.getTerminal().caixa(14, 40, 21, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 47);
        Fjalp2.getTerminal().escreva("Pesquisa");

    }

    static void listagem() {
    }

    public static void Tela_Fornecedor() throws Exception {


        /* Tela Superior */
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 80, 55);
        Fjalp2.getTerminal().setPosicaoCursor(2, 45);
        Fjalp2.getTerminal().escreva("Usuario:");
        Fjalp2.getTerminal().caixa(0, 53, 17, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 55);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva(Tela1.usuario);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 71, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 73);
        Fjalp2.getTerminal().escreva(" Sair ");

        /* Menu Principal */
        Fjalp2.getTerminal().caixa(5, 1, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 3);
        Fjalp2.getTerminal().escreva("Funcionarios");
        Fjalp2.getTerminal().caixa(5, 17, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 20);
        Fjalp2.getTerminal().escreva("Produtos");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(5, 33, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 35);
        Fjalp2.getTerminal().escreva("Fornecedores");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, 49, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 52);
        Fjalp2.getTerminal().escreva("Vendas");
        Fjalp2.getTerminal().caixa(5, 65, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 69);
        Fjalp2.getTerminal().escreva("Cliente");

        /* Menu lateral */
        Fjalp2.getTerminal().caixa(13, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(15, 6);
        Fjalp2.getTerminal().escreva("Cadastros");
        Fjalp2.getTerminal().caixa(19, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(21, 6);
        Fjalp2.getTerminal().escreva("Consulta");
        Fjalp2.getTerminal().caixa(25, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(27, 6);
        Fjalp2.getTerminal().escreva("Alterar");
        Fjalp2.getTerminal().caixa(31, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(33, 6);
        Fjalp2.getTerminal().escreva("Excluir");
        Fjalp2.getTerminal().caixa(37, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(39, 6);
        Fjalp2.getTerminal().escreva("Relatorio");
        Fjalp2.getTerminal().caixa(43, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(45, 7);
        Fjalp2.getTerminal().escreva("Voltar");

        /* Logo Action */
        Tela_Fun.logoaction();
        // Logo Art
        ascii();

        movesub();
        if (tecla == 27) {
            verde(op);
            op = 43;
        }
        switch (op) {
            case 13:
                selecaodecadastro();
                break;
            case 19:
                selecaodeconsulta();
                break;
            case 25:
                selecaodealteracao();
                break;
            case 31:
                selecaodeexclusao();
                break;
            case 37:
                selecaoderelatorio();
                break;
            case 43:
                Tela2.TelaPrincipal();
                break;
        }
    }
}
