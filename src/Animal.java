public interface Animal {

    String nome = "";
    String produto = "";
    String raca = "";
    String som = "";
    int idade = 0;
    boolean temFilhos = false;
    void emitirSom();
    void coletarProduto();

    public Animal(String nome, String produto,String raca, String som, int idade, boolean temFilhos) {
        this.nome = nome;
        this.produto = produto;
        this.idade = idade;
        this.raca = raca;
        this.som = som;
    }
}
