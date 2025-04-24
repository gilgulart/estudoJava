import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Digite um número e descubra a sua tabuada: ");
        number = scanner.nextInt();
        for (int i = 1; i < 10; ++i) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        scanner.close();
    }
}
