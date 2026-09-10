import java.util.ArrayList;
import java.util.Scanner;

public class stardewManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();

        // Animais do curral
        VacaMae mimosa = new VacaMae(
                101,
                "Mimosa",
                "Holandesa",
                7,
                "Sem filhotes"
        );

        GalinhaMae giselda = new GalinhaMae(
                102,
                "Giselda",
                "Caipira",
                1,
                "Botando ovos"
        );

        OvelhaMae chiquinha = new OvelhaMae(
                103,
                "Chiquinha",
                "Merino",
                3,
                "Pronta para tosquia"
        );

        Bezerro toto = new Bezerro(
                104,
                "Totó",
                "Holandês",
                1,
                "Filhote"
        );

        Pintinho piu = new Pintinho(
                105,
                "Piu",
                "Caipira",
                0,
                "Filhote"
        );

        Cordeiro lili = new Cordeiro(
                106,
                "Lili",
                "Merino",
                0,
                "Filhote"
        );

        // Todos são armazenados como Animal
        animais.add(mimosa);
        animais.add(giselda);
        animais.add(chiquinha);
        animais.add(toto);
        animais.add(piu);
        animais.add(lili);

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio (Coletar produtos)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\n----------------------------------------------");
                    System.out.println("   ANIMAIS NO CURRAL:");
                    System.out.println("----------------------------------------------");

                    for (Animal animal : animais) {
                        animal.mostrarInformacoes();
                    }

                    break;

                case 2:

                    System.out.println("\n----------------------------------------------");
                    System.out.println("   COLETANDO PRODUTOS:");
                    System.out.println("----------------------------------------------");

                    for (Animal animal : animais) {
                        animal.coletarProduto();
                    }

                    break;

                case 3:

                    System.out.println("\nSaindo do Stardew Manager...");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }
        }

        scanner.close();
    }
}