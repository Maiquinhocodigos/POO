public class Runner {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Cadastrar contatos
        agenda.cadastrarContato("Maicon", "88999287372", "Casa");
        agenda.cadastrarContato("Augusto", "99992849", "Trabalho");
        agenda.cadastrarContato("Paulo", "40028922", "BomDia&Cia");

        // Tentar cadastrar um contato com o mesmo nome (não deve ser possível)
        boolean cadastrado = agenda.cadastrarContato("Paulo", "999999999", "Outro");
        if (!cadastrado) {
            System.out.println("Esperado: Não foi possível cadastrar o contato com o mesmo nome.");
        }else System.out.println("Erro: Contato cadastrado com sucesso");

        // Associar mais telefones a um mesmo contato (é possivel)
        Contato contato = agenda.buscarContato("Maicon");
        if (contato != null) {
            contato.adicionarTelefone("Celular", "999999999");
            contato.adicionarTelefone("Trabalho", "888888888");

        }
            // Remover um contato se achar o nome dele (caso que não funciona)
            boolean removido = agenda.removerContato("Maria");
            if (removido) {
                System.out.println("Erro: Contato removido com sucesso.");
            } else {
                System.out.println("Esperado: Não foi possível remover o contato.");
            }

            System.out.println("=============================================");

            // Imprimir contatos
            System.out.println("Lista de contatos:");
            agenda.imprimirContatos();

            // remover contato (agora tem q funcionar)
            boolean remover2 = agenda.removerContato("Augusto");
            if (remover2) {
                System.out.println("Esperado: Contato removido com sucesso.");
            } else {
                System.out.println("Erro: Não foi possível remover o contato.");
            }

            // Imprimir contatos depois da remoção
            System.out.println("Lista de contatos:");
            agenda.imprimirContatos();
    }
}
