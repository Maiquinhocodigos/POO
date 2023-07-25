import java.util.ArrayList;
import java.util.Collections;

public class AgendaContatos {
    private ArrayList<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new ArrayList<Contato>();
    }

    public Boolean cadastrarContato(String nome, String numero, String identificador) {
        for (Contato contato : agenda) {
            if(contato.getNome() == nome){
                return false;
            }
        } Contato nomeContato = new Contato(nome);
        nomeContato.adicionarTelefone(identificador, numero);
        agenda.add(nomeContato);
        return true;
    }

    public Boolean removerContato(String nome) {
        for (Contato contato : agenda) {
           if(contato.getNome() == nome){
            agenda.remove(contato);
            return true;
           }
        }return false;
    }

    public Contato buscarContato(String nome) {
    for (Contato contato : agenda) {
        if (contato.getNome().equals(nome)) {
            return contato;
        }
    }
    return null;
}


    public void imprimirContatos(){
        Collections.sort(agenda);
        for (Contato contato : agenda) {
            System.out.println(contato.getNome());
            for(int i = 0; i < contato.getTotalTel(); i++) {
             Telefone t = contato.getTelefone(i);  
             System.out.printf("%s %s\n",t.getNumero(),t.getIdentificador()); 
            }
        }
            
            
    }

}
