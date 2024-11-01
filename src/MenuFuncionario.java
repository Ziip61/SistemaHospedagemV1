import java.util.Scanner;

public class MenuFuncionario {
    Hotel hotel = new Hotel();
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        String menu = """
                Menu:
                
                1.Cadastrar novo funcionário
                2.Visualizar quartos
                3.Excluir quarto
                4.Editar funcionário
                5.Excluir funcionário
                
                0.Sair do sistema
                
                Escolha uma opção:
                """;

        do{
            System.out.print(menu);
            opcao = scanner.nextInt();
            switch (opcao){

                case 1:
                    System.out.println("Digite o nome a ser cadastrado: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o salário do funcionário: ");
                    double salario = scanner.nextDouble();
                    System.out.println("Digite o cpf do funcionário: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o endereço do funcionário: ");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o turno do funcionário: ");
                    String turno = scanner.nextLine();
                    hotel.cadastrarFuncionario(new Funcionario(nome,cpf,salario,endereco,turno));
                    break;
                case 2:
                    System.out.println("Lista de quartos:");
                    hotel.visualizarQuartos();
                    break;
                case 3:
                    System.out.println("digite o código de quarto");
                    int codigo = scanner.nextInt();
                    hotel.excluirQuarto(codigo);
                    break;
                case 4:
                    System.out.println("Digite o nome do funcionário para ser editado");
                    String nomeEditar = scanner.nextLine();
                    hotel.editarFuncionario(nomeEditar);
                    break;
                case 5:
                    System.out.println("digite o nome completo do funcionário");
                    String nomeFuncionario = scanner.nextLine();
                    hotel.excluirFuncionario(nomeFuncionario);
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("opção inválida, tente novamente");
            }

        }while (opcao != 0);

        scanner.close();
    }
}
