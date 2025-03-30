import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        int allNumber, fiveMultiples;
        Scanner enter;
        enter = new Scanner(System.in);
        System.out.print("Digite seu número: ");
        allNumber = enter.nextInt();
        fiveMultiples = allNumber % 5;
        if (fiveMultiples == 0) {
            System.out.print("Seu número " + allNumber + " é um multiplo de 5");
        } else {
            System.out.print("Seu número " + allNumber + " não é um multiplo de 5");
        }
        enter.close();
    }
}