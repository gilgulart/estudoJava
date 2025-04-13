import java.util.Scanner;
public class HowManyPairs {
    public static int pairCalculator(int mainNumber){
        return mainNumber % 2;
    }
    public static void main(String[] args){
        int[] mainNumber = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
        System.out.println("Digite o seu número: ");
        mainNumber[i] = scanner.nextInt();
        }
    int pairsAmount = 0;
        for (int i = 0; i < 10; i++){
            if (pairCalculator(mainNumber[i]) == 0){
                pairsAmount++;
                System.out.println(mainNumber[i]);
            }
        }
        System.out.println("Quantidade de pares digitados: " + pairsAmount);
    scanner.close();
    }
}
