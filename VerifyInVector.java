import java.util.Scanner;

public class VerifyInVector {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 20, 23, 25, 27, 29, 31, 33, 35, 40, 45, 50, 55, 60, 65};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar a existência no vetor: ");
        int verifynumber = scanner.nextInt();
        boolean found = true;
        for (int i = 0; i < numbers.length; i++) {
            if (verifynumber == numbers[i]) {
                System.out.println("Seu número existe no vetor");
                found = true;
                break;
            } else if (verifynumber != numbers[i]){
                System.out.println("Seu número não existe no vetor");
                found = false;
                break;
            }
        }
    }
}

