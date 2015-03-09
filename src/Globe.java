
public class Globe {

    static void inicio() throws Exception {
        Tela_Ani.animacao();
        Tela1.login();
        if (Tela1.status == 1) {
            Tela2.TelaPrincipal();
        } else {
            Tela22.TelaFuncionario();
        }
    }

    static void Logoff() throws Exception {
        Tela1.login();
        if (Tela1.status == 1) {
            Tela2.TelaPrincipal();
        } else {
            Tela22.TelaFuncionario();
        }
    }

    public static void main(String[] args) throws Exception {
        inicio();
    }
}
