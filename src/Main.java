public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int x = 1;
        byte y = 2;
        short z = 3;
        long m = 4;
        float n = 5f;
        double t = 6;
        System.out.println("Значение переменной x с типом int равно " + x);
        System.out.println("Значение переменной y с типом byte равно " + y);
        System.out.println("Значение переменной z с типом short равно " + z);
        System.out.println("Значение переменной m с типом long равно " + m);
        System.out.println("Значение переменной n с типом float равно " + n);
        System.out.println("Значение переменной t с типом double равно " + t);
        System.out.println("\nЗадача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float f1 = 2.786f;
        short s = 569; //or char
        short s1 = -159;
        short s2 = 27897; //or char
        byte b = 67;
        System.out.println(f);
        System.out.println(l);
        System.out.println(f1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b);
        System.out.println("\nЗадача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        short paperForEveryone =(short) (paper / (lP + aS + eA)); //выбрал тип переменной short потому
        // что предположил что каждому ученику достанется по целому листу бумаги(в том случае если бы
        // количество листов не делилось бы нацело на количество учеников), значит ответ должен быть целым числом
        System.out.println("На каждого ученика рассчитано " + paperForEveryone + " листов бумаги");
        System.out.println("\nЗадача 4");
        byte v = 16 / 2;
        byte t1 = 20;
        short t2 = 24 * 60;
        short t3 = 3 * 24 * 60;
        int t4 = 30 * 24 * 60;
        short k1 = (short) (v * t1);
        short k2 = (short) (v * t2);
        int k3 = v * t3;
        int k4 = v * t4;
        System.out.println("За 20 минут машина произвела " + k1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + k2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + k3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + k4 + " штук бутылок");
        System.out.println("\nЗадача 5");
        byte classes = 120 / 6;
        byte whiteColor = (byte) (classes * 2);
        byte brownColor = (byte) (classes * 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor
                + " банок белой краски и " + brownColor + " банок коричневой краски");
        System.out.println("\nЗадание 6");
        short banana = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short blendGram = (short) (banana + milk + iceCream + eggs);
        float blendKGram =(float) blendGram / 1000;
        System.out.println(blendGram + "\n" + blendKGram);
        System.out.println("\nЗадание 7");
        short weight = 7 * 1000;
        short weightPerDay1 = 250;
        short weightPerDay2 = 500;
        byte allDays1 = (byte) (weight / weightPerDay1);
        byte allDays2 = (byte) (weight / weightPerDay2);
        byte averageNOD = (byte) ((allDays1 + allDays2) / 2);
        System.out.println(allDays1 + "\n" + allDays2 + "\n" + averageNOD);
        System.out.println("\nЗадание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float masha1 =  masha * 1.1f;
        float denis1 = denis * 1.1f;
        float kristina1 = kristina * 1.1f;
        float salaryDifM = (masha1 - masha) * 12;
        float salaryDifD = (denis1 - denis) * 12;
        float salaryDifK = (kristina1 - kristina) * 12;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + salaryDifM + " рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + salaryDifD + " рублей");
        System.out.println("Кристина теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + salaryDifK + " рублей");
        }
    }