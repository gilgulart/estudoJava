import java.util.*;
class Retangulo{
    public static void main(String[] args){
        float altura, largura, area, perimetro;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.print("Digite o valor da altura do retângulo: ");
        altura = entrada.nextFloat();
        System.out.print("Digite o valor da largura do retângulo: ");
        largura = entrada.nextFloat();
        area = calculaArea(altura, largura);
        perimetro = calculaPerimetro(altura, largura);
        mostraMensagem("O valor da área é ", area);
        mostraMensagem("O valor do perímetro é ", perimetro);
    }
    public static float calculaArea(float a, float b){
        return a * b;
    }
    public static float calculaPerimetro(float a, float b){
        return 2 * a + 2 * b;
    }
    public static void mostraMensagem(String msg, float vlr) {
        System.out.println(msg + vlr);
    }

}