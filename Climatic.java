import java.util.Scanner;

public class Climatic {
public static void main (String[] args){

    int celsius;
Scanner enter;
enter = new Scanner(System.in);
System.out.print("Digite a temperatura atual aqui: ");
celsius = enter.nextInt();
if (celsius <= 15){
System.out.println("Frio do caraio!");
    } else if (celsius > 25) {
    System.out.println("Eita calor da desgraça! Prepara o ar condicionado e fica de boa");
} else{
    System.out.println("Tá daora, pode sair de casa :)");
}
}


}
