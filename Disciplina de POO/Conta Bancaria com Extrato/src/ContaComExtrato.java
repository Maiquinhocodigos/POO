public class ContaComExtrato {
    private final Integer codigo;
    private Double saldo;
    private Double limite;
    private Double[] extrato;
    public Integer apontando;

    public ContaComExtrato(Integer codigoConta, Double saldoInicial) {
        this.extrato = new Double[20];
        this.apontando = 0;
        this.codigo = codigoConta;
        this.saldo = 0.0;
        this.depositar(saldoInicial);
        limite = 100.00;
        

    }

    public void alterarLimite(Double novoLimite) {
        this.limite = novoLimite;
    }

    public Double emitirSaldo() {
        return this.saldo + this.limite;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            extrato[apontando] = valor;
            this.apontando++;
            this.saldo += valor;
        }
    }

    public Boolean sacar(Double valor) {
        if ((valor > 0) && (valor < this.saldo + limite)) {
            extrato[apontando] = -valor;
            this.apontando++;
            saldo -= valor;
            return true;
        }
        return false;

    }

    public Double[] emitirExtrato() {
        return this.extrato;

    }

}
