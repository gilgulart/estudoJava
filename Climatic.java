import java.util.Scanner;

public class Climatic {
public static void main (String[] args){

    int celcius;
Scanner entrada;
entrada = new Scanner(System.in);
System.out.print("Digite a temperatura atual aqui: ");
celcius = entrada.nextInt();
if (celcius <= 15){
System.out.println("Está frio demais! Se sair de casa vai virar picolé");
    } else if (celcius > 25) {
    System.out.println("Eita calor da desgraça! Prepara o ar condicionado e fica de boa");
} else{
    System.out.println("Tá daora, pode sair de casa :)");
}
}


}
