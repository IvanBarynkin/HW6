public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("_______Задача №2_______");
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("_______Задача №3_______");
        byte start = 0;
        byte stop = 17;
        for (byte i = start; i <= stop; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("_______Задача №4_______");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("_______Задача №5_______");
        short startYear = 1904;
        short stopYear = 2096;
        for (short i = startYear; i <= stopYear; i += 4) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("_______Задача №6_______");
        for (byte i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("_______Задача №7_______");
        for (short i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("_______Задача №8_______");
        int payment = 29000;
        int sum = 0;
        for (byte i = 1; i <= 12; i++) {
            sum += payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей.");
        }
        System.out.println();

        System.out.println("_______Задача №9_______");
        sum = 0;
        for (byte i = 1; i <= 12; i++) {
            sum += sum / 100 + payment;
            System.out.println("Месяц " + i + ", сумма накоплений равна c учетов ставки 12% годовых равна " + sum + " рублей.");
        }
        System.out.println();

        System.out.println("_______Задача №10_______");
        for (byte i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}