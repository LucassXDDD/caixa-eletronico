public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 50.0;
        double valorSolicitado = 25.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("O seu saldo atual é de: " + saldo + " R$");
        }

    }
}
