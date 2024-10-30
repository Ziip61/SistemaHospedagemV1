public class Quartos {

    private String tipo;
    private int codigo;
    private int capacidade;
    private Double preco;
    private boolean disponivel;
    private int data;

public Quartos(String tipo, int capacidade,  int codigo, Double preco, int data) {
this.tipo = tipo;
this.capacidade = capacidade;
this.codigo = codigo;
this.disponivel = true;
this.preco = preco;
this.data = data;
}

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel){
    this.disponivel = disponivel;
    }
}
