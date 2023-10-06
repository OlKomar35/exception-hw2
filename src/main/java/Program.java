import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        printFloatNum();
    }

    /**
     * задание 1
     */
    public static void printFloatNum(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            float num = scanner.nextFloat();
            System.out.printf("Введенное вами число %2f", num);
        } catch (InputMismatchException e) {
            System.out.println("Что-то пошло не так, давайте попробуем снова");
            printFloatNum();
        }
    }
}
