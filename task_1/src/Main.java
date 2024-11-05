// Напишите метод factorial, который принимает число n и возвращает его
// факториал. Если число n < 0, метод должен вернуть -1.


class Answer {
    public double factorial(int n) {
// Введите свое решение ниже
        if (n < 0) {
            return -1;
        }
        double fact = 1; //0! = 1
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран

public class Main {
    public static void main(String[] args) {
        int n = 23;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
// Вывод результата на экран
        Answer ans = new Answer();
       double itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}