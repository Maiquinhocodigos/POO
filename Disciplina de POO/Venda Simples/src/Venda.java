
import java.util.ArrayList;

public class Venda {
    public ArrayList<ItemDeVenda> items;
    String numeroNotaFiscal;

    public Venda() {
        this.items = new ArrayList<ItemDeVenda>();
    }

    public void adicionarItem(String codigo, String descricao, Double quantidade, String unidade,Double valorUnitario) {
        ItemDeVenda item = new ItemDeVenda(codigo, descricao, quantidade, unidade, valorUnitario);
        if (quantidade > 0 && valorUnitario > 0 && (!codigo.isEmpty()) && (!descricao.isEmpty())
                && (!unidade.isEmpty())) {
            items.add(item);

        }
    }

    public Venda(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Double getValorTotal(){
        Double total = 0.0;
        for (ItemDeVenda itemDeVenda : items) {
            total += itemDeVenda.getValorTotal();
        }
        return total; 

    }

    public String imprimir(){
        StringBuilder str = new StringBuilder();

        for(ItemDeVenda itemDeVenda : items){
            str.append(itemDeVenda.imprimir());
        }
        return str.toString();
    }
    
}

/*
 * ArrayList<Item> list = new ArrayList<Item>();
 * Item item = new Item(codigo, descricao, unidade, quantidade, valorUnitario);
 * if (quantidade > 0 && valorUnitario > 0 && !codigo.isEmpty() &&
 * !descricao.isEmpty() && !unidade.isEmpty()) {
 * list.add(item);
 * }
 * }
 */
