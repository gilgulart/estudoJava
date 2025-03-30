import java.util.Scanner;

public class BetweenHundred {
    public static void main(String[] args){
        int anyNumber;
        Scanner enter;
        enter =  new Scanner(System.in);
        System.out.print("Digite seu número: ");
        anyNumber = enter.nextInt();
        if (anyNumber >= 100 && anyNumber <= 200){
            System.out.print("Verificamos que " + anyNumber + " está entre 100 e 200");
        } else {
            System.out.print("Verificamos que " + anyNumber + " não está entre 100 e 200");
        }
        enter.close();
    }
}
