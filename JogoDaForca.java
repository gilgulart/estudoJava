import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JogoDaForca {

            public static void main (String[]args){
                String[] palavraDesafio = {"Macaco", "Baleia", "Gorila", "Vaca", "Hipopotamo"};
                Random random = new Random();
                int indiceAleatorio = random.nextInt(palavraDesafio.length);
                String palavraEscolhida = palavraDesafio[indiceAleatorio].toLowerCase();
                Scanner scanner = new Scanner(System.in);
            int maxTentativas = 6;
            int tentativasRestantes = maxTentativas;
                Set<Character> letrasTentadas = new HashSet<>();
                char[] palavraEscondida = new char[palavraEscolhida.length()];
                for (int i = 0; i < palavraEscondida.length; i++ ){
                    palavraEscondida[i] = '_'; // underscore
                }
                while (tentativasRestantes > 0){
                System.out.println("\nPalavra: " + String.valueOf(palavraEscondida));
                System.out.println("Tentativas restantes: " + tentativasRestantes);
                System.out.println("Digite uma letra: ");
                String userLetterInput = scanner.nextLine().toLowerCase();
            if (userLetterInput.length() != 1) {
                System.out.println("Digite apenas uma letra");
                continue;
            }
                char letraDigitada = userLetterInput.charAt(0);
            if (letrasTentadas.contains(letraDigitada)){
                System.out.println("Você já tentou essa letra, tente outra");
                continue;
                }
            letrasTentadas.add(letraDigitada);
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraEscolhida.length(); i++){
                if (palavraEscolhida.charAt(i) == letraDigitada){
                    palavraEscondida[i] = letraDigitada;
                    letraEncontrada = true;
                }
            }
            if (letraEncontrada){
                System.out.println("Você acertou a letra!");
            } else {
                tentativasRestantes--;
                System.out.println("Letra incorreta");
            }
                if (String.valueOf(palavraEscondida).equals(palavraEscolhida)) {
                    System.out.println("\nParabéns! você adivinhou a palavra: " + palavraEscolhida);
                    break;
                }
            }
                if (tentativasRestantes == 0){
                    System.out.println("\nVoCê perdeu! A palavra era " + palavraEscolhida);
                }
                System.out.println("\nDeseja jogar novamente? (s/n)");
                String resposta = scanner.nextLine().toLowerCase();
                if (!resposta.equals("s")){
                boolean jogarNovamente = false;
                }
                scanner.close();
            }
        }
