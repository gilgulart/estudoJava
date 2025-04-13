import java.util.Scanner;
public class BodyMassIndex {
    public static double bodyMassCalculator(double mass, double height){
        return mass / (height * height);
    }
    public static String classifyMCI(double mci){
        if (mci < 18.5){
            return "Magreza. Procure um nutricionista";
        } else if (mci <= 24.9) {
            return "IMC saudável. Parabéns!";
        } else if (mci <= 29.9) {
            return "Sobrepeso. Obesidade grau 1";
        } else if (mci <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grave. Procure orientação médica urgente!";
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n=== MENU IMC ===");
            System.out.println("1 - Calcular IMC");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção");
            option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Digite seu peso (kg): ");
                double mass = scanner.nextDouble();
                System.out.println("Digite sua altura (m): ");
                double height = scanner.nextDouble();
                double mci = bodyMassCalculator(mass, height);
                String classify = classifyMCI(mci);
                System.out.printf("Seu IMC é: %.2f%n", mci);
                System.out.println("Classificação: " + classify);
                break;

            case 0:
                System.out.println("Encerrando o programa. Até mais!");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente");
        }
        } while (option != 0);

        scanner.close();

    }
}
