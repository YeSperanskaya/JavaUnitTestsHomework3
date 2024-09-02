package seminars.third.hw;

import java.util.Scanner;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    public boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean isInInterval25To100(int number) {
        if(number <25 || number > 100) return false;
        return true;
    }

}
