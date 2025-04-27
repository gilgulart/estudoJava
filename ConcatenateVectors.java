import java.util.Arrays;
public class ConcatenateVectors {
    public static void main(String[] args) {
          String[] vectorOne = {"mochila", "caderno","estojo","lápis","caneta"};
          String[] vectorTwo = {"prova", "trabalho", "atividade de casa","exercício","redação"};
          String[] concatenate = new String[10];
          int currentIndex = 0;
        for (int i = 0; i < vectorOne.length; i++) {
            concatenate[currentIndex] = vectorOne[i];
            currentIndex++;
        }
        for (int j = 0; j < vectorTwo.length ; j++) {
            concatenate[currentIndex] = vectorTwo[j];
            currentIndex++;
        }
        for (String word : concatenate){
        }
        System.out.print(Arrays.toString(concatenate));
        System.out.println();
    }
}
