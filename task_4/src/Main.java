// Нахождение максимального из трех чисел
// Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить максимальное из них, используя первую функцию.

class Answer {
    // Функция для нахождения максимума из двух чисел
    public int findMaxOfTwo(int a, int b) {
        if (a > b){
            return a;
        }
        return  b;
        // return (a > b) ? a : b;
    }
    // Функция для нахождения максимума из трех чисел
    public int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main {
    public static void main(String[] args) {
        int a = 83, b = 28, c = 88;
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
// Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res);
    }
}