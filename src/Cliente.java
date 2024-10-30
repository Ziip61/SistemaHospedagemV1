public class Cliente extends Pessoa {
    private String data;
    private String endereco;
    private int numero;
    public Cliente(String nome, String cpf, int idade, String endereco, int telefone){
        super(nome,cpf);
    }

    public String getData() {
        return data;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData(String data) {
        this.data = data;
    }
}
