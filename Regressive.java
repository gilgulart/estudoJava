import java.util.Scanner;

public class Regressive {
    public static void main(String[] args){
        int number;
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Digite um número: ");
            number = scanner.nextInt();
            if (number > 0) {
            while (number >= 0){
                System.out.println(number);
                number--;
            }
                System.out.println("fim!");
            }
            scanner.close();
            }
        }


