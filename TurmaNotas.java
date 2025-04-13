import java.util.Scanner;
public class TurmaNotas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] Vturma = new float[20];
        float soma = 0, media;
        int notaAcima = 0;
        for (int x = 1; x < 20; x++) {
            System.out.print("Digite a nota do aluno " + (x + 1) + ": ");
            Vturma[x] = scanner.nextFloat();
        }
        for (int x = 0; x < 20; x++) {
            soma += Vturma[x];
        }
        media = soma / 20;
        for (int x = 0; x < 20; x++) {
            if (Vturma[x] > media) {
                notaAcima++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + notaAcima);
        scanner.close();
    }
}

