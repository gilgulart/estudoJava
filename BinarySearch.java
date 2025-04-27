import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int naturalNumbers : numbers) {
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pesquise um número: ");
        int userNumber = scanner.nextInt();
        int right, left;
        left = 0;
        right = numbers.length - 1;
        boolean found = false;
        int position = -1;
        while (right <= left){
        int half = (right + left)/2;
        if (userNumber == numbers[half]){
        found = true;
        position = half;
        break;
        } else if (userNumber < numbers[half]) {
            left = half - 1;
        } else if (userNumber > numbers[half]) {
            right = half + 1;
        }
        }
        if (found){
            System.out.println("O seu número " + userNumber + " existe no Array na posição " + position );
        } else {
            System.out.println("O seu número " + userNumber + " não foi encontrado");
        }
    }
}
