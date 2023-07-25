public class ControladorContas {

    private ContaComExtrato[] contas;
    private Integer cursor;
  
    public ControladorContas() {
      this.contas = new ContaComExtrato[20];
      this.cursor = 0;
    }
  
    public Boolean cadastrarConta(String codigo, Double saldoInicial) {
      if (buscarConta(codigo) == null) {
        this.contas[cursor] = new ContaComExtrato(codigo, saldoInicial);
        this.cursor++;
        return true;
      }
      return false;
    }
  
    public Boolean realizarSaque(String codigo, Double valor) {
      ContaComExtrato contaOrigem = buscarConta(codigo);
      if (contaOrigem != null) {
        return contaOrigem.sacar(valor); // retorno o resultado do saque
      }
      return false;
    }
  
    public Boolean realizarDeposito(String codigo, Double valor) {
      ContaComExtrato contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
        contaDestino.depositar(valor);
        return true;
      }
      return false;
    }
  
    public Boolean realizarTransferencia(String codigoOrigem, String codigoDestino, Double valor) {
      ContaComExtrato contaOrigem = buscarConta(codigoOrigem);
      ContaComExtrato contaDestino = buscarConta(codigoDestino);
      // verifica se ambas contas foram achadas
      if (contaOrigem != null && contaDestino != null) {
        //verifica se saque deu certo
        if(contaOrigem.sacar(valor)){
          //se saque deu certo, entao deposita no destino
          contaDestino.depositar(valor);
          return true;
        } else {
          return false;
        }
      }
      return false;
    }
  
    public Double emitirSaldo(String codigo) {
      ContaComExtrato contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
          return contaDestino.emitirSaldo();
      }
      return -1.0;
    }
  
    private ContaComExtrato buscarConta(String codigoBuscado) {
      ContaComExtrato contaAchada = null;
      for (int i = 0; i < this.cursor; i++) {
        if (this.contas[i].getCodigo() == codigoBuscado) {
          contaAchada = this.contas[i];
          break;
        }
      }
      return contaAchada;
    }
  }