import java.lang.Comparable;

public class Participante implements Comparable<Participante> {
    public String nome;
    private Integer vitorias, empates, derrotas, golsFavor, golsContra;

    public Participante(String nome) {
        this.nome = nome;
        vitorias = 0;
        empates = 0;
        derrotas = 0;
        golsFavor = 0;
        golsContra = 0;
    }

    public void addVitorias(Integer vitorias) {
        this.vitorias += vitorias;
    }

    public void addEmpates(Integer empates) {
        this.empates += empates;
    }

    public void addDerrotas(Integer derrotas) {
        this.derrotas += derrotas;
    }

    public void addGolsAFavor(Integer golsFavor) {
        this.golsFavor += golsFavor;
    }

    public void addGolsContra(Integer golsContra) {
        this.golsContra += golsContra;
    }

    public Integer getVitorias(){
        return this.vitorias;
    }

    public String getResumo() {
        return "Nome: " + nome + "\n" +
                "Vitórias: " + vitorias + "\n" +
                "Empates: " + empates + "\n" +
                "Derrotas: " + derrotas + "\n" +
                "Gols a favor: " + golsFavor + "\n" +
                "Gols contra: " + golsContra + "\n";
    }

    @Override
    public int compareTo(Participante outro) {
        /*
         * 1º critério: número de vitórias
         * Em caso de empate, 2º critério: menos derrotas
         * Em caso de empate, 3º critério: mais gols a favor
         * Em caso de empate, 4º critério: menos gols contra
         * Se todos os números estiverem iguais, fica empatado.
         */
        // Comparação pelo número de vitórias
        int resultado = this.vitorias.compareTo(outro.getVitorias());
        if (resultado != 0) {
            return resultado;
        }

        // Em caso de empate em vitórias, menos derrotas
        resultado = this.derrotas.compareTo(outro.derrotas);
        if (resultado != 0) {
            return resultado;
        }

        // Em caso de empate em derrotas, mais gols a favor
        resultado = this.golsFavor.compareTo(outro.golsFavor);
        if (resultado != 0) {
            return resultado;
        }

        // Em caso de empate em gols a favor, menos gols contra
        resultado = this.golsContra.compareTo(outro.golsContra);
        if (resultado != 0) {
            return resultado;
        }

        // Se todos os números estiverem iguais, fica empatado
        return 0;
    }
}


// int resultado = this.vitorias.compareTo(outro.vitorias);
// if (resultado == 0) {
// // Em caso de empate em vitórias, considerar saldo de gols
// int saldoGols = this.golsFavor - this.golsContra;
// int outroSaldoGols = outro.golsFavor - outro.golsContra;
// resultado = Integer.compare(saldoGols, outroSaldoGols);
// }