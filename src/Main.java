public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        //int, byte, short, long, float, double
        int variableInt = 10;
        System.out.println("Значение переменной variableInt с типом int равно " + variableInt);
        byte variableByte = 4;
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        short variableShort = 15;
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        long variableLong = 10L;
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        float variableFloat = 3.14f;
        System.out.println("Значение переменной variableFloat с типом long равно " + variableFloat);
        double variableDouble = 2;
        System.out.println("Значение переменной variableDouble с типом long равно " + variableDouble);


        //задача 3
        System.out.println("задача 3");
        int numberStudentsLud = 23;
        byte numberStudentsAnna = 27;
        short numberStudentsKate = 30;

        int totalNumberPaper = 480;
        int totalNumberStudents = numberStudentsLud + numberStudentsAnna + numberStudentsKate;
        int amountPaperStudent = totalNumberPaper/totalNumberStudents;
        System.out.println("На каждого ученика рассчитано " +  amountPaperStudent + " листов бумаги");

        //задача 4
        System.out.println("задача 4");

        int numberBottlesMinute = 8;
        byte timeOne = 20;
        int timeTwo = 24 * 60;
        int timeThree = 24 * 60  * 3;
        int timeFour = 24 * 60  * 3 * 31;
        System.out.println( "За 20 минут машины произвела бутылок " + numberBottlesMinute * timeOne + " штук ");
        System.out.println( "За сутки работы машины произвела бутылок " + numberBottlesMinute * timeTwo + " штук ");
        System.out.println( "За 3 дня работы машины произвела бутылок " + numberBottlesMinute * timeThree + " штук ");
        System.out.println( "За 1 месяц работы машины произвела бутылок " + numberBottlesMinute * timeFour + " штук ");

        //задача 5
        System.out.println("задача 5");

        byte totalNumberCansPaint = 120;
        byte numberCansWhitePaint = 2;
        byte numberCansBrownPaint = 4;
        int numberOffices = totalNumberCansPaint / (numberCansWhitePaint + numberCansBrownPaint);
        System.out.println("В школе, где " + numberOffices + " классов, нужно " + numberOffices * numberCansWhitePaint +  " банок белой краски и " + numberOffices * numberCansBrownPaint + " банок коричневой краски");

        //задача 6
        System.out.println("задача 6");

        int bananaWeight = 5 * 80;
        int milkWeight = 210;
        int iceCreamWeight = 2 * 100;
        int eggWeight = 4 * 70;
        int totalWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        int totalWeightKilograms = totalWeight / 1000;
        System.out.println("Общий вес спортивного завтрака в граммах " + totalWeight);
        System.out.println("Общий вес спортивного завтрака в килограммах " + totalWeightKilograms);


        //задача 7
        System.out.println("задача 7");

        int excessWeight = 7 * 1000;
        int weightLossRate1 = 250;
        int weightLossRate2 = 500;

        System.out.println("При ежедневном сбросе веса на " + weightLossRate1 + " необходимо " + excessWeight / weightLossRate1 + " дней");
        System.out.println("При ежедневном сбросе веса на " + weightLossRate2 + " необходимо " + excessWeight / weightLossRate2 + " дней");


        //задача 8
        System.out.println("задача 8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int oldIncomeMasha = salaryMasha * 12;
        int oldIncomeDenis = salaryDenis * 12;
        int oldIncomeKristina =  salaryKristina * 12;

        int newIncomeMasha =  ((salaryMasha * 10) / 100  + salaryMasha) * 12 - oldIncomeMasha;
        int newIncomeDenis =  ((salaryDenis * 10) / 100 + salaryDenis) * 12 - oldIncomeDenis;
        int newIncomeKristina =  ((salaryKristina * 10 ) / 100 + salaryKristina) * 12 - oldIncomeKristina;

        System.out.println( "Маша теперь получает " +  ((salaryMasha * 10) / 100 + salaryMasha)  + " рублей. Годовой доход вырос на " + newIncomeMasha + " рублей");
        System.out.println( "Денис теперь получает " +  ((salaryDenis * 10) / 100 + salaryDenis)  + " рублей. Годовой доход вырос на " + newIncomeDenis + " рублей");
        System.out.println( "Кристина теперь получает " +  ((salaryKristina * 10) / 100 + salaryKristina)  + " рублей. Годовой доход вырос на " + newIncomeKristina + " рублей");

    }
}