import java.util.ArrayList;

public class Contato implements Comparable<Contato> {

    private String nome;
    private ArrayList<Telefone> telefones;
    
    public Contato(String nome){
        this.nome = nome;
        this.telefones = new ArrayList<Telefone>();
    }

    public String getNome(){
        return this.nome;
    }

    public Telefone getTelefone(int index){
        return telefones.get(index);
    }

    public Integer getTotalTel(){
        return telefones.size();
    }

    public void adicionarTelefone(String identificador, String numero){
        // Criar um objeto Telefone com os parametros "identificador" e "numero"

        Telefone novo = new Telefone(identificador, numero);
        
        // Adicionar ao "this.telefones" (this.telefones.add(telefone))
        telefones.add(novo);
    }
    
    @Override
    public int compareTo(Contato outroContato) {
        return this.nome.compareTo(outroContato.getNome());
    }

}
