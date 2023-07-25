import java.util.ArrayList;
public class ContaCorrente implements Conta {
    String codigo;
    Double limite = 100.0;
    Double saldoInicial;

    public ContaCorrente(String codigo, Double saldoInicial){
        this.codigo = codigo;
        this.saldoInicial = saldoInicial + this.limite;
    }

    public void alterarLimite(Double novoLimite){
        this.limite = novoLimite;
    }

    public Double emitirSaldo(){
        return this.saldoInicial;
    }

    public void depositar(Double valor){
        if(valor > 0){
            this.saldoInicial += valor;
        }
    }

    public Boolean sacar(Double valor){
        if(valor <= saldoInicial && valor > 0){
            saldoInicial -= valor;
            return true;
        }return false;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public ArrayList<Double> emitirExtrato() {
        ArrayList<Double> valores = new ArrayList<>();
        return valores;
    }


}
