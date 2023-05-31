public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {


        System.out.println("Задача 1");
        int a = 24756;
        byte b = 125;
        short c = 32760;
        float d = 34.54f;
        double e = 21.4;
        System.out.println("Значение переменной с типом int ровно " + a);
        System.out.println("Значение переменной с типом byte ровно " + b);
        System.out.println("Значение переменной с типом short ровно " + c);
        System.out.println("Значение переменной с типом  float ровно " + d);
        System.out.println("Значение переменной с типом double ровно " + e);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float w = 27.2f;
        long e = 987678965549L;
        float r = 2.786f;
        short t = 569;
        short g = -159;
        short f = 27897;
        byte y = 67;

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short sheetsOfPaper = 480;
        int allStudents = LP + AS + EA;
        int sheetsForEach = sheetsOfPaper / allStudents;
        System.out.println("На каждого ученика расчитано " + sheetsForEach + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottels = 16;
        byte time = 2;
        int perMinute = bottels / time;
        int in20Minute = perMinute * 20;
        int day = 24;
        int dayBottles = 24 * 60;
        day = dayBottles * perMinute;
        int threeDay = dayBottles * 3;
        threeDay = threeDay * perMinute;

        int mountDay = 30;
        mountDay = 30 * 24;
        mountDay = mountDay * 60;
        mountDay = mountDay * perMinute;
        System.out.println("За 20 минут машина произвела " + in20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + dayBottles + " штук бутылок ");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + mountDay + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int cansOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        cansOfPaint = cansOfPaint / (whitePaint + brownPaint);
        whitePaint = cansOfPaint * whitePaint;
        brownPaint = cansOfPaint * brownPaint;
        System.out.println("В школе, где " + cansOfPaint + " классов, нужно " + whitePaint + " Банок белой краски и " + brownPaint + " банок коричневой краски");


    }

    public static void task6() {
        System.out.println("Заача 6");
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int dinner = bananas + milk + iceCream + eggs;
        float dinner2 = dinner / 1000;
        System.out.println(dinner + " Грамм");
        System.out.println( dinner2 + " Килограмм");

    }

    public static void task7() {
        System.out.println("Задача 7");
        float weight = 7.000f;
        float weight2 = 0.250f;
        float weight3 = 0.500f;
        weight2 = weight / weight2;
        weight3 = weight / weight3;
        float onAverageDays = (weight2 + weight3) / 2;
        System.out.println("Если спортсмен будет худеть на 250 грамм в день, то понадобится " + weight2 + " дней");
        System.out.println("Если спортсмен будеть худеть на 500 грамм в день, то понадобится " + weight3 + " дней");
        System.out.println("В среднем может потребоваться " + onAverageDays + " дней");

    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha1 = masha / 10;
        int denis1 = denis / 10;
        int kristina1 = kristina / 10;
        int masha2 = masha + masha1;
        int denis2 = denis + denis1;
        int kristina2 = kristina + kristina1;
        int mashaYearOld = masha * 12;
        int denisYearOld = denis * 12;
        int kristinaYearOld = kristina * 12;
        int mashaYearNew = masha2 *12;
        int denisYearNew = denis2 * 12;
        int kristinaYearNew = kristina2 *12;
        int annualDifferenceMasha = mashaYearNew - mashaYearOld;
        int annualDifferenceDenis = denisYearNew - denisYearOld;
        int annualDifferenceKristina = kristinaYearNew - kristinaYearOld;
        System.out.println("Маша теперь получет " + masha2 + " рублей. Годовой доход вырос на " + annualDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + annualDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + annualDifferenceKristina + " рублей");


















    }
}