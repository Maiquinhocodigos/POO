public class CartaoRU {
   private final String idCartao;
   private String siapeDiscente;
   private Boolean isencao;
   private Double saldo;

   public CartaoRU(String idCartao, final String siapeDiscente, Boolean isencao) {
      this.idCartao = idCartao;
      this.siapeDiscente = siapeDiscente;
      this.isencao = isencao;
      this.saldo = 0.0;

   }

   public void recarregar(double valor) {
      if (valor > 0) {
         this.saldo += valor;
      } else
         System.out.println("Valor inválido");

   }

   public Boolean fazerRefeicao() {
      if (this.isencao == true) {
         return true;
      }
      if ((this.isencao == false) && (this.saldo >= 1.10)) {
         this.saldo -= 1.10;
         return true;
      }
      return false;

   }

   public Double emitirSaldo() {
      return this.saldo;
   }

   public void alterarIsencao(boolean isencao) {
      this.isencao = isencao;
   }

}
