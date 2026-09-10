public class Bezerro extends VacaMae {

    public Bezerro(int id, String nome, String raca, int idade, String status) {
        super(id, nome, raca, idade, status);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Muuuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " ainda não produz leite.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("[ID: " + id + "] " + nome + " (Bezerro)");
        System.out.println(" - Raça: " + raca);
        System.out.println(" - Idade: " + idade + " anos");
        System.out.println(" - Status: " + status);
        emitirSom();
        System.out.println();
    }
}
