package task10;

import java.util.Scanner;
import java.util.*;
public class Main {

  static int task_4(int len, int sum, int k, int s) {
    if (len == k) {
      if (sum == s) {
        return 1;
      } else {
        return 0;
      }
    }
    int c = (len == 0 ? 1 : 0);
    int res = 0;
    for (int i = c; i < 10; i++) {
      res += task_4(len + 1, sum + i, k, s);
    }
    return res;
  }

  static int task_5(int number) {
    return (number == 0) ? 0 : (number % 10) + task_5(number / 10);
  }

  static String task_6(int n, int i) {
    // i- дополнительный параметр. При вызове должен быть равен 2
    if (n < 2) {
      return "NO";
    }
    else if (n == 2) {
      return "YES";
    }
    else if (n % i == 0) {
      return "NO";
    }
    else if (i < n / 2) {
      return task_6(n, i + 1);
    } else {
      return "YES";
    }
  }

  static void task_7(int n, int k) {
    // k- дополнительный параметр. При вызове должен быть равен 2
    if (k > n / 2) {
      System.out.print(n + " ");
      return;
    }
    if (n % k == 0) {
      System.out.print(k + " ");
      task_7(n / k, k);
    }
    else {
      task_7(n, ++k);
    }
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 4)
    System.out.println("\n4) Даны натуральные числа k и s. Определите, сколько существует k-значных натуральных чисел, сумма цифр которых равна d.");
    System.out.print("  Введи число k: ");
    int k = scanner.nextInt();
    System.out.print("  Введи число s: ");
    int s = scanner.nextInt();
    System.out.print("  Кол-во чисел: " + task_4(0, 0, k, s));

    // 5)
    System.out.println("\n5) Сумма цифр числа. Дано натуральное число N. Вычислите сумму его цифр.");
    System.out.print("  Введи число N: ");
    int N = scanner.nextInt();
    System.out.println("  Сумма цифр числа N: " + task_5(N));

    // 6)
    System.out.println("6) Проверка числа на простоту. Дано натуральное число n>1. Проверьте, является ли оно простым.");
    System.out.print("  Введи число N: ");
    N = scanner.nextInt();
    System.out.println("  Результат: " + task_6(N, 2));

    // 7)
    System.out.println("7)  Разложение на множители. Дано натуральное число n>1. Выведите все простые множители этого числа в порядке неубывания с учетом кратности.");
    System.out.print("  Введи число N: ");
    N = scanner.nextInt();
    System.out.print("  Результат: ");
    task_7(N, 2);

    scanner.close();
  }
}