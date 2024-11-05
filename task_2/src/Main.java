// Напишите метод printEvenNums, который выведет на экран все четные числа
// в промежутке от 1 до 100, каждое на новой строке.

class Answer {
    public static void printEvenNums() {
        for (int i = 1; i <= 100 ; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums();
    }
}
