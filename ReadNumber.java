import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args){
        int numberOne, numberTwo;
        Scanner enter;
        enter = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        numberOne = enter.nextInt();
        System.out.print("Digite o segundo número: ");
        numberTwo = enter.nextInt();
        if (numberOne > numberTwo){
            System.out.print("O número " + numberOne + " é maior que o número " + numberTwo);
        } else {
            System.out.print("O número " + numberTwo + " é maior que o número " + numberOne );
        }
        enter.close();
    }
}
