import java.util.Scanner;

public class Methods {

    static Scanner input = new Scanner(System.in);


    public static void test1() {
        int max = 0;
        // max(1, 2, max);
        System.out.println(max);
        // System.out.println(max(1, 2, max));
    }

    public static int max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
        return max;
    }

    public static void test2() {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }

    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num);
            num *= 2;
        }
        System.out.println();
    }

    public static void test3() {
        int times = 3;
        System.out.println("Before the call variable times is " + times);
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call, variable times is " + times);
    }

    public static void nPrintln(String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

    public static void test4() {
        int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }

    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }

    static void printPrime(int numberOfPrimes) {
        final int numberOfPrimesPerLine = 10;
        int currentNumberOfPrimes = 0;
        int number = 2;//primeness checked number

        while (currentNumberOfPrimes < numberOfPrimes) {
            if (isPrime(number)) {
                currentNumberOfPrimes++;
                if (currentNumberOfPrimes % numberOfPrimesPerLine == 0) {
                    System.out.printf("%-5s\n", number);
                } else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }

    static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printCalendar() {
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
        getNumberOfDaysInMonths(year, month);
    }

    public static void printMonth(int year, int month) {
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;

        }
        System.out.println(" " + year);
        System.out.println("-----------------------------");
        System.out.print(" Sun Mon Tue Wed Thu Fri Sat");
        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;
        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12)
            return 31;
//        if (month == 4 || month == 6 || month == 9 || month == 11)
//            return 30;
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else return 28;

        }
        return 30;

    }

    public static void getNumberOfDaysInMonths(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        int i = 0;
        int y = 7 - startDay + 1;
        while (y != 0) {
            System.out.print("    ");
            y--;
        }

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public static Boolean isLeapYear(int year)

    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static int getPentagonalNumbers(int n) {
        int count = 1;
        int lines = 10;
        while (count <= 100) {
            int pent = n * (3 * n - 1) / 2;

            if (count % lines != 0) {
                System.out.printf("%-6s", pent);
            } else {
                System.out.println();
            }
            count++;
            n++;
        }
        return n;

    }

    public static int sumDigits(long n) //input this is number
    {

        String bla = n + " ";
        return know(bla, n);

    }

    public static int know(String bla, long n) {

        long sum = 0;
        for (int i = 1; i <= bla.length(); i++) {
            while (n != 0) {
                sum += n % 10;
                n = n / 10;

            }
        }
        return (int) sum;
    }

    public static void reverse(int number) {
        String bla = number + "";
        StringBuffer haha = new StringBuffer(bla);
        StringBuffer bla1 = haha.reverse();
        System.out.println(bla1);

    }

    public static int reverse1(int number) {
        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        while (number != 0);

        return reverse;
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num3 < num2) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);

    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int line = i; line >= 1; line--) {
                System.out.print(line);
            }
            System.out.println();
        }
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        for (int i = ch1; i <= ch2; i++) {
            int chaPerLine = 0;

            char out = (char) i;
            System.out.print(out);

            chaPerLine ++;
                if (numberPerLine % chaPerLine == 0) {
                    System.out.println();
                }

        }
    }
}