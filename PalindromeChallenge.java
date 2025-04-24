import java.util.Scanner;

public class PalindromeChallenge {
    public static void main(String[] args){
        String typing, originalText, compareText;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frase, palavra ou número: ");
        typing = scanner.nextLine();
        scanner.close();
        originalText = typing.replaceAll("\\s+","").toLowerCase().replaceAll("[\\p{Punct}]","");
        compareText = new StringBuilder(originalText).reverse().toString();
        if (compareText.equals(originalText)){
            System.out.println( typing + " é um palindromo.");
        } else {
            System.out.println("inválido");
        }

    }

}
