
public class ItemDeVenda {
    private String codigo;
    private String descricao;
    private String unidade;
    private double quantidade;
    private double valorUnitario;
    

    public ItemDeVenda(String codigo, String descricao,  double quantidade, String unidade, double valorUnitario){
        this.codigo = codigo.toString();
        this.descricao = descricao.toString();
        this.unidade = unidade.toString();
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String imprimir(){
        StringBuilder str = new StringBuilder();

        str.append("Codigo:" + codigo + " descricao:" + descricao + " unidade:" + unidade + " quantidade:" + quantidade + " valorUnitario:" + valorUnitario);

        return str.toString();
    }

    public Double getValorTotal(){
        return this.valorUnitario * this.quantidade;
    }
}
