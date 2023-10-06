public class EmptyStringException extends Exception {
    @Override
    public String toString() {
        return "Пользовательская ошибка EmptyStringException: введена пустая строка";
    }
}
