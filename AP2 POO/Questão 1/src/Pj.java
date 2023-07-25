public class Pj extends Funcionarios {
    String cnpj;

    public Pj(String nome, String cpf, String cnpj, Double salario){
        super(nome, cpf, salario);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
    
}
