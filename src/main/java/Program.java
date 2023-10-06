import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
       // printFloatNum();

        /**
         * задание 2
         */
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        /**
         * задание 3
         */
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }

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
            System.out.printf("Введенное вами число %.2f", num);
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
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
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
