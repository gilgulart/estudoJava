import java.util.Scanner;

public class SchoolAverage {
    public static void main(String[] args){
        float nota1, nota2, nota3, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        nota3 = scanner.nextFloat();
        average = (nota1 + nota2 + nota3) / 3;
        if (average >= 7){
            System.out.print("Parabéns, você está aprovado com a nota " + average);
        } else if (average >= 5 && average < 6.9) {
            System.out.print("Cuidado, você está de recuperação com a nota " + average);
        } else if (average <= 4.9) {
            System.out.print("Reprovado com a nota " + average);
        }
    }
}
