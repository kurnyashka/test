import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = str.nextInt();
        System.out.println("Введите второе число: ");
        int b = str.nextInt();
        System.out.println("Введите операцию: ");
        char op = str.next().charAt(0);
        int res = 0;
        boolean done = false;
        

        switch (op) {
            case '+':
                res = a + b;
                done = true;
                break;
            case '-':
                res = a - b;
                done = true;
                break;
            case '*':
                res = a * b;
                done = true;
                break;
            case '/':
                res = a / b;
                done = true;
                break;
            default:
                System.out.println("Такое я считать не умею :(");
                break;
        }

        if (done) {
            System.out.println("Результат: " + res);
        }
    }
}
