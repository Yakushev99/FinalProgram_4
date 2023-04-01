package ru.ibs.finalprogram4;
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i<3; i++) {
            System.out.println("Введите ответ: ");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String str = input.readLine();
            if (i == 0){
                if (str.equals("Подсказка")) {
                    System.out.println("Сжатый Covid для компьтера");
                }
            }
            else if (i > 0 && str.equals("Подсказка")){
                System.out.println("Подсказка уже недоступна");
                i = 1;
            }
            if (!str.equals("Заархивированный вирус")) {
                if (i < 2 && !str.equals("Подсказка")) {
                    System.out.println("Подумай еще!");
                }
                else if (i == 2) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            }
            else {
                System.out.println("Правильно!");
                break;
            }
        }
    }
}
