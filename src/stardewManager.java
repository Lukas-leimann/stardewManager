public class stardewManager {
    public static void main(String[] args) {

        abstract class VacaMae implements Animal{
            @Override
            public void emitirSom() {
                System.out.println("muuuu");
            }

            @Override
            public void coletarProduto() {
                System.out.println("Você coletou um balde de leite");
            }
        }
    }
