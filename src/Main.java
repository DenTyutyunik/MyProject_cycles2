public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        double moneyTotal = 0;
        double moneyDeposite = 15000;
        double moneyPercentPerMonth = 1.01;
        int monthAmount = 1;
        while (moneyTotal < 2_495_000) {
            moneyTotal = (moneyTotal + moneyDeposite) * moneyPercentPerMonth;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", monthAmount, moneyTotal);
            monthAmount++;
        }
        System.out.println();

        System.out.println("Task 2");
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 3");
        int birthRate;
        int deathRate;
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            population += birthRate - deathRate;
            System.out.printf("Год %s, численность населения составляет %s\n", year, population);
        }
        System.out.println();

        System.out.println("Task 4");
        double vasyaDepositPercent = 1.07;
        double vasyaDepositAmount = 15000;
        double vasyaDepositAmountGoal = 12_000_000;
        int vasyaMonthAmount = 1;
        while (vasyaDepositAmount < vasyaDepositAmountGoal) {
            vasyaDepositAmount *= vasyaDepositPercent;
            System.out.printf("Месяц %s, депозит: %.2f\n", vasyaMonthAmount, vasyaDepositAmount);
            vasyaMonthAmount++;
        }
        System.out.println();

        System.out.println("Task 5");
        vasyaDepositAmount = 15000;
        vasyaMonthAmount = 1;
        while (vasyaDepositAmount < vasyaDepositAmountGoal) {
            vasyaDepositAmount *= vasyaDepositPercent;
            if (vasyaMonthAmount % 6 == 0) {
                System.out.printf("Месяц %s, депозит: %.2f\n", vasyaMonthAmount, vasyaDepositAmount);
            }
            vasyaMonthAmount++;
        }
        System.out.println();

        System.out.println("Task 6");
        vasyaDepositAmount = 15000;
        vasyaMonthAmount = 9 * 12;
        for (int i = 1; i <= vasyaMonthAmount; i++) {
            vasyaDepositAmount *= vasyaDepositPercent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, депозит: %.2f\n", i, vasyaDepositAmount);
            }
        }
        System.out.println();

        System.out.println("Task 7");
        int dayOfFirstFriday = 2;
        for (int i = dayOfFirstFriday; i <= 31; i+=7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", i);
        }
        System.out.println();

        System.out.println("Task 8");
        int period = 79;
        int yearCurrent = 2024;
        int borderLower = yearCurrent - 200;
        int borderUpper = yearCurrent + 100;
        for (int i = borderLower; i < borderUpper; i++) {
            if (i % period == 0) {
                System.out.println(i);
            }
        }
    }
}
