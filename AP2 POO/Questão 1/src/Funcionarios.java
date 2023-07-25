public class Funcionarios {
    private String nome;
    private String cpf;
    public Double salario;
    private Double auxilioSaude;
    
    public Funcionarios(String nome, String cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.auxilioSaude = 500.0;
    }

    public Double valeRefeicao(){
        return 0.0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public Double getSalario(){
        return this.salario;
    }

    public Double getauxilioSaude(){
        return this.auxilioSaude;
    }
    
}
