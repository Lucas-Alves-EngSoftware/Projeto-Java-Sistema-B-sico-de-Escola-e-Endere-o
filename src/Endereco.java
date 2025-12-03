public class Endereco {
    private String nome_rua;
    private int numero;

    public Endereco(String nome_rua, int numero) {
        this.nome_rua = nome_rua;
        this.numero = numero;
    }

    public String getNomeRua() { return nome_rua; }
    public int getNumero() { return numero; }
}
