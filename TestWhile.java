import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Digite números positivos (digite 0 para encerrar): ");
        do {
            number = scanner.nextInt();
            if (number > 0){
                sum += number;
            }

        } while (number != 0);
        System.out.println("A soma dos números digitados é: " + sum);

    }
}
