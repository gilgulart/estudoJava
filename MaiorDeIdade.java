import java.util.Scanner;
import java.time.Year;
public class MaiorDeIdade {
    public static int idade(int anoNascimento){
        int anoAtual = Year.now().getValue();
        return anoAtual - anoNascimento;
    }
    public static void main(String[] args){
    int anoNascimento;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o ano do seu nascimento: ");
    anoNascimento = scanner.nextInt();
    int deMaior = idade(anoNascimento);
    if (deMaior >= 18){
        System.out.println("você tem " + deMaior + " anos de idade, pode acessar o programa");
    } else {
        System.out.println("você é menor de idade");
    }
    scanner.close();
    }
}
