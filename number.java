import java.util.Random;
import java.util.Scanner;
class number {
 public static void main(String[] args) {
 Scanner scn = new Scanner(System.in);
 Random r = new Random();
 int x = r.nextInt(100) + 1, z, counter = 0;
 System.out.print("Угадайте число! \n");
 do {
 System.out.print("Введите число, попыток - " + (7-counter) + ": ");
 z = scn.nextInt();
 if (z > x)
 System.out.print("Много\n");
 if (z < x)
 System.out.print("Мало\n");
 counter++;
 }
 while ((z != x) && (counter < 7));
 if (z == x)
 System.out.print("Вы выйграли! ");
 else
 System.out.print("Вы проиграли! ");
 }
}