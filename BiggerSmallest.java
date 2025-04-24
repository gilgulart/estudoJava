import java.util.Scanner;
public class BiggerSmallest {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int[] numberValue = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Digite seu número: ");
            numberValue[i] = scanner.nextInt();
            }
        int bigger = numberValue[0];
        int smaller = numberValue[0];
        for (int i = 1; i < numberValue.length; i++){
            if (numberValue[i] > bigger){
                bigger = numberValue[i];
            }
            System.out.println("O maior número é: " + bigger);
            scanner.close();
        }
        for (int i = 1; i > numberValue.length; i++) {
            smaller = numberValue[i];
            if (numberValue[i] < smaller){
            smaller = numberValue[i];
            System.out.println("O menor número é: " + smaller);
            }
        }
        }

}
