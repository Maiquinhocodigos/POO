public class ContaPoupanca extends ContaCorrente {
    public ContaPoupanca(String codigo, Double saldoInicial) {
        super(codigo, saldoInicial);
        this.saldoInicial = saldoInicial;

    }

    @Override
    public void alterarLimite(Double novoLimite) {}
}
