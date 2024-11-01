import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QuartosGerenciador implements Interface {
    Scanner scanner = new Scanner(System.in);
    private List<Quartos> quartos = new ArrayList<>();

    public QuartosGerenciador(){
    }
    public void cadastrarQuarto(Quartos quarto){
        quartos.add(quarto);
        this.quartos.add(quarto);
        System.out.println("Quarto de código:" + quarto.getCodigo() + "registrado com sucesso!");
    }

    public void editarQuarto(int codigo){
        if(this.quartos.isEmpty()){
            System.out.println("Código do quarto inválido ou não existe, tente novamente.");
        }
        if(!this.quartos.isEmpty()){
        Quartos quarto = (Quartos)this.quartos.get(0);
        quarto.setDisponivel(false);
        System.out.println("Quarto atualizado com sucesso: Tipo - " + quarto.getTipo() + " Código - " + quarto.getCodigo());
        }
    }

    public void excluirQuarto(int codigo){
    if(!this.quartos.isEmpty()){
        Quartos quarto = (Quartos)this.quartos.get(0);
        this.quartos.remove(quarto);
        System.out.println("Quarto com o código:" + quarto.getCodigo() + "removido com sucesso");
        }
    }

    public void visualizarQuartos(){
        if (quartos.isEmpty()){
        System.out.println("não há quartos a serem visualizados");
        }
            Iterator var1 = this.quartos.iterator();

            while(var1.hasNext()) {
                Quartos quarto = (Quartos)var1.next();
            String status = quarto.isDisponivel() ? "Disponível" : "indisponível";
            System.out.print("Tipo:" +  quarto.getTipo() + "Capacidade: " + quarto.getCapacidade() + "código" + quarto.getCodigo() );
            }
        }

    public void reservarQuarto(int codigo) throws QuartoJaReservado {
        if (quartos.isEmpty()){
            System.out.println("não há quartos a serem visualizados");
        }
        if (!this.quartos.isEmpty()) {
            Quartos quarto = (Quartos) this.quartos.get(0);
            if (!quarto.isDisponivel()) {
                throw new QuartoJaReservado("O quarto:" + quarto.getCodigo() + "Já está reservado");
            }

        }
    }

    public void fazerCheckout(int codigo){
        if (quartos.isEmpty()){
            System.out.println("não há quartos a serem visualizados");
        }
        if (!this.quartos.isEmpty()){
            Quartos quarto = (Quartos) this.quartos.get(0);
            if(!quarto.isDisponivel()) {
            quarto.setDisponivel(true);
            System.out.println("O quarto" + quarto.getCodigo() + "foi devolvido com sucesso!");
            }

            else{
            System.out.print("O quarto" + quarto.getCodigo() + "não foi reservado");
            }
        }
    }

}

