public class VacaMae implements Animal {

    protected int id;
    protected String nome;
    protected String raca;
    protected int idade;
    protected String status;

    public VacaMae(int id, String nome, String raca, int idade, String status) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.status = status;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Muuuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println("Leite coletado de " + nome + "!");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("[ID: " + id + "]" + nome + " (vaca)");
        System.out.println(" - Raça: " + raca);
        System.out.println(" - Idade" + idade + " anos");
        System.out.println(" - Status: " + status);
        emitirSom();
        System.out.println();
    }
}