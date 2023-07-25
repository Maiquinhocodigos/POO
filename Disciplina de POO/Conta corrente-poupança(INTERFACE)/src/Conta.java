import java.util.ArrayList;
public interface Conta {
    
    public void alterarLimite(Double novoLimite);
    

    public Double emitirSaldo();

    public void depositar(Double valor);

    public Boolean sacar(Double valor);

    public String getCodigo();

    public ArrayList<Double> emitirExtrato();
}
