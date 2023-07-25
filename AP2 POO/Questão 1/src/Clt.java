public class Clt extends Funcionarios {

    public Clt(String nome, String cpf, Double salario){
        // VERIFICAR SE SALARIO É MENOR QUE O SALARIO MINIMO
        super(nome, cpf, salario);
    }

    @Override
    public Double valeRefeicao(){
        return (salario * 6) / 100;
    }

}
