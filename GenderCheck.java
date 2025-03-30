import java.util.Scanner;

public class GenderCheck {
    public static void main(String[] args) {

        char maleOrFemale;
        Scanner enter;
        enter = new Scanner(System.in);
        System.out.print("Qual o seu gênero (M) ou (F)? ");
        maleOrFemale = enter.next().toUpperCase().charAt(0);
        if (maleOrFemale == 'M') {
            System.out.print("Você é do gênero masculino");
        } else if (maleOrFemale == 'F') {
            System.out.print("Você é do gênero feminino");
        } else {
            System.out.print("Opção inválida, digite apenas M ou F.");
        }
        enter.close();
    }
}
