import java.util.Scanner;

public class Positive {
public static void main(String[] args){
    int anyNumber;
    Scanner enter;
    enter = new Scanner(System.in);
    System.out.print("Digite qualquer número aqui: ");
    anyNumber = enter.nextInt();
    if (anyNumber > 0){
        System.out.print("Seu número é positivo");
    } else{
        System.out.print("Seu número é negativo");
    }
}

}

