import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int userNumber, odd;
        Scanner enter;
        enter = new Scanner(System.in);
        System.out.print("Digite o seu número: ");
        userNumber = enter.nextInt();
        odd = userNumber %  2;
        if (odd == 1){
            System.out.print("Seu número é impar");
        } else {
            System.out.print("Seu número é par");
        }

    }
}
