public class Main {
    public static void main(String[] args) {
        int money = 15000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + money;
            int i = total / money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


        int n = 0;
        while (n <= 9) {
            n = n + 1;
            System.out.print(n + " ");
        }
        {
            System.out.println(" ");
        }

        for (int z = 10; z >= 1; z--) {
            System.out.print(z + " ");
        }
        {
            System.out.println(" ");
        }







        int y = 12_000_000;
        int bornInYear = (y / 1000) * 17;
        int diedInYear = (y / 1000) * 8;
        int increaseForTheYear = bornInYear - diedInYear;
        for (int g = 1; g <= 10; g++) {
            increaseForTheYear = y + increaseForTheYear;
            System.out.println("Год " + g + " численность населения составляет " + increaseForTheYear);
        }








        int m = 15000;
        for (int w = 1; w <= 12; w++) {
            m = m + (m / 100 * 7);
            System.out.println("сумма накоплений за месяц " + w + " составляет " + m + " рублей");
        }







        int q = 15000;
        for (int w = 1; q < 12_000_000; w++) {
            q = q + (q / 100 * 7);
            System.out.println("сумма накоплений за месяц " + w + " составляет " + q + " рублей");
        }








        int x = 15000;
        for (int w = 1; x < 12_000_000; w++) {
            x = x + (x / 100 * 7);
            if (w % 6 == 0) {
                System.out.println("сумма накоплений за месяц " + w + " составляет " + x + " рублей");
            } }






        int a = 15000;
        int month = 12 * 9;
        for (int d = 1; d <= month; d++) {
            a = a + (a / 100 * 7);
            if (d % 6 == 0) {
                System.out.println("сумма накоплений за месяц " + d + " составляет " + a + " рублей");
            } }





        int friday = 2;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет");
        }





        int year = 2022;
        for (int l = year - 200; l <= year + 100; l++) {
            if (l % 79 == 0) {
                System.out.println(l);
            } }







        int h = 2;
        for (int f = 1; f <= 10; f++) {
            int t = h * f;
            System.out.println(h + " * " + f + " = " + t);
        }
    }

}










