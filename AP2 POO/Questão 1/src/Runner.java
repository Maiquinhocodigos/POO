public class Runner {
    public static void main(String[] args) throws Exception {
        Gerenciador folha = new Gerenciador();
        Clt func = new Clt("Maria", "2132134", 3423.0);
        Pj func2 = new Pj("Mario", "2132322", "12334", 3000.0);
        folha.adicionarFuncionario(func);
        folha.adicionarFuncionario(func2);
        folha.extratoGeral();

        System.out.println("======================================================");
        System.out.println(folha.emitirFolha());
        System.out.println(folha.emitirBeneficios());

        Clt novoFunc = new Clt("Maicon", "00123456", 1300.0);
        Clt novoClt = new Clt("Pedro", "00123456", 3000.99);

        boolean adicionouFuncionario = folha.adicionarFuncionario(novoFunc);
        boolean addNovoClt = folha.adicionarFuncionario(novoClt);

        // Verificando se vai dar certo um funcionario NÃO ser cadastrado
        if (adicionouFuncionario) {
            System.out.println("Erro: Funcionário adicionado com sucesso!");
        } else {
            System.out.println("Esperado: Não foi possível adicionar. Salário abaixo do mínimo.");
        }

        if (addNovoClt) {
            System.out.println("Erro: Funcionário adicionado com sucesso!");
        } else {
            System.out.println("Esperado: Não foi possível adicionar. CPF já existe.");
        }

        // Adicionando um novo funcionario para atualizar a folha de pagamento
        Clt novoFuncionario = new Clt("Maicon", "00123456", 5000.0);
        boolean addFunc = folha.adicionarFuncionario(novoFuncionario);

        System.out.println("======================================================");
        folha.extratoGeral();
        System.out.println("Beneficios:" + folha.emitirBeneficios());


    }
}
