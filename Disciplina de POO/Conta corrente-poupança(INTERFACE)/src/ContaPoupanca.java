import java.util.ArrayList;
public class ContaPoupanca implements Conta{
    String codigo;
    Double saldoInicial;

    public ContaPoupanca(String codigo, Double saldoInicial){
        this.codigo = codigo;
        this.saldoInicial = saldoInicial;
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
