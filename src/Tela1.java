
public class Tela1 {

    static int tecla, botao, pos, info, tecla2;
    static String usuario, senha;
    public static int status;

    static void aguardar(int segundos) {
        try {
            Thread.sleep(segundos * 350);
        } catch (InterruptedException ex) {
            throw new RuntimeException("Erro ao tentar esperar");
        }
    }

    static void entrarcyan() {
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, 69, 11, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 72);
        Fjalp2.getTerminal().escreva("Entrar");
        Fjalp2.getTerminal().resetCor();
    }

    static void entrarverde() {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(2, 61);
        Fjalp2.getTerminal().caixa(0, 69, 11, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 72);
        Fjalp2.getTerminal().escreva("Entrar");
        Fjalp2.getTerminal().resetCor();
    }

    static void globecyan() {
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, 0, 25, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 4);
        Fjalp2.getTerminal().escreva("Globe Corporation");
        Fjalp2.getTerminal().resetCor();
    }

    static void globeverde() {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 25, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 4);
        Fjalp2.getTerminal().escreva("Globe Corporation");
        Fjalp2.getTerminal().resetCor();
    }

    static void infoazul(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
        Fjalp2.getTerminal().caixa(x, 2, 20, 2);
        Fjalp2.getTerminal().resetCor();
        switch (info) {
            case 1:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(10, 5);
                Fjalp2.getTerminal().escreva("Globe");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(15, 5);
                Fjalp2.getTerminal().escreva("Eduardo Oliveira");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(20, 5);
                Fjalp2.getTerminal().escreva("Vanderson Alves");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(25, 5);
                Fjalp2.getTerminal().escreva("Alexandre Hora");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(30, 5);
                Fjalp2.getTerminal().escreva("Valdinei Almeida");
                Fjalp2.getTerminal().resetCor();
                break;
            case 6:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(35, 5);
                Fjalp2.getTerminal().escreva("Thiago Cerqueira");
                Fjalp2.getTerminal().resetCor();
                break;
            case 7:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(40, 5);
                Fjalp2.getTerminal().escreva("Licenca de uso");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    static void infoverde(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(x, 2, 20, 2);
        Fjalp2.getTerminal().resetCor();
        switch (info) {
            case 1:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(10, 5);
                Fjalp2.getTerminal().escreva("Globe");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(15, 5);
                Fjalp2.getTerminal().escreva("Eduardo Oliveira");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(20, 5);
                Fjalp2.getTerminal().escreva("Vanderson Alves");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(25, 5);
                Fjalp2.getTerminal().escreva("Alexandre Hora");
                Fjalp2.getTerminal().resetCor();
                break;
            case 5:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(30, 5);
                Fjalp2.getTerminal().escreva("Valdinei Almeida");
                Fjalp2.getTerminal().resetCor();
                break;
            case 6:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(35, 5);
                Fjalp2.getTerminal().escreva("Thiago Cerqueira");
                Fjalp2.getTerminal().resetCor();
                break;
            case 7:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(40, 5);
                Fjalp2.getTerminal().escreva("Licenca de uso");
                Fjalp2.getTerminal().resetCor();
                break;
        }
    }

    static void globe() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 45);
        Fjalp2.getTerminal().escreva("A Globe");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("A Globe nasceu de uma ideia ousada de simplifi-");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("car os processos e valorizar as estrategias");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("de negocio, com o envolvimento de dezenas");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("de profissionais para criar uma marca forte,");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("com projetos solidos e inovadores. Essa uniao");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("de fatores so poderia resultar em uma marca com");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("o perfil dos novos tempos: inovadora, simples");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e extremamente agil.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("Enquanto a Globe domina a arte de encurtar");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("o tempo e os custos, a produtividade das");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("das grandes empresas vai aumentando.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("A marca vem para conquistar a confianca das");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("grandes corporacoes nacionais, ganhando tambem");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("o mercado mundial em ritmo acelerado. A Globe");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("nao caminha ao lado da evolucao : ela faz");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("acontecer.");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void eduardo() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 42);
        Fjalp2.getTerminal().escreva("Eduardo Oliveira");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("22 anos, solteiro, aluno do curso de Analise");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e desenvolvimento de Sistemas, Gerente do");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("projeto - Responsável por coordenar o projeto");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e liderar a equipe de programadores e");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("pesquisadores.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("CONTATO");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Tel: (71) 9282 - 8545");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("E-mail: ackseduardo@gmail.com");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void vanderson() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 42);
        Fjalp2.getTerminal().escreva("Vanderson Alves");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("20 anos, solteiro, aluno do curso de Analise");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e desenvolvimento de Sistemas, Designer e");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Programador Junior - Responsavel por criar toda");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("parte grafica do projeto, e grande participacao");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("na parte logica do projeto.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("CONTATO");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Tel: (71) 9703 - 8298");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("E-mail: vandersonalves15@gmail.com");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void alexandre() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 43);
        Fjalp2.getTerminal().escreva("Alexandre Hora");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("19 anos, solteiro, aluno do curso de Analise");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e desenvolvimento de Sistemas, Programador");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Junior - Responsavel por criar a parte");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("logica do projeto.");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("CONTATO");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Tel: (71) 9274 - 3763");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("E-mail: ahsacra@gmail.com");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void valdinei() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 42);
        Fjalp2.getTerminal().escreva("Valdinei Almeida");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("23 anos, solteiro, aluno do curso de Analise");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e desenvolvimento de Sistemas, Programador");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Junior - Responsavel por criar a parte logica");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("do projeto");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("CONTATO");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Tel: (71) 9274 - 3763");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("E-mail: ");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void thiago() throws Exception {
        int x = 10;
        int y = 27;
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, 42);
        Fjalp2.getTerminal().escreva("Thiago Cerqueira");
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("20 anos, solteiro, aluno do curso de Analise");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e desenvolvimento de Sistemas, Programador");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Junior - Responsavel pela coleta de requisitos");
         Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("e participacao na parte logica do projeto");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 3, y);
        Fjalp2.getTerminal().escreva("CONTATO");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("Tel: (71) 9201 - 9056");
        Fjalp2.getTerminal().setPosicaoCursor(x = x + 2, y);
        Fjalp2.getTerminal().escreva("E-mail: ");
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(10, 25, 50, 40);
        info();
    }

    static void info() throws Exception {

        /*Caixa superior */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().caixa(0, 0, 80, 55);
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(0, 0, 25, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 4);
        Fjalp2.getTerminal().escreva("Globe Corporation");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 26, 8, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 28);
        Fjalp2.getTerminal().escreva("Login:");
        Fjalp2.getTerminal().caixa(0, 35, 13, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 37);
        Fjalp2.getTerminal().caixa(0, 49, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 51);
        Fjalp2.getTerminal().escreva("Senha:");
        Fjalp2.getTerminal().caixa(0, 59, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 61);
        Fjalp2.getTerminal().caixa(0, 69, 11, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 72);
        Fjalp2.getTerminal().escreva("Entrar");
        Fjalp2.getTerminal().resetCor();

        /* Topicos de infomações */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, 30, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(6, 35);
        Fjalp2.getTerminal().escreva("INFORMACOES");
        Fjalp2.getTerminal().caixa(9, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(10, 5);
        Fjalp2.getTerminal().escreva("Globe");
        Fjalp2.getTerminal().caixa(14, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(15, 5);
        Fjalp2.getTerminal().escreva("Eduardo Oliveira");
        Fjalp2.getTerminal().caixa(19, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(20, 5);
        Fjalp2.getTerminal().escreva("Vanderson Alves");
        Fjalp2.getTerminal().caixa(24, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(25, 5);
        Fjalp2.getTerminal().escreva("Alexandre Hora");
        Fjalp2.getTerminal().caixa(29, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(30, 5);
        Fjalp2.getTerminal().escreva("Valdinei Almeida");
        Fjalp2.getTerminal().caixa(34, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(35, 5);
        Fjalp2.getTerminal().escreva("Thiago Cerqueira");
        Fjalp2.getTerminal().caixa(39, 2, 20, 2);
        Fjalp2.getTerminal().setPosicaoCursor(40, 5);
        Fjalp2.getTerminal().escreva("Licenca de uso");
        Fjalp2.getTerminal().resetCor();
        pos = 9;
        info = 1;
        do {
            infoazul(pos);
            tecla2 = Fjalp2.getTerminal().leiaTecla();
            if (pos == 9) {
                if (tecla2 == 16) {
                    infoverde(pos);
                    pos = 39;
                    info = 7;
                    infoazul(pos);
                    tecla2 = 0;
                }
            }
            if (pos == 39) {
                infoazul(pos);
                if (tecla2 == 14) {
                    infoverde(pos);
                    pos = 9;
                    info = 1;
                    infoazul(pos);
                    tecla2 = 0;
                }
            }
            if (tecla2 == 14) {
                infoverde(pos);
                pos = pos + 5;
                info = info + 1;
                infoazul(pos);
            }
            if (tecla2 == 16) {
                infoverde(pos);
                pos = pos - 5;
                info = info - 1;
                infoazul(pos);
            }

        } while (tecla2 != 13 && tecla2 != 27);
        if (tecla2 == 27) {
            info = 10;
        }
        switch (info) {
            case 1:
                globe();
                break;
            case 2:
                eduardo();
                break;
            case 3:
                vanderson();
                break;
            case 4:
                alexandre();
                break;
            case 5:
                valdinei();
                break;
            case 6:
                thiago();
                break;
            case 7:
                break;
            case 10:
                login();
                break;
        }
    }

    static void logo() {
        int x = 18;
        int y = 20;
        Fjalp2.getTerminal().setCor(CorFonte.VERDE, CorFundo.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(y, x);
        Fjalp2.getTerminal().escreva("              _oo##'9MMHb':'-,o_");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("          .oH':HH$' '''  ''-\\7*R&o_");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("       .oHMMMHMH#9:         '\\bMMMMHo.");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("      dMMMMMM*'''`'           .oHM'H9MM?.");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("    ,MMMMMM'                   'HLbd<|?&H\\");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("   JMMH#H'                     |MMMMM#b>bHb");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("  :MH  .'\\                  `|MMMMMMMMMMMM&");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(" .:M:d-'|:b..                 9MMMMMMMMMMMMM+");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(":  '*H|      -                &MMMMMMMMMMMMMH:");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(".    `LvdHH#d?                `?MMMMMMMMMMMMMb");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(":      iMMMMMMH#b               `'*'''#HMMMMMM");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(".   . ,MMMMMMMMMMb\\.                  {MMMMMH");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("-     |MMMMMMMMMMMMMMHb,               `MMMMM|");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(":      |MMMMMMMMMMMMMMH'                &MMMM,");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("-       `#MMMMMMMMMMMM                 |MMMM6-");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva(" :        `MMMMMMMMMM+                 ]MMMT/");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("  .       `MMMMMMMP'                   HMM*`");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("   -       |MMMMMH'                   ,M#'-");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("    '.     :MMMH|                       .-");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("      .     |MM                        -");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("       ` .   `#?..    .             ..'");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("           -.     _.             .-");
        Fjalp2.getTerminal().setPosicaoCursor(y = y + 1, x);
        Fjalp2.getTerminal().escreva("              '-|.#qo__,,ob=~~-''");
        Fjalp2.getTerminal().resetCor();

    }

    static void logo2() {
        Fjalp2.getTerminal().setCor(CorFonte.VERMELHO, CorFundo.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(39, 20);
        Fjalp2.getTerminal().escrevaln("     ::    .::::  ::::: ::   ::::    :::::");
        Fjalp2.getTerminal().setPosicaoCursor(40, 20);
        Fjalp2.getTerminal().escrevaln("    ::::   :::::: ::::: ::  ::::::  :::::::");
        Fjalp2.getTerminal().setPosicaoCursor(41, 20);
        Fjalp2.getTerminal().escrevaln("    ::::  ::`   ::  ::  :: ::   ::: ::   ::");
        Fjalp2.getTerminal().setPosicaoCursor(42, 20);
        Fjalp2.getTerminal().escrevaln("   ::  :: ::        ::  :: ::    :: ::   ::");
        Fjalp2.getTerminal().setPosicaoCursor(43, 20);
        Fjalp2.getTerminal().escrevaln("   ::  :: ::        ::  :: ::    :: ::   ::");
        Fjalp2.getTerminal().setPosicaoCursor(44, 20);
        Fjalp2.getTerminal().escrevaln("  ::::::: :::  :::  ::  :: :::  ::: ::   ::");
        Fjalp2.getTerminal().setPosicaoCursor(45, 20);
        Fjalp2.getTerminal().escrevaln("  ::    :: ::::::   ::  ::  ::::::  ::   ::");
        Fjalp2.getTerminal().setPosicaoCursor(46, 20);
        Fjalp2.getTerminal().escrevaln(" :::    ::: ::::    ::  ::   ::::   ::   ::");
        Fjalp2.getTerminal().resetCor();
    }

    static void acesso() throws Exception {
        String[][] entrada;
        int acesso = 0;
        status = 0;
        do {
            usuario = "";
            senha = "";
            Fjalp2.getTerminal().limpar(0, 35, 13, 3);
            Fjalp2.getTerminal().limpar(2, 61, 8, 2);
            Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
            Fjalp2.getTerminal().caixa(0, 35, 13, 3);
            Fjalp2.getTerminal().caixa(0, 59, 9, 3);
            Fjalp2.getTerminal().resetCor();
            Fjalp2.getTerminal().setPosicaoCursor(2, 37);
            usuario = Fjalp2.getTerminal().leiaString();
            Fjalp2.getTerminal().setPosicaoCursor(2, 61);
            Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
            senha = Fjalp2.getTerminal().leiaString();
            Fjalp2.getTerminal().resetCor();
            entrada = Funcoes.acesso("acesso.txt");
            for (int x = 0; x < entrada.length; x++) {
                if (usuario.equals(entrada[x][0]) && senha.equals(entrada[x][1])) {
                    acesso = 1;
                    if (entrada[x][2].equalsIgnoreCase("admin")) {
                        status = 1;
                    }
                }

            }
            if (acesso != 1) {
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
                Fjalp2.getTerminal().caixa(4, 45, 19, 2);
                Fjalp2.getTerminal().resetCor();
                Fjalp2.getTerminal().setPosicaoCursor(5, 47);
                Fjalp2.getTerminal().escreva("Usuario invalido");
                Fjalp2.getTerminal().resetCor();
                Fjalp2.getTerminal().aguardar(1);
                Fjalp2.getTerminal().limpar(4, 45, 23, 5);
            }
        } while (acesso != 1);
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().aguardar(1);
        Fjalp2.getTerminal().limparTela();
    }

    static void login() throws Exception {

        /*Caixa superior */
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().limparTela();
        Fjalp2.getTerminal().caixa(0, 0, 80, 55);
        Fjalp2.getTerminal().caixa(0, 0, 25, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 4);
        Fjalp2.getTerminal().escreva("Globe Corporation");
        Fjalp2.getTerminal().caixa(0, 26, 8, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 28);
        Fjalp2.getTerminal().escreva("Login:");
        Fjalp2.getTerminal().caixa(0, 35, 13, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 37);
        Fjalp2.getTerminal().caixa(0, 49, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 51);
        Fjalp2.getTerminal().escreva("Senha:");
        Fjalp2.getTerminal().caixa(0, 59, 9, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 61);
        Fjalp2.getTerminal().caixa(0, 69, 11, 3);
        Fjalp2.getTerminal().setPosicaoCursor(2, 72);
        Fjalp2.getTerminal().escreva("Entrar");
        /*Logo 1 */

        Tela2.logocentral();

        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(54, 60);
        Fjalp2.getTerminal().escreva("All rights reserved");
        Fjalp2.getTerminal().resetCor();

        /*Ação de acesso */
        entrarcyan();
        botao = 2;
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (botao == 2) {
                if (tecla == 2 || tecla == 6) {
                    entrarverde();
                    botao = 1;
                    globecyan();
                    tecla = 0;
                }
            }
            if (botao == 1) {
                if (tecla == 2 || tecla == 6) {
                    globeverde();
                    botao = 2;
                    entrarcyan();
                    tecla = 0;
                }
            }
        } while (tecla != 13 && tecla != 27);
        if (tecla == 27) {
            botao = 3;
        }
        switch (botao) {
            case 1:
                info();
                break;
            case 2:
                acesso();
                break;
            case 3:
                Tela_Ani.animacaofinal();
                Fjalp2.getTerminal().limparTela();
                System.exit(0);

        }
    }
}
