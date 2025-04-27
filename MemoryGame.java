import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class MemoryGame {
    public static void shuffle(int[] cards){

    Random random = new Random();
        int n = cards.length;
        for (int i = n - 1; i > 0 ; i--) {
            int j = random.nextInt(i + 1);
            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;

        }
    }
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 1, 2, 3, 4, 5, 6, 4, 5, 6};
        shuffle(cards);
        Scanner scanner = new Scanner(System.in);
        boolean[] revealed = new boolean[cards.length];
        int pairsFound = 0;
        int totalPairs = cards.length / 2;
        while (pairsFound < totalPairs){
            System.out.println("\n--- Novo turno ---");
            for (int i = 0; i < cards.length ; i++) {
                if (revealed[i]){
                    System.out.println(cards[i] + "\t");
                } else {
                    System.out.println("*\t");
                }
                if ((i + 1) % 4 == 0) System.out.println();
            }
            System.out.println("Digite o índice da primeira carta (0- " + (cards.length - 1) + "): ");
            int firstChoiceIndex = scanner.nextInt();
            System.out.println("Digite o índice da segunda carta (0- " + (cards.length - 1) + "): ");
            int secondChoiceIndex = scanner.nextInt();

            if (firstChoiceIndex < 0 || firstChoiceIndex >= cards.length || revealed[firstChoiceIndex] || secondChoiceIndex < 0 || secondChoiceIndex >= cards.length || revealed[secondChoiceIndex] || secondChoiceIndex == firstChoiceIndex){
            System.out.println("Escolha inválida. Tente novamente");
            continue;
            }
            System.out.println("Você escolheu: ");
            System.out.println("Carta 1 na posição " + firstChoiceIndex + ": " + cards[firstChoiceIndex]);
            System.out.println("Carta 2 na posição " + secondChoiceIndex + ": " + cards[secondChoiceIndex]);
            if (cards[firstChoiceIndex] == cards[secondChoiceIndex]){
                System.out.println("Parabéns você encontrou um par!");
                revealed[firstChoiceIndex] = true;
                revealed[secondChoiceIndex] = true;
                pairsFound++;
            } else {
                System.out.println("Não é um par");
            }
        }
        System.out.println("Parabéns, você encontrou todos os pares!");
        scanner.close();
    }
}
