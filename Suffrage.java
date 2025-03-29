import java.util.Scanner;

public class Suffrage {
public static void main (String[] args){
    int age;
    Scanner enter;
    enter = new Scanner(System.in);
    System.out.print("Digite a sua idade: ");
    age = enter.nextInt();
    if (age < 16){
        System.out.print("Você está inapto para votar no Brasil");
    } else {
        System.out.print("Você está apto para votar no Brasil");
    }
}
}
