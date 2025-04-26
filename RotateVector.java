import java.util.Scanner;

public class RotateVector {
    public static void main(String[] args) {
        int[] numbersToRotate = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de rotações que deseja: ");
        int userRotate = scanner.nextInt();
        int n = userRotate % numbersToRotate.length;
        for (int j = 0; j < n; j++) {
        int lastElementValue= numbersToRotate[numbersToRotate.length - 1];
        for (int i = numbersToRotate.length - 1; i > 0 ; i--) {
        numbersToRotate[i] = numbersToRotate[i-1];
        }
        numbersToRotate[0] = lastElementValue;
        }
        for (int number : numbersToRotate){
            System.out.println(number + "");
        }
        System.out.println();
        scanner.close();
    }
}
