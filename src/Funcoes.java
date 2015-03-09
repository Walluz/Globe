
import java.io.*;
import java.util.Scanner;

public class Funcoes {

    public static String ler(String arquivo) throws Exception {
        FileReader in = new FileReader(arquivo);
        String conteudo = "";
        int i;
        while ((i = in.read()) != -1) {
            conteudo = conteudo + (char) i;
        }
        return conteudo;
    }

    public static void escrever(String arquivo, String conteudo) throws Exception {
        FileWriter x = new FileWriter(arquivo, true);
        String dados = conteudo;
        x.write(dados);
        x.close();
    }

    public static void sobreescrever(String arquivo, String conteudo) throws Exception {
        FileWriter x = new FileWriter(arquivo, false);
        String dados = conteudo;
        x.write(dados);
        x.close();
    }

    public static String[][] buscavendedor(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] vendedor;
        vendedor = new String[linha.length][3];
        for (int x = 0; x < linha.length; x++) {
            String coluna[] = linha[x].split(",");
            vendedor[x][0] = coluna[0]; // recebe o nome
            vendedor[x][1] = coluna[9]; // recebe matricula
            vendedor[x][2] = coluna[10]; // recebe cargo
        }
        return vendedor;
    }

    public static String[][] infovendedor(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] vendedor;
        vendedor = new String[linha.length][13];
        for (int x = 0; x < linha.length; x++) {
            for (int y = 0; y < 13; y++) {
                String coluna[] = linha[x].split(",");
                vendedor[x][y] = coluna[y];
            }
        }
        return vendedor;
    }

    public static String[][] infoproduto(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] produto;
        produto = new String[linha.length][5];
        for (int x = 0; x < linha.length; x++) {
            for (int y = 0; y < 5; y++) {
                String coluna[] = linha[x].split(",");
                produto[x][y] = coluna[y];
            }
        }
        return produto;
    }

    public static String[][] infofornecedor(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] fornecedor;
        fornecedor = new String[linha.length][11];
        for (int x = 0; x < linha.length; x++) {
            for (int y = 0; y < 11; y++) {
                String coluna[] = linha[x].split(",");
                fornecedor[x][y] = coluna[y];
            }
        }
        return fornecedor;
    }

    public static String[][] infocliente(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] cliente;
        cliente = new String[linha.length][11];
        for (int x = 0; x < linha.length; x++){
            for (int y = 0; y < 11; y++){
                 String coluna[] = linha[x].split(",");
                cliente[x][y] = coluna[y];
            }
        }
        return cliente;
    }

    public static String[][] acesso(String arquivo) throws Exception {
        String info = ler(arquivo);
        String[] linha = info.split("\r\n");
        String[][] acesso = new String[linha.length][3];
        for (int x = 0; x < linha.length; x++) {
            String coluna[] = linha[x].split(",");
            acesso[x][0] = coluna[0];//recebe nome
            acesso[x][1] = coluna[1];//recebe senha
            acesso[x][2] = coluna[2];//recebe status
        }
        return acesso;
    }

    public static String[][] buscaproduto(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] produto;
        produto = new String[linha.length][4];
        for (int x = 0; x < linha.length; x++) {
            String coluna[] = linha[x].split(",");
            produto[x][0] = coluna[0]; // recebe o nome
            produto[x][1] = coluna[1]; // recebe a marca
            produto[x][2] = coluna[2]; // recebe o codigo
            produto[x][3] = coluna[4]; // recebe o preço

        }

        return produto;
    }

    public static String[][] buscafornecedor(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] fornecedor;
        fornecedor = new String[linha.length][3];
        for (int x = 0; x < linha.length; x++) {
            String coluna[] = linha[x].split(",");
            fornecedor[x][0] = coluna[0]; // recebe o nome
            fornecedor[x][1] = coluna[1]; // recebe cnpj
            fornecedor[x][2] = coluna[8]; //recebe matricula
        }
        return fornecedor;
    }

    public static String[][] buscacliente(String arquivo) throws Exception {
        String info = ler(arquivo);
        String linha[] = info.split("\r\n");
        String[][] cliente;
        cliente = new String[linha.length][3];
        for (int x = 0; x < linha.length; x++) {
            String[] coluna = linha[x].split(",");
            cliente[x][0] = coluna[0];//recebe o nome
            cliente[x][1] = coluna[8];//recebe telefone
            cliente[x][2] = coluna[10];//recebe matricula
        }

        return cliente;
    }
}
