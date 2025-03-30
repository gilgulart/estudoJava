import java.util.Scanner;

public class HeightCheck {
    public static void main(String[] args) {
        float userHeight;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        userHeight = scanner.nextFloat();
        if (userHeight <= 1.50) {
            System.out.print("Baixinho kkkkkk");
        } else if (userHeight >= 1.51 && userHeight <= 1.80) {
            System.out.print("Ainda dá tempo de crescer, médio");
        } else if (userHeight >= 1.81) {
            System.out.print("seloko girafo kkkkkk");
        }

    }
}
