import java.util.ArrayList;

public class Gerenciador {
    
    private ArrayList<Funcionarios> funcionarios;

    public Gerenciador(){
        funcionarios = new ArrayList<Funcionarios>();
    }

    public boolean adicionarFuncionario(Funcionarios funcionario){
        if(funcionario instanceof Clt){
            if(funcionario.getSalario() < 1320.0){
                return false;
            }if(this.acharConta(funcionario.getCpf()) != null){
                return false;
            }
            else {
                funcionarios.add(funcionario);
                return true;
            }
        } else {
            funcionarios.add(funcionario);
            return true;
        }
    }

    public void extratoGeral(){
        for (Funcionarios funcionario : funcionarios){
            double beneficios = funcionario.getauxilioSaude();
            if (funcionario instanceof Clt){
                beneficios += funcionario.valeRefeicao();
            }
            System.out.printf("%s - Salário: %.2f - Beneficios: %.2f\n", funcionario.getCpf(), funcionario.getSalario(), beneficios);
        }
    }

    public Double emitirFolha(){
        double total = 0.0;
        for (Funcionarios funcionario : funcionarios){
            total += funcionario.getSalario() + funcionario.getauxilioSaude();
            if (funcionario instanceof Clt){
                total += funcionario.valeRefeicao();
            }
        }
        return total;
    }

    public Double emitirBeneficios(){
        double total = 0.0;
        for (Funcionarios funcionario : funcionarios){
            total += funcionario.getauxilioSaude();
            if (funcionario instanceof Clt){
                total += funcionario.valeRefeicao();
            }
        }
        return total;
    }

    private Funcionarios acharConta(String cpf){
        for (Funcionarios funcionarios2 : funcionarios) {
            if(funcionarios2.getCpf() == cpf){
                return funcionarios2;
            }
        } return null;
    }

}
