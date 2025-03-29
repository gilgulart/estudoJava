import java.util.Scanner;

public class AgeRange {
    public static void main(String[] args){
        int howOld;
        Scanner enter;
        enter = new Scanner(System.in);
        System.out.print("Quantos anos você tem: ");
        howOld = enter.nextInt();
        if (howOld <= 12){
            System.out.print("Você é uma criança");
        } else if (howOld >= 13 && howOld <= 17) {
            System.out.print("Você é um adolescente");
        } else if (howOld >= 18 && howOld <= 59) {
            System.out.print("Você é um adulto");
        } else {
            System.out.print("Você é idoso");
        }
        enter.close();
    }
}
