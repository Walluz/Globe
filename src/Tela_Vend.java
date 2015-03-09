
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class Tela_Vend {

    static int op, x, tecla, botao;
    static String lVen, dx;
    static double total = 0, d, valor, vpago, des;
    static String prod[] = new String[3];
    static int y = 0, z, cod, quant;

    static DecimalFormat df = new DecimalFormat("0.##");

    static void nenco() throws Exception {
        Fjalp2.getTerminal().caixa(12, 3, 25, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().setPosicaoCursor(13, 5);
        Fjalp2.getTerminal().escreva("Produto nao encontrado");
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().aguardar(1);
        tela_de_vendas();

    }

    public static void produto(String p) throws Exception {
        String coluna[] = p.split(",");
        prod[0] = coluna[0];
        prod[1] = coluna[1];
        prod[2] = coluna[4];
        valor = Double.parseDouble(coluna[4]);
    }

    public static void buscaCod() throws Exception {
        String info = ler("produtos.txt");
        String linha[] = info.split("\r\n");
        int sinal = 0;
        for (int y = 0; y < linha.length; y++) {
            String coluna[] = linha[y].split(",");
            int codi = Integer.parseInt(coluna[2]);
            if (cod == codi) {
                sinal = 1;
                produto(linha[y]);
            }
        }
        if (sinal == 0) {
            nenco();
        }

    }

    public static String ler(String arquivo) throws Exception {
        FileReader in = new FileReader(arquivo);
        String conteudo = "";
        int i;
        while ((i = in.read()) != -1) {
            conteudo = conteudo + (char) i;
        }
        return conteudo;
    }

    public static void abrinota() throws Exception {
        if (total != 0) {
            String info = ler("Notas.txt");
            String linha[] = info.split("\r\n");
            z = 17;
            y = 0;
            for (int x = 0; x < linha.length; x++) {
                String coluna[] = linha[x].split(",");
                Fjalp2.getTerminal().setPosicaoCursor(z, 3);
                Fjalp2.getTerminal().escreva(y + " " + coluna[0]);
                Fjalp2.getTerminal().setPosicaoCursor(z, 23);
                Fjalp2.getTerminal().escreva(coluna[1]);
                Fjalp2.getTerminal().setPosicaoCursor(z, 33);
                Fjalp2.getTerminal().escreva(coluna[2]);
                Fjalp2.getTerminal().setPosicaoCursor(z, 45);
                dx = df.format(Double.parseDouble(coluna[3]));
                Fjalp2.getTerminal().escreva(dx);
                y++;
                z++;
            }
        }
    }

    static void desenhonota() throws Exception {
        int a = 5;
        int y = 0;
        int z = 10;
        String info = ler("Notas.txt");
        String linha[] = info.split("\r\n");
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(0, 0, 80, 57);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(0, 0, 80, 55);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(3, 15, 55, 50);
        Fjalp2.getTerminal().setCorFonte(CorFonte.PRETO);
        Fjalp2.getTerminal().setPosicaoCursor(4, 16);
        Fjalp2.getTerminal().escreva(" --------------------------------------------------");
        Fjalp2.getTerminal().setPosicaoCursor(6, 40);
        Fjalp2.getTerminal().escreva("Globe");
        Fjalp2.getTerminal().setPosicaoCursor(8, 20);
        Fjalp2.getTerminal().escreva("Nome");
        Fjalp2.getTerminal().setPosicaoCursor(8, 34);
        Fjalp2.getTerminal().escreva("Qtd");
        Fjalp2.getTerminal().setPosicaoCursor(8, 43);
        Fjalp2.getTerminal().escreva("Valor Uni");
        Fjalp2.getTerminal().setPosicaoCursor(8, 58);
        Fjalp2.getTerminal().escreva("Valor");
        Fjalp2.getTerminal().setPosicaoCursor(48, 50);
        Fjalp2.getTerminal().escreva("Total: ");
        Fjalp2.getTerminal().setPosicaoCursor(48, 57);
        dx = df.format(total);
        Fjalp2.getTerminal().escreva(dx);
        for (x = 0; x < 45; x++) {
            Fjalp2.getTerminal().setPosicaoCursor(a, 16);
            Fjalp2.getTerminal().escreva("|");
            Fjalp2.getTerminal().setPosicaoCursor(a, 67);
            Fjalp2.getTerminal().escreva("|");
            a++;
        }
        Fjalp2.getTerminal().setPosicaoCursor(50, 16);
        Fjalp2.getTerminal().escreva(" --------------------------------------------------");
        for (int x = 0; x < linha.length; x++) {
            String coluna[] = linha[x].split(",");
            Fjalp2.getTerminal().setPosicaoCursor(z, 18);
            Fjalp2.getTerminal().escreva(y + " " + coluna[0]);
            Fjalp2.getTerminal().setPosicaoCursor(z, 35);
            Fjalp2.getTerminal().escreva(coluna[1]);
            Fjalp2.getTerminal().setPosicaoCursor(z, 45);
            Fjalp2.getTerminal().escreva(coluna[2]);
            Fjalp2.getTerminal().setPosicaoCursor(z, 59);
            Fjalp2.getTerminal().escreva(coluna[3]);
            y++;
            z++;
        }
        Fjalp2.getTerminal().leiaTecla();
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(3, 15, 55, 50);
    }

    public static void sobreescrever(String arquivo, String conteudo) throws Exception {
        FileWriter x = new FileWriter(arquivo, false);
        String dados = conteudo;
        x.write(dados);
        x.close();
    }

    static void excluir() throws Exception {
        Fjalp2.getTerminal().resetCor();
        Fjalp2.getTerminal().setPosicaoCursor(14, 3);
        Fjalp2.getTerminal().escreva("Linha:");
        Fjalp2.getTerminal().caixa(13, 10, 6, 2);
        Fjalp2.getTerminal().setPosicaoCursor(14, 12);
        int linhaexcluir = Fjalp2.getTerminal().leiaInt();
        String info = ler("Notas.txt");
        String linha[] = info.split("\r\n");
        for (int x = 0; x < linha.length; x++) {
            String pro = "";
            sobreescrever("Notas.txt", pro);
        }
        for (int x = 0; x < linha.length; x++) {
            if (x != linhaexcluir) {
                String pro = linha[x] + "\r\n";
                escrever("Notas.txt", pro);
            }
        }
        tela_de_vendas();
    }

    public static void escrever(String arquivo, String conteudo) throws Exception {
        FileWriter x = new FileWriter(arquivo, true);
        String dados = conteudo;
        x.write(dados);
        x.close();
    }

    static void add() throws Exception {
        Fjalp2.getTerminal().setPosicaoCursor(53, 63);
        dx = df.format(total);
        Fjalp2.getTerminal().escreva(dx);
        Fjalp2.getTerminal().setPosicaoCursor(7, 5);
        cod = Fjalp2.getTerminal().leiaInt();
        Fjalp2.getTerminal().setPosicaoCursor(7, 36);
        quant = Fjalp2.getTerminal().leiaInt();
        buscaCod();
        d = quant * valor;
        total = d + total;
        String pro = prod[0] + " " + prod[1] + "," + quant + "," + prod[2] + "," + d + "\r\n";
        escrever("Notas.txt", pro);
        abrinota();
        Fjalp2.getTerminal().setPosicaoCursor(7, 5);
        Fjalp2.getTerminal().escreva("          ");
        Fjalp2.getTerminal().setPosicaoCursor(7, 36);
        Fjalp2.getTerminal().escreva("   ");
        tela_de_vendas();
    }

    static void verde1(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(52, x, 11, 2);
    }

    static void vermelhox(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(52, x, 11, 2);
    }

    static void mov() throws Exception {
        Fjalp2.getTerminal().setPosicaoCursor(7, 5);
        Fjalp2.getTerminal().escreva("          ");
        Fjalp2.getTerminal().setPosicaoCursor(7, 36);
        Fjalp2.getTerminal().escreva("   ");
        abrinota();
        int opx = 3;
        vermelhox(opx);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            verde1(opx);
            switch (tecla) {
                case 2:
                    if (opx == 3) {
                        opx = 29;
                    } else {
                        if (opx == 16) {
                            opx = 3;
                        } else {
                            if (opx == 29) {
                                opx = 16;
                            }
                        }
                    }
                    break;
                case 6:
                    if (opx == 3) {
                        opx = 16;
                    } else {
                        if (opx == 16) {
                            opx = 29;
                        } else {
                            if (opx == 29) {
                                opx = 3;
                            }
                        }
                    }
                    break;
            }
            vermelhox(opx);

        } while (tecla != 13 && tecla != 27);
        if (tecla == 27) {
            Tela_Venda();
        }
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        switch (opx) {
            case 3:
                add();
                break;
            case 16:
                excluir();
                break;
            case 29:
                avista();
                break;
        }

    }

    static void menuprincipal() {
        Fjalp2.getTerminal().caixa(5, 1, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 3);
        Fjalp2.getTerminal().escreva("Funcionarios");
        Fjalp2.getTerminal().caixa(5, 17, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 20);
        Fjalp2.getTerminal().escreva("Produtos");
        Fjalp2.getTerminal().caixa(5, 33, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 35);
        Fjalp2.getTerminal().escreva("Fornecedores");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(5, 49, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 52);
        Fjalp2.getTerminal().escreva("Vendas");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, 65, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 69);
        Fjalp2.getTerminal().escreva("Cliente");
    }

    static void menufuncionario() {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(5, 17, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 20);
        Fjalp2.getTerminal().escreva("Produtos");
        Fjalp2.getTerminal().setCorFonte(CorFonte.CYAN);
        Fjalp2.getTerminal().caixa(5, 49, 15, 4);
        Fjalp2.getTerminal().setPosicaoCursor(7, 52);
        Fjalp2.getTerminal().escreva("Vendas");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);

    }

    public static void verde(int x) {
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(x, 2, 16, 4);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(15, 4);
                Fjalp2.getTerminal().escreva("Tela de Vendas");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(21, 5);
                Fjalp2.getTerminal().escreva("Nota Fiscal");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(27, 6);
                Fjalp2.getTerminal().escreva("Relatorio");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(33, 7);
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
                Fjalp2.getTerminal().setPosicaoCursor(15, 4);
                Fjalp2.getTerminal().escreva("Tela de Vendas");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(21, 5);
                Fjalp2.getTerminal().escreva("Nota Fiscal");
                Fjalp2.getTerminal().resetCor();
                break;
            case 3:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(27, 6);
                Fjalp2.getTerminal().escreva("Relatorio");
                Fjalp2.getTerminal().resetCor();
                break;
            case 4:
                Fjalp2.getTerminal().setCorFonte(CorFonte.AZUL);
                Fjalp2.getTerminal().setPosicaoCursor(33, 7);
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
                    op = 31;
                    botao = 4;
                    tecla = 0;
                }
            }
            if (op == 31) {
                verde(op);
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

    static void logoart() {

        Fjalp2.getTerminal().setPosicaoCursor(16, 43);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("          @;`@   ");
        Fjalp2.getTerminal().setPosicaoCursor(17, 43);
        Fjalp2.getTerminal().escreva("          @+:@   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(18, 43);
        Fjalp2.getTerminal().escreva("       @@@@@@@@@.");
        Fjalp2.getTerminal().setPosicaoCursor(19, 43);
        Fjalp2.getTerminal().escreva("      ;@@#@;.@@@@");
        Fjalp2.getTerminal().setPosicaoCursor(20, 43);
        Fjalp2.getTerminal().escreva("     .@@  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("@;`@` ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("@@");
        Fjalp2.getTerminal().setPosicaoCursor(21, 43);
        Fjalp2.getTerminal().escreva("     :@#  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("@;`@` ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("@@.");
        Fjalp2.getTerminal().setPosicaoCursor(22, 43);
        Fjalp2.getTerminal().escreva("     .@@ ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva(" @;`@`    ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(23, 43);
        Fjalp2.getTerminal().escreva("      #@@");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("`@;`@`    ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().setPosicaoCursor(24, 43);
        Fjalp2.getTerminal().escreva("       @@@@@@@`    ");
        Fjalp2.getTerminal().setPosicaoCursor(25, 43);
        Fjalp2.getTerminal().escreva("         :@@@@@@+  ");
        Fjalp2.getTerminal().setPosicaoCursor(26, 43);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("          @;`@;");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("@@@ ");
        Fjalp2.getTerminal().setPosicaoCursor(27, 43);
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("          @;`@`");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva(" @@#");
        Fjalp2.getTerminal().setPosicaoCursor(28, 43);
        Fjalp2.getTerminal().escreva("     @@   ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva("@;`@` ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva(" @@");
        Fjalp2.getTerminal().setPosicaoCursor(29, 43);
        Fjalp2.getTerminal().escreva("     @@  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva(" @;`@` ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva(" @@");
        Fjalp2.getTerminal().setPosicaoCursor(30, 43);
        Fjalp2.getTerminal().escreva("     ,@@,");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().escreva(" @;`@` ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().escreva("@@,");
        Fjalp2.getTerminal().setPosicaoCursor(31, 43);
        Fjalp2.getTerminal().escreva("      :@@@@',@@@@' ");
        Fjalp2.getTerminal().setPosicaoCursor(32, 43);
        Fjalp2.getTerminal().escreva("       ,@@@@@@@@:  ");
        Fjalp2.getTerminal().setCorFonte(CorFonte.AMARELO);
        Fjalp2.getTerminal().setPosicaoCursor(33, 43);
        Fjalp2.getTerminal().escreva("          @;`@     ");
        Fjalp2.getTerminal().setPosicaoCursor(34, 43);
        Fjalp2.getTerminal().escreva("          @;`@     ");
        Fjalp2.getTerminal().resetCor();
    }

    static void tela_de_vendas() throws Exception {
        Fjalp2.getTerminal().limparTela();

        /* Limpa tela e barra indice */
        Fjalp2.getTerminal().setCorFundo(CorFundo.PRETO);
        Fjalp2.getTerminal().limpar(18, 8, 38, 25);
        Fjalp2.getTerminal().resetCor();
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
        Fjalp2.getTerminal().setPosicaoCursor(21, 59);
        Fjalp2.getTerminal().escreva(Tela1.usuario);
        Fjalp2.getTerminal().setPosicaoCursor(26, 59);
        Fjalp2.getTerminal().escreva("Cliente:");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(39, 60, 15, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(40, 64);
        Fjalp2.getTerminal().escreva("Procurar");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(44, 60, 11, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(45, 64);
        Fjalp2.getTerminal().escreva("Cupom");
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
        Fjalp2.getTerminal().caixa(52, 3, 11, 2);
        Fjalp2.getTerminal().setPosicaoCursor(53, 7);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().escreva("ADD");
        Fjalp2.getTerminal().setPosicaoCursor(10, 3);
        Fjalp2.getTerminal().escreva("  Produto:");
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
        Fjalp2.getTerminal().caixa(51, 0, 80, 6);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(52, 16, 11, 2);
        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(53, 18);
        Fjalp2.getTerminal().escreva("Remover");
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(52, 29, 11, 2);

        Fjalp2.getTerminal().setCorFonte(CorFonte.BRANCO);
        Fjalp2.getTerminal().setPosicaoCursor(53, 31);
        Fjalp2.getTerminal().escreva("Concluir");

        Fjalp2.getTerminal().setPosicaoCursor(53, 55);
        Fjalp2.getTerminal().escreva("TOTAL: ");
        mov();
        Fjalp2.getTerminal().leiaTecla();

    }

    static void verdepdv(int x) {

        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(x, 10, 12, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(24, 13);
                Fjalp2.getTerminal().escreva("A Vista");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(28, 13);
                Fjalp2.getTerminal().escreva("Cartao");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    public static void vermelho(int x) {
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(x, 10, 12, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(24, 13);
                Fjalp2.getTerminal().escreva("A Vista");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(28, 13);
                Fjalp2.getTerminal().escreva("Cartao");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    public static void vermelhocard(int x) {
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(x, 15, 12, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(31, 18);
                Fjalp2.getTerminal().escreva("Debito");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(34, 18);
                Fjalp2.getTerminal().escreva("Credito");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    static void verdecard(int x) {

        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(x, 15, 12, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(31, 18);
                Fjalp2.getTerminal().escreva("Debito");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(34, 18);
                Fjalp2.getTerminal().escreva("Credito");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    public static void movepdv() {

        op = 23;
        botao = 1;
        do {

            vermelho(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 23) {
                if (tecla == 16 || tecla == 14) {
                    verdepdv(op);
                    botao = 2;
                    tecla = 0;

                    op = 27;
                    vermelho(op);

                }
            }
            if (op == 27) {
                vermelho(op);
                if (tecla == 14 || tecla == 16) {
                    verdepdv(op);
                    botao = 1;
                    tecla = 0;

                    op = 23;
                    vermelho(op);

                }
            }

        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();

    }

    public static void movecard() {

        op = 30;

        botao = 1;
        do {

            vermelhocard(op);
            tecla = Fjalp2.getTerminal().leiaTecla();
            if (op == 30) {
                if (tecla == 16 || tecla == 14) {
                    verdecard(op);
                    botao = 2;
                    tecla = 0;

                    op = 33;
                    vermelhocard(op);

                }
            }
            if (op == 33) {
                vermelhocard(op);
                if (tecla == 14 || tecla == 16) {
                    verdecard(op);
                    botao = 1;
                    tecla = 0;

                    op = 30;
                    vermelhocard(op);

                }
            }

        } while (tecla != 13 && tecla != 27);
        Fjalp2.getTerminal().resetCor();

    }

    static void pagamento() {

        Fjalp2.getTerminal().limpar(18, 8, 33, 20);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(18, 8, 33, 20);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(18, 8, 33, 20);
        Fjalp2.getTerminal().setPosicaoCursor(20, 10);
        Fjalp2.getTerminal().escreva("Selecione Forma de Pagamento:");
        Fjalp2.getTerminal().caixa(23, 10, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(24, 13);
        Fjalp2.getTerminal().escreva("A Vista");
        Fjalp2.getTerminal().caixa(27, 10, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(28, 13);
        Fjalp2.getTerminal().escreva("Cartao");

    }

    static void op_pagamento() throws Exception {

        pagamento();

        movepdv();
        if (tecla == 27) {
            tela_de_vendas();
        }
        switch (op) {
            case 23:
                avista();
                break;
            case 27:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().caixa(30, 15, 12, 2);
                Fjalp2.getTerminal().setPosicaoCursor(31, 18);
                Fjalp2.getTerminal().escreva("Debito");
                Fjalp2.getTerminal().caixa(33, 15, 12, 2);
                Fjalp2.getTerminal().setPosicaoCursor(34, 18);
                Fjalp2.getTerminal().escreva("Credito");
                movecard();
                if (op == 30) {
                    debito();
                } else {
                    cred();
                }
                break;
        }

    }

    static void v(int x) {

        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(35, x, 10, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(24, 13);
                Fjalp2.getTerminal().escreva("Pagar");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERDE);
                Fjalp2.getTerminal().setPosicaoCursor(28, 13);
                Fjalp2.getTerminal().escreva("Voltar");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    public static void ver(int x) {
        Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
        Fjalp2.getTerminal().caixa(35, x, 10, 2);
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(36, 16);
                Fjalp2.getTerminal().escreva("Pagar");
                Fjalp2.getTerminal().resetCor();
                break;
            case 2:
                Fjalp2.getTerminal().setCor(CorFundo.BRANCO, CorFonte.VERMELHO);
                Fjalp2.getTerminal().setPosicaoCursor(36, 28);
                Fjalp2.getTerminal().escreva("Voltar");
                Fjalp2.getTerminal().resetCor();
                break;

        }
    }

    static void avista() throws Exception {

        Fjalp2.getTerminal().limpar(18, 8, 33, 20);
        Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
        Fjalp2.getTerminal().limpar(18, 8, 33, 20);
        Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
        Fjalp2.getTerminal().caixa(18, 8, 33, 20);
        Fjalp2.getTerminal().setPosicaoCursor(20, 16);
        Fjalp2.getTerminal().escreva("PAGAMENTO A VISTA");
        Fjalp2.getTerminal().setPosicaoCursor(24, 10);
        Fjalp2.getTerminal().escreva("Valor a pagar RS:");
        Fjalp2.getTerminal().caixa(23, 27, 12, 2);
        Fjalp2.getTerminal().setPosicaoCursor(28, 10);
        Fjalp2.getTerminal().escreva("Valor Pago RS:");
        Fjalp2.getTerminal().caixa(27, 24, 12, 2);

        Fjalp2.getTerminal().setPosicaoCursor(32, 10);
        Fjalp2.getTerminal().escreva("Desconto %:");
        Fjalp2.getTerminal().caixa(31, 21, 9, 2);

        Fjalp2.getTerminal().setPosicaoCursor(36, 16);
        Fjalp2.getTerminal().escreva("Pagar");
        Fjalp2.getTerminal().caixa(35, 13, 10, 2);
        Fjalp2.getTerminal().setPosicaoCursor(36, 28);
        Fjalp2.getTerminal().escreva("Voltar");
        Fjalp2.getTerminal().caixa(35, 26, 10, 2);

        Fjalp2.getTerminal().setPosicaoCursor(24, 29);
        dx = df.format(total);
        Fjalp2.getTerminal().escreva(dx);
        Fjalp2.getTerminal().setPosicaoCursor(28, 26);
        vpago = Fjalp2.getTerminal().leiaDouble();
        Fjalp2.getTerminal().setPosicaoCursor(32, 23);
        des = Fjalp2.getTerminal().leiaDouble();
        int opx = 13;
        ver(opx);
        do {
            tecla = Fjalp2.getTerminal().leiaTecla();
            v(opx);
            switch (tecla) {
                case 2:
                    if (opx == 13) {
                        opx = 26;
                        botao = 2;
                    } else {
                        if (opx == 26) {
                            opx = 13;
                            botao = 1;
                        }
                    }
                    break;
                case 6:
                    if (opx == 26) {
                        opx = 13;
                        botao = 1;

                    } else {
                        if (opx == 13) {
                            opx = 26;
                            botao = 2;
                        }
                    }
                    break;
            }
            ver(opx);
        } while (tecla != 13 && tecla != 27);
        if (tecla == 27) {
            tela_de_vendas();
        }
        switch (botao) {
            case 1:
                Fjalp2.getTerminal().limpar(18, 8, 33, 20);
                Fjalp2.getTerminal().setCorFundo(CorFundo.BRANCO);
                Fjalp2.getTerminal().limpar(18, 8, 33, 20);
                Fjalp2.getTerminal().setCorFonte(CorFonte.VERDE);
                Fjalp2.getTerminal().caixa(28, 15, 20, 2);
                Fjalp2.getTerminal().setPosicaoCursor(29, 17);
                Fjalp2.getTerminal().escreva("Troco de " + (vpago - (total - (total * des))));
                Fjalp2.getTerminal().aguardar(3);
                String info = ler("Notas.txt");
                String linha[] = info.split("\r\n");
                Funcoes.escrever("NotaFiscalRegistro.txt", info + "\r\n" + total + "\r\n");
                Funcoes.sobreescrever("NotaFiscalUltima.txt", info + "\r\n" + total);
                nf();
                for (int x = 0; x < linha.length; x++) {
                    String pro = "";
                    sobreescrever("Notas.txt", pro);
                }
                total = 0;
                tela_de_vendas();
                break;
            case 2:
                tela_de_vendas();
        }

    }

    static void cred() {
    }

    static void debito() {
    }

    static void nf() throws Exception {
        desenhonota();
    }

    public static void Tela_Venda() throws Exception {

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

        if (Tela1.status == 1) {
            menuprincipal();
        } else {
            menufuncionario();
        }

        /* Menu lateral */
        Fjalp2.getTerminal().caixa(13, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(15, 4);
        Fjalp2.getTerminal().escreva("Tela de Vendas");
        Fjalp2.getTerminal().caixa(19, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(21, 5);
        Fjalp2.getTerminal().escreva("Nota Fiscal");
        Fjalp2.getTerminal().caixa(25, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(27, 6);
        Fjalp2.getTerminal().escreva("Relatorio");
        Fjalp2.getTerminal().caixa(31, 2, 16, 4);
        Fjalp2.getTerminal().setPosicaoCursor(33, 7);
        Fjalp2.getTerminal().escreva("Voltar");

        /* Logo Action */
        Tela_Fun.logoaction();
        /*Logo art*/
        logoart();
        movesub();
        if (tecla == 27) {
            verde(op);
            op = 31;
        }
        switch (op) {
            case 13:
                tela_de_vendas();
                break;
            case 19:
                nf();
                break;
            case 25:
                Tela_Fun.relatorios();
                break;
            case 31:
                if (Tela1.status == 1) {
                    Tela2.TelaPrincipal();
                } else {
                    Tela22.TelaFuncionario();
                }
                break;

        }
    }
}
