import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        /**
         * задание 1
         */
        printFloatNum();

        /**
         * задание 2
         */
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

        /**
         * задание 3
         */
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex){
            System.out.println("Деление на ноль не допустимо");
        }

        /**
         * задание 4
         */

        isEmptyStr();

    }

    /**
     * задание 1
     */
    public static void printFloatNum() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число: ");
            float num = scanner.nextFloat();
            System.out.printf("Введенное вами число %.2f\n", num);
        } catch (InputMismatchException e) {
            System.out.println("Что-то пошло не так, давайте попробуем снова");
            printFloatNum();
        } finally {
            scanner.close();
        }
    }

    /**
     * задание 3
     */
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void isEmptyStr(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите не пустую строку: ");
            String str = scanner.nextLine();

            if (str.isEmpty()) {
                throw new EmptyStringException();
            }
        }catch (EmptyStringException e){
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

}
