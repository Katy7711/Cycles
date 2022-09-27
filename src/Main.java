public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_2_0_1_2_3();
        task_2_4();
        task_3_1();
        task_3_2();




    }
    public static void task_1() {
        int money = 15000;
        int total = 0;
        int sum = 2_459_000;
        int months = 0;
        while (total <= sum) {
            total = total + money + total / 100;
            months ++;
            System.out.println("Месяц " + months + " сумма накоплений равна " + total + " рублей");
        }}


        public static void task_2() {
            int n = 0;
            while (n <= 9) {
                n = n + 1;
                System.out.print(n + " ");
            }
            System.out.println(" ");
            for (int z = 10; z >= 1; z--) {
                System.out.print(z + " ");
            }
            System.out.println(" ");
        }


    public static void task_3() {

        int population = 12_000_000;
        float bornInYear = (float) 17 / 1000;
        float diedInYear = (float) 8 / 1000;
        for (int year = 1; year <= 10; year++) {
            population = population + Math.round(population * bornInYear) - Math.round(population * diedInYear);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }
        public static void task_2_0_1_2_3() {

            int sum = 15000;
            int i = sum / 100 * 7;
            for (int month = 1; month <= 12; month++) {
                sum = sum + i;
                System.out.println("сумма накоплений за месяц " + month + " составляет " + sum + " рублей");
            }


            int desiredSum = 12_000_000;
            for (int month = 1; sum < desiredSum; month++) {
                sum = sum + i;
                System.out.println("сумма накоплений за месяц " + month + " составляет " + sum + " рублей");
            }


            for (int w = 1; sum <= 12_000_000; w++) {
                sum = sum + i;
                if (w % 6 == 0) {
                    System.out.println("сумма накоплений за месяц " + w + " составляет " + sum + " рублей");
                }


                int months = 12 * 9;
                for (int d = 1; d <= months; d++) {
                    sum = sum + i;
                    if (d % 6 == 0) {
                        System.out.println("сумма накоплений за месяц " + d + " составляет " + sum + " рублей");
                    }
                }
            }
        }

        public static void task_2_4() {
            int friday = 2;
            for (; friday <= 31; friday = friday + 7) {
                System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет");
            }
        }

        public static void task_3_1() {
            int year = 2022;
            int start = year - 200;
            int finish = year + 100;
            for (int l = start; l <= finish; l++) {
                if (l % 79 == 0) {
                    System.out.println(l);
                }
            }
        }

        public static void task_3_2() {

        int h = 2;
        for (int f = 1; f <= 10; f++) {
            int t = h * f;
            System.out.println(h + " * " + f + " = " + t);
        }
    }
}












