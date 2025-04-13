import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int anyNumber = scanner.nextInt();
        boolean isPrime = true;
        if (anyNumber <=1){
            isPrime = false;
        } else {
            for (int i = 2; i * i <= anyNumber; i++){
                if (anyNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(anyNumber + " é um número primo");
        } else {
            System.out.println(anyNumber + " não é um número primo");
        }
        scanner.close();
    }
}