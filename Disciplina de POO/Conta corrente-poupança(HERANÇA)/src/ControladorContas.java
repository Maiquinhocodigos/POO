import java.util.ArrayList;

public class ControladorContas {
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Boolean cadastrarContaCorrente(String codigo, Double saldoInicial) {
        if (buscarConta(codigo) == null) {
            Conta novaContaCorrente = new ContaCorrente(codigo, saldoInicial);
            contas.add(novaContaCorrente);
            return true;
        }
        return false;

    }

    public Boolean cadastrarContaPoupanca(String codigo, Double saldoInicial) {
        if (buscarConta(codigo) == null) {
            Conta novaContaPoupanca = new ContaPoupanca(codigo,saldoInicial);
            contas.add(novaContaPoupanca);
            return true;
        }
        return false;

    }

    public Boolean realizarSaque(String origem, Double valor) {
        Conta conta = buscarConta(origem);
        if (conta != null) {
            conta.sacar(valor);
            return true;
        }return false;
    }

    public Boolean realizarDeposito(String destino, Double valor) {
        Conta conta = buscarConta(destino);
        if (buscarConta(destino) != null) {
            conta.depositar(valor);
            return true;
        }return false;
    }

    public Boolean realizarTransferencia(String origem, String destino, Double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);

        if(contaOrigem != null && contaDestino != null){
            contaDestino.depositar(valor);
            contaOrigem.sacar(valor);
            return true;
        }
        
        return false;
    }

    public Double emitirSaldo(String codigo) {
        Conta conta = buscarConta(codigo);
        if (conta != null) {
            return conta.emitirSaldo();
        } else
            return -1.0;
    }

    private Conta buscarConta(String codigo) {
        for (Conta conta : contas) {
            if (conta.getCodigo().equals(codigo)) {
                return conta;
            }
        }
        return null;
    }
}
