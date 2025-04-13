import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    public static void main(String[] args){
    Map<String, String> userMap = new HashMap<>();
    userMap.put("João","1234");
    userMap.put("Ana","senhaSegura");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o Login: ");
    String login = scanner.nextLine();
    System.out.print("Digite a senha: ");
    String password = scanner.nextLine();
    if(loginVerify(login, password, userMap)){
        System.out.println("Login completo");
    } else {
        System.out.println("Login ou senha incorretos");
    }
    scanner.close();
    }
public static boolean loginVerify(String login, String password, Map<String, String> user){
        return user.containsKey(login) && user.get(login).equals(password);
}
}
