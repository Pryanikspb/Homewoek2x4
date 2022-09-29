public class Main {
    public static void main(String[] args) {
        boolean result = receiveParameters.check("Konstantin", "Password123456", "Password123456");
        if (result) {
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин или пароль некорректен");
        }
    }
}
