import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClienteGerenciador implements Interface {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void ClienteGerenciador() {
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        this.clientes.add(cliente);
        System.out.println("Cliente" + cliente.getNome() + "adicionado com sucesso");
    }

    public void editarCliente() {
        if (!this.clientes.isEmpty()) {
            Cliente cliente = (Cliente) this.clientes.get(0);
            System.out.println("digite o nome do cliente");
            cliente.setNome("Igor Carmo");
            System.out.println("Cliente atualizado: " + String.valueOf(cliente));
        }
    }

    public void visualizarCliente() {
        Iterator var1 = this.clientes.iterator();

        while (var1.hasNext()) {
            Cliente cliente = (Cliente) var1.next();
            System.out.println(cliente);
        }
    }
}