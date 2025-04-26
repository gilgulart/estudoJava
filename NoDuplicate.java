import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class NoDuplicate {
    public static void main(String[] args) {
        String[] allWords = {"Robalo","Pacu","Robalo","Taínha","Pirarucu","Dourado","Dourado","Corvina"};
        Set<String> uniqueWords = new HashSet<>();
        for (String words : allWords){
            uniqueWords.add(words);
        }
        System.out.println(uniqueWords);
        }
    }

