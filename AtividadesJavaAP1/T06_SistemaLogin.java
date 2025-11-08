import java.util.Scanner;

public class T06_SistemaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";

        boolean acessoConcedido = false;

        // Usuário tem 3 tentativas
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("Login: ");
            String login = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                acessoConcedido = true;
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tentativa " + tentativa + " de 3.");
            }
        }

        if (acessoConcedido) {
            System.out.println("Acesso permitido. Bem-vindo!");
        } else {
            System.out.println("Acesso bloqueado após 3 tentativas.");
        }

        sc.close();
    }
}