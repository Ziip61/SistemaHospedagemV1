import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FuncionarioGerenciador implements Interface {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public FuncionarioGerenciador(){
    }

    public void cadastrarFuncionario(Funcionario funcionario){
    funcionarios.add(funcionario);
    this.funcionarios.add(funcionario);
    System.out.println("Funcionário"  + funcionario.getNome() + "adicionado com sucesso");
    }

    public void editarFuncionario(Funcionario nomeEditar){
        if(!this.funcionarios.isEmpty()){
        Funcionario funcionario = (Funcionario) this.funcionarios.get(0);
        System.out.println("digite o nome do funcionário");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Funcionário atualizado: " + String.valueOf(funcionario));
        }
    }

    public void excluirFuncionario(Funcionario nome){
        if(!this.funcionarios.isEmpty()){

            Funcionario funcionario = (Funcionario) this.funcionarios.get(0);
            this.funcionarios.remove(funcionario);
        }
    }

    public void visualizarFuncionarios(){
        Iterator var1 = this.funcionarios.iterator();

        while(var1.hasNext()){
        Funcionario funcionario = (Funcionario) var1.next();
        System.out.println(funcionario);
        }
    }

    public void reservarQuarto(){
        System.out.print("Função não aplicável a funcionários");
    }
    public void fazerCheckout(){
        System.out.print("Função não aplicável a funcionários");
    }
}
