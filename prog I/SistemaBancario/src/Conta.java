public class Conta {
    int numero;
    double saldo;
    double limite;

    void deposita(double valor) {
        saldo += valor;
    }
}
