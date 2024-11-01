public class Funcionario extends Pessoa {
    private String cargo;
    private Double salario;
    private String turno;

    public Funcionario(String s, String nome, Double salario, String cpf, String turno){
        super(nome, cpf);
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
