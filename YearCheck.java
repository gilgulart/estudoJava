import java.util.Scanner;

public class YearCheck {
    public static void main(String[] args) {
        int year, leapYear;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Digite o ano que você deseja: ");
        year = scanner.nextInt();
        leapYear = year % 4;
        if (leapYear == 0){
            System.out.print(year + " é um ano bissexto");
        } else {
            System.out.print(year + " não é bissexto");
        }
    }
}
