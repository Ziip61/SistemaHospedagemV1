import java.util.Scanner;

public class MenuCliente {
    Hotel hotel = new Hotel();
    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

    String menu ="""
    Menu:
    
    1.Cadastrar-se
    2.Visualizar quartos
    3.Reservar quarto
    4.Fazer checkout
    
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
                System.out.println("Digite a idade do usuário: ");
                int idade = scanner.nextInt();
                System.out.println("Digite o cpf do usuário: ");
                String cpf = scanner.nextLine();
                System.out.println("Digite o endereço do usuário: ");
                String endereco = scanner.nextLine();
                System.out.println("Digite o telefone para contato: ");
                int telefone = scanner.nextInt();
            hotel.cadastrarCliente(new Cliente(nome,cpf,idade,endereco,telefone));
            break;
            case 2:
                System.out.println("Lista de quartos:");
            hotel.visualizarQuartos();
            break;
            case 3:
                System.out.println("digite o código de quarto");
                int codigo = scanner.nextInt();
            hotel.reservarQuarto(codigo);
            break;
            case 4:
                System.out.println("Digite o código do quarto");
                int codigoChko = scanner.nextInt();
            hotel.fazerCheckout(codigoChko);
            break;
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
