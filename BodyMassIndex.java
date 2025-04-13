import java.util.Scanner;
public class BodyMassIndex {
    public static double bodyMassCalculator(double mass, double height){
        return mass / (height * height);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double mass, height;
        System.out.println("Digite aqui o seu peso em kilos: ");
        mass = scanner.nextDouble();
        System.out.println("Digite aqui a sua altura: ");
        height = scanner.nextDouble();
        double massIndex =  bodyMassCalculator(mass, height);
        if (massIndex >= 18.5 && massIndex <= 24.9){
            System.out.println("Seu IMC é "+ massIndex +" você está com um bom IMC");
        } else if (massIndex < 18.5) {
            System.out.println("Você apresenta magreza, procure um nutricionista");
        } else if (massIndex >= 25 && massIndex <= 29.9) {
            System.out.println("Você apresenta sobrepeso, Obesidade nível 1");
        } else if (massIndex >= 30 && massIndex <= 39.9) {
            System.out.println("você apresenta um quadro de obesidade nível 2");
        } else {
            System.out.println("Você apresenta um quadro de obesidade grave, procure um médico");
        }
        scanner.close();

    }
}
