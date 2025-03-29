import java.util.Scanner;

public class Temperatureconvert {
public static void main(String[] args){

    float celsius, convertToFahrenheit, convertToKelvin;
Scanner enter;
enter = new Scanner(System.in);
System.out.print("Digite o valor em celcius: ");
celsius = enter.nextFloat();
convertToFahrenheit = (celsius * 9/5) + 32;
convertToKelvin = celsius + 273 ;
System.out.println("O valor em Fahrenheit é: " + convertToFahrenheit + " F");
System.out.println("O valor em Kelvin é: " + convertToKelvin + " K");
}

}
