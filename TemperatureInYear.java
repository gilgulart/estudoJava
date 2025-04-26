import java.util.Scanner;

public class TemperatureInYear {
    public static void main(String[] args) {
        int[] temperature = new int[12];
        double average;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12 ; i++) {
            System.out.println("Digite a temperatura: ");
            temperature[i] = scanner.nextInt();
            sum = sum + temperature[i];
        }
        scanner.close();
        average = sum / 12.0;
        System.out.println("Média das temperaturas: " + average);
    }
}
