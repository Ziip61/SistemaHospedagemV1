import java.util.Scanner;

public class Hotel {
    private QuartosGerenciador gerenciador = new QuartosGerenciador();
    private FuncionarioGerenciador funcionarioGerenciador = new FuncionarioGerenciador();
    private ClienteGerenciador clienteGerenciador = new ClienteGerenciador();
    Scanner scanner = new Scanner(System.in);

    public Hotel(){
    }
    public void cadastrarQuarto(){
    this.gerenciador.cadastrarQuarto();
    }
    public void visualizarQuartos(){
    this.gerenciador.visualizarQuartos();
    }
    public void cadastrarCliente(Cliente cliente){
        this.clienteGerenciador.cadastrarCliente(cliente);
    }
    public void visualizarCliente(){
    this.clienteGerenciador.visualizarCliente();
    }

    public void cadastrarFuncionario(){
        this.funcionarioGerenciador.cadastrarFuncionario();
    }
    public void visualizarFuncionario(){
    this.funcionarioGerenciador.visualizarFuncionarios();
    }

public void reservarQuarto(int codigo){
    try{
        this.gerenciador.reservarQuarto(scanner.nextInt());
    } catch (QuartoJaReservado e) {
        throw new RuntimeException(e.getMessage());
    }
}
public void fazerCheckout(int codigoChko){
        this.gerenciador.fazerCheckout(codigoChko);
}


}
