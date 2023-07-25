package pacote1;

public class Conta {

   private int conta;
   private double saldo;
   private double limite;

   public Conta(int conta, double saldo) {
      this.conta = conta;
      this.saldo = saldo;
      this.limite = 100.0;

   }

   public int getNum(int conta) {
      return conta;
   }

   public void depositar(double deposito) {
      this.saldo += deposito;
   }

   public boolean sacar(double valor) {
      if (valor > saldo+limite) {
         return false;
      } else {
         saldo -= valor;
      }
      return true;
   }

   public void alterarLimite(double novoLimite) {
      this.limite = novoLimite;

   }

   public double emitirSaldo() {
      return saldo;

   }
}
