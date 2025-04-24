import java.util.Scanner;

public class Anuary{
            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite um mês: ");
                String enter = scanner.nextLine();
                calendar(enter);
                scanner.close();
            }
        public static void calendar(String enter) {
            String month[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            boolean search = false;
            for (int i = 0; i < month.length; i++) {
                if(enter.equalsIgnoreCase(month[i])){
                System.out.println(month[i] + " tem " + tot[i] + " dias ");
                search = true;
                break;
                }
            } if (!search){
                System.out.println("Mês inválido");
            }

        }
    }
