public class Telefone {
    private String numero;
    private String identificador;

    public Telefone(String numero, String identificador){
        this.numero = numero;
        this.identificador = identificador;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getIdentificador(){
        return this.identificador;
    }

}
