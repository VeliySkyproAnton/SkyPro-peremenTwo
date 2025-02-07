public class Main {
    public static void main(String[] args) {

        //int, byte, short, long, float, double.
        int one = 2147483646;
        byte two = 126;
        short three = 32766;
        long four = 9223372036854775807L;
        float five = 1.1f;
        double six = 2.2d;

        //27.12 987678965549 2,786 569 -159 27897 67
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte studentOneGroup = 23;
        byte studentTwoGroup = 27;
        byte studentThreeGroup = 30;
        int allGroup = studentOneGroup + studentTwoGroup + studentThreeGroup;
        short paper = 480;
        int paperStudent = paper / allGroup;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        byte bottle = 16;
        byte min = 2;
        short day = 1440;
        int month = 43200;
        int oneMinBottle = bottle / min;
        int oneBottle = oneMinBottle * 20;
        System.out.println("За " + "20 минут" + " машина произвела " + oneBottle + " штук бутылок");
        int twoBottle = oneMinBottle * day;
        System.out.println("За " + "сутки" + " машина произвела " + twoBottle + " штук бутылок");
        int threeBottle = oneMinBottle * day * 3;
        System.out.println("За " + "трое суток" + " машина произвела " + threeBottle + " штук бутылок");
        int fourBottle = oneMinBottle * month;
        System.out.println("За " + "месяц" + " машина произвела " + fourBottle + " штук бутылок");

        byte bottleClass = 6;
        byte allBottle = 120;
        int classBottle = allBottle / bottleClass;
        int brownBottle = classBottle * 4;
        int whiteBottle = classBottle * 2;
        System.out.println("«В школе, где " + classBottle + " классов, нужно " + whiteBottle + " банок белой краски и " + brownBottle + " банок коричневой краски».");

        //Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        //Мороженое-пломбир — 2 брикета по 100 грамм.
        //Яйца сырые – 4 яйца (1 яйцо — 70 грамм)
        byte bananas = 80;
        short milk = 105;
        byte iceCream = 100;
        short egg = 70;
        int breakfast = bananas * 5 + milk * 2 + iceCream * 2 + egg * 4;
        int kg = breakfast / 1000;
        System.out.println(breakfast);
        System.out.println(kg);

        short redLineWeight = 7000;
        short hardDiet = 500;
        short lightDiet = 250;
        int hardDay = redLineWeight / hardDiet;
        int lightDay = redLineWeight / lightDiet;
        int averageDay = hardDay + lightDay / 2;
        System.out.println(hardDay);
        System.out.println(lightDay);
        System.out.println(averageDay);

        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        int peopleOne = 67760;
        int peopleTwo = 83690;
        int peopleThree = 76230;
        int addPayOne = peopleOne / 100 * 10 + peopleOne;
        int addPayTwo = peopleTwo / 100 * 10 + peopleTwo;
        int addPayThree = peopleThree / 100 * 10 + peopleThree;
        int aaa = peopleOne * 12;
        int bbb = peopleTwo * 12;
        int ccc = peopleThree * 12;
        int aa = addPayOne * 12;
        int bb = addPayTwo * 12;
        int cc = addPayThree * 12;
        int aaaa = addPayOne - peopleOne;
        int bbbb = addPayTwo - peopleTwo;
        int cccc = addPayThree - peopleThree;
        System.out.println("«Маша теперь получает " + addPayOne + " рублей. Годовой доход вырос на " + aaaa + " рублей».");
        System.out.println("«Денис теперь получает " + addPayTwo + " рублей. Годовой доход вырос на " + bbbb + " рублей».");
        System.out.println("«Кристина теперь получает " + addPayThree + " рублей. Годовой доход вырос на " + cccc + " рублей».");
    }
}
