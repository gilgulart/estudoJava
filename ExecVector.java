import java.util.Scanner;

public class ExecVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[5];
        int x,y;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite um valor para a posição " + i);
            vector[i] = scanner.nextInt();
        }
        System.out.println("Digite um índice X (entre 0 e 4)");
        x = scanner.nextInt();
        System.out.println("Digite um índice Y (entre 0 e 4)");
        y = scanner.nextInt();
        System.out.println("Vetor[0]:" + vector[0]);
        System.out.println("Vetor[1]:" + vector[1]);
        System.out.println("Vetor[2]:" + vector[2]);
        System.out.println("Vetor[3]:" + vector[3]);
        System.out.println("Vetor[4]:" + vector[4]);
        System.out.println("A soma dos valores dentro dos índices X e Y é = " + (vector[x]+vector[y]));
    }
}
