package app;

import java.util.Arrays;
import java.util.Scanner;

public class mainProgram {

    static final double PI = 3.1415;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mainProgram program = new mainProgram();
//----------- 1
        System.out.println("Введіть ціле число: ");
        int number = scanner.nextInt();
        program.numberSquared(number);
//----------- 2
        System.out.println("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        System.out.println("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        program.cylinderVolume(height,radius);
//----------- 3
        int[] array = {11, 22, 33, 44, 55};
        program.sumOfArrElements(array);
//----------- 4
        System.out.println("Введіть рядок: ");
        scanner.nextLine();
        String line = scanner.nextLine();
        program.reverseString(line);
//----------- 5
        System.out.println("Введіть a: ");
        int numberA = scanner.nextInt();
        System.out.println("Введіть b: ");
        int numberB = scanner.nextInt();
        program.powerOfNumber(numberA,numberB);
//----------- 6
        System.out.println("Введіть ціле число n: ");
        int numberN = scanner.nextInt();
        System.out.println("Введіть текстовий рядок: ");
        scanner.nextLine();
        String textLine = scanner.nextLine();
        System.out.println();
        program.repeatString(textLine,numberN);

        scanner.close();
    }

    public void numberSquared(int n) {
        System.out.printf("Квадрат числа %d дорівнює %d.%n%n",n,n*n);
    }

    public void cylinderVolume(double height, double radius) {
        double volume = height * PI * radius * radius;
        System.out.printf("Об'єм циліндра з радіусом %.01f і висотою %.01f дорівнює %f.%n%n",
                radius,height,volume);
    }

    public void sumOfArrElements(int[] array){
        String arrayStr = Arrays.toString(array);
        int sum = 0;

        for (int el: array){ sum +=el; }

        System.out.printf("Масив чисел: %s%n" +
                "Сума всіх елементів масиву дорівнює %d.%n%n",arrayStr,sum);
    }

    public void reverseString(String str) {

        char[] charArr = str.toCharArray();
        String reverseStr = "";

        for (int i = charArr.length - 1; i >= 0; i--) {
            reverseStr = reverseStr + charArr[i];
        }

        System.out.printf("Рядок в зворотньому порядку: %s%n%n",reverseStr);

    }

    public void powerOfNumber(int a, int b) {
        double power = Math.pow((double)a,(double)b);

        System.out.printf("Результат %d^%d дорівнює %.0f.%n%n",a,b,power);

    }

    public void repeatString(String str, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }

    }

}
