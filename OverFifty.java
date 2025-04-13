import java.util.Scanner;

public class OverFifty {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] tenNumbers = new int[10];

    for (int i = 0; i < 10; i++){
        System.out.println("Digite o seu número: ");
        tenNumbers[i] = scanner.nextInt();
    }

    System.out.println("Os números acima de 50 são: ");
    for (int i = 0; i < 10; i++){
        if (tenNumbers[i] > 50){
            System.out.println(tenNumbers[i]);
        }
    }
    scanner.close();
}
}
