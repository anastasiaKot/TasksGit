import java.util.Scanner;

public class Loops {

     static Scanner input = new Scanner(System.in);


//(Display prime numbers between 2 and 1,000) Modify Listing 5.15
// to display all the prime numbers between 2 and 1,000, inclusive.
// Display eight prime numbers per line. Numbers are separated by exactly one space.
    private static void displayPrimesNumbersBetween() {
        int lines = 8;
        int count = 0;
        for (int x = 2; x <= 1000; x++) {
            //isPrime(x);

            while(count < 1000) {


                if (count % lines == 0) {
                    isPrime(x);
                    System.out.println(x);
                } else {
                    System.out.print(" ");
                    count++;
                }
            }

        }
    }
    static boolean isPrime(int number)
    {
        for (int d = 2; d <= number/2; d ++)
        {
            if (number % d == 0)
            {
                return false;
            }

        }
        return true;
    }


    public  void displayFourPatternsUsingLoopsPatternD() {

        for (int x = 1; x < 6; x++) {

            for (int a = 0; a < x; a++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= 6 - x; c++) {
                System.out.print(c + " ");
            }
            System.out.println();

        }
    }


    public void displayFourPatternsUsingLoopsPatternC()
    {
        int l = 6;
        for (int x = 1; x < (l +1); x++) //x это линии
        {
            for (int y = 1; y <= l-x; y++)//y = iterations inside one line
            {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++)
            {
                System.out.print(y + "");
            }
            System.out.println();
        }

    }

    public void displayFourPatternB()
    {
        int input = 6;
        for (int x = 1; x <= (input +1); x++)
        {

            for (int y = 1; y <= input+1-x; y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public void displayPatternsCC() {
        int line = 6;
        String string = " ";

        for (int six = 1 ; six <= line; six++)
        {
            String boo = "%" + (line + 1 - six) + "s";

            System.out.printf(boo, string);

            for (int sec = six; sec >= 1; sec--)
            {
                System.out.print(sec);
            }

            System.out.println();
        }
    }
    public void displayPatternsBB() {

        for (int six = 6 ; six >= 1; six --)
        {

            for (int sec = 1; sec <= six; sec++)
            {
                System.out.print(sec + " ");
            }

            System.out.println();
        }
    }

    //(Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in increasing order.
     // For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
     static void findFactorsOfAnInteger()
     {
         System.out.println("Enter a number");
         int y = input.nextInt();
         int x = 2;
         String n = "";
         while  (y != 1)
             {
                 if (y % x == 0)
                 {
                     n = n + " " + x;
                     y = y / x;
                     x = 2;
                 }
                 else
                 { x++;}

             }

         System.out.println(n);


     }

     //(Display the ASCII character table) Write a program that prints the characters in the ASCII character table
     // from ! to ~. Display ten characters per line.
     // The ASCII table is shown in Appendix B. Characters are separated by exactly one space.
     static void displayASCII_table()
     {
         final int  lines = 10;
         int count = 1;

         for (int i = 32; i <= 128; i++)
         {
             char asccii = (char)i;
             if (count % lines == 0)
             {
                 System.out.println(i + " is " + asccii + " ");
             }
             else System.out.print(i + " is " + asccii+ " ");
                 count ++;

         }
     }



     public void computeGCD(int number1, int number2)
     {
         System.out.println("Enter first number; ");
         int first = input.nextInt();
         System.out.println("Enter second numnber:  ");
         int second = input.nextInt();
         System.out.println("Enter third number:  ");

         int third = input.nextInt();

         int gcd = 1;
         int k = 1;

         while (k <= first && k <= second && k <= third)
         {
             if (first % k == 0 && second % k == 0 && third % k == 0)
             {
                 gcd = k;
             }
             k++;
         }
         System.out.println("Your greatest  gcd is   " + gcd);

     }


     //(Find the smallest n such that n2 7 12,000)
     // Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
     static void findSmallest()
     {
         int n = 1;
         while (Math.pow(n, 2) <= 12000) {
             n++;
         }

         System.out.println("The n is " + n);
         System.out.println("The n^2 is " + Math.pow(n, 2));

     }

//(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000,
    // ten per line, that are divisible by 5 and 6.
// Numbers are separated by exactly one space.
    public void divisibleBy5And6() {
        int count = 1;
        for (int i = 100; i < 200; i++) {
            if (i % 5 == 0 && i % 6 != 0 || i % 6 == 0 && i % 5 != 0) {
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(i + " ");
                }
                count++;
            }
        }
    }


 /*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000,
 ten per line, that are divisible by 5 and 6.
 Numbers are separated by exactly one space.
    from SJ:
    use variables:
    Boolean isDividableBy5AndNot6 = (i % 5 == 0 && i % 6 != 0)
    Boolean isDividableBy6AndNot5= (i % 6 == 0 && i % 5 != 0)
    */

    public void divisibleBy5And6ButNotBoth() {
        int count = 1;
        for (int i = 100; i < 200; i++) {
            if ((i % 5 == 0 && i % 6 != 0) || (i % 6 == 0 && i % 5 != 0)) {
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(i + " ");
                }
                count++;
            }
        }
    }
     //Write a program that prompts the user to enter the number of students
     // and each student’s name and score, displays the name of the student with the highest score.
     static void findTheHIghestScore()
     {

         System.out.println("Enter number of Students: ");
         int numberStudent = input.nextInt();

         int highestScore = 0;
         int secondHigh = 0;
         String maxName = " ";
         String maxSecondName = " ";

         for (int i = 0; i < numberStudent; i++)
         {
             System.out.print("Enter name and score of student (" + (i + 1) + "):");
             String name = input.next();
             int score = input.nextInt();

             if (score > highestScore)
             {
                 secondHigh = highestScore;
                 maxSecondName = maxName;

                 highestScore = score;
                 maxName = name;
             }
             else if ( score > secondHigh)
             {
                 secondHigh = score;
                 maxSecondName = name;
             }
         }

         System.out.println("The student name with the higher score is " + maxName);
         System.out.println("second high is " + maxSecondName);

     }

     static void repeatAdditions()
{
    final int NUMBER_OF_QUESTIONS = 5;
    int correctCount = 0;
    int count = 0; //number of questions count
    long startTime = System.currentTimeMillis();
    String output = " ";
    while (count < NUMBER_OF_QUESTIONS)
    {
        int number1 = (int) (Math.random() * 15);
        int number2 = (int) (Math.random() * 15);
        System.out.println("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        if (number1 + number2 == answer)
        {
            System.out.println("You are correct!");
            correctCount++;
        }
        else

            System.out.println("Your answer is wrong.\n" + number1
                    + " + " + number2 + " should be " + (number1 + number2));
            count++;
            output += "\n" + number1 + "+" + number2 + "="
                    + answer + ((number1 + number2 == answer) ? " correct" : " wrong");

    }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
}

static void conversionTableKgtoPounds()
{
    double kg = 0.0;
    double pounds = 0.0;
   //System.out.println("   Kilograms                    Pounds");
    System.out.printf("%10s%10s\n", "Kilograms", "Pounds");
    for (kg = 1.0; kg < 10.0; kg ++)
    {
        pounds = kg * 2.2;
        System.out.printf("%10.0f", kg);
        System.out.printf("%10.1f", pounds);
        System.out.println();
   }

}
     static void sideBysideTableKgtoPounds() {
         double kg = 0.0;
         double pounds = 0.0;
         double kg2 = 0;
         double pounds1 = 20;
         System.out.printf("%-10s%10s", "Kilograms", "Pounds");
         System.out.print("\t|\t");
         System.out.printf("%-10s%10s\n", "Pounds", "Kilograms");

         for (kg = 1, pounds1 = 20; kg < 199.0 || pounds1 <=515; kg+=2, pounds1+=5) {

             pounds = kg * 2.2;
             kg2 = pounds1/2.2;
             //double pounds1 = 20;


             System.out.printf("%-10.0f%10.1f", kg,pounds);
             System.out.print("\t|\t");
             System.out.printf("%-10.0f%10.2f", pounds1, kg2);

             System.out.println();


         }
     }
     static void sideBysideMilestoKm() {
         double ml = 0.0;
         double km = 0.0;
         double ml1 = 0;
         double km1 = 20;
         System.out.printf("%-10s%-10s", "Miles", "Kilometers");
         System.out.print("\t|\t");
         System.out.printf("%-15s%-10s\n", "Kilometers", "Miles");

         for (ml = 1, km1 = 20; ml <= 10.0 || km1 <=65; ml++, km1+=5) {

             km = ml * 1.609;
             ml1 = km1/1.609;
             //double pounds1 = 20;


             System.out.printf("%-10.0f%-10.3f", ml,km);
             System.out.print("\t|\t");
             System.out.printf("%-15.0f%-10.3f", km1, ml1);

             System.out.println();


         }
     }
     static void conversionFromMilestoKm() {
         double miles = 0.0;
         double km = 0.0;
         //System.out.println("   Kilograms                    Pounds");
         System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");
         for (km = 1.0; km <= 10.0; km++) {
             miles = km * 1.609;
             System.out.printf("%-10.0f", km);
             System.out.printf("%-10.3f", miles);
             System.out.println();


         }
     }

static void needMakeTheSame()
{
    int i = 0, sum = 0;

    while (i < 8) {
        if (i % 3 == 0) ;

        sum = i;

        i++;
    }
    System.out.println(sum);


    int sum1 = 0;
    for (int i1 = 0; i1 < 8; i1++) {
        if (i1 % 3 == 0) continue;
        sum1 = sum1 + i1;
    }
    System.out.println(sum1);
}


                static void nah()
        {
                    int i = 0; while (i < 5)
                    {
                    for (int j = i; j > 1; j--)
                        {
                            System.out.print(j + " ");
                        }

                    System.out.println("****");
                    i++;

                    }
                }

    static void men()
       {
                        int i = 5;
                        while (i > 1)
                            {
                            int num = 1;
                                int j;
                            for (j = 1; j <= i; j++)
                                {
                                System.out.print(num + "xxx");
                                num *= 2;
                                }
                            System.out.println();
                            i--;
                            }
                    }

     static void me()
      {
                    for (int i = 1; i < 5; i++)
                        {
                        int j = 0;
                        while (j < i)
                        {
                            System.out.println(j + " ");
                            j++;
                        }
                    }
                }
       static void meh()
       {
                        for (int i = 0; i < 10; i++)

                            for (int j = 0; j < i; j++)

                                System.out.print(i * j + " ");

                    }
      static void last() {

                    int i = 1; do {
                        int num = 1;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + "G ");
                            num += 2; }
                        System.out.println();
                        i++;
                    } while (i <= 5);
     }

     //Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every year.
    // In how many years will the tuition be doubled?

     void whenTuitionDoubles() {
        float tuit = 10000F;
        int year = 0;
        while (tuit <= 20000)
        {
            tuit = (float) (tuit*1.07);
            year ++;
        }
         System.out.println(year);
         System.out.printf("$%.1f", tuit);
     }


    boolean isStringPalindrome (String pal) {
        int start = 0;
        int end = pal.length() - 1;

        while (end > start)
        {
            if (pal.charAt(start) != pal.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;

    }

    public void display50FirstPrimeNumbers() {
        int prime = 2;
        int count = 0;

        while (count <= 50) {

            boolean isPrime = true;
            for (int div = 2; div <= prime / 2; div++) {
                if (prime % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % 10 == 0) {
                    System.out.println(prime + " ");
                } else {
                    System.out.print(prime + " ");
                }


            }
            prime++;

        }
    }

    //Count positive and negative numbers and compute the average of numbers
    public void countPOsitiveNegativeAverage() {
        int even = 0;
        int uneven = 0;
        int sum = 0;
        int in;
        System.out.println(" Enter a number, if you enter \"0\" program will stop: ");
        while ((in = input.nextInt())!=0)
        {
            sum += in;

            if  (in == 0)
                break;

            else if (in % 2 == 0) {
                even++;
            }
            else if (in % 2 != 0) {
                uneven++;
            }
        };

        System.out.println("Even numbers amount is " + even);
        System.out.println("Uneven amount numbers is " + uneven);
        System.out.println("Average " + sum/(even+uneven));
    }

    public void print() {
        System.out.printf("%-10s%10s\n", "Kilograms", "Pounds");
        int kg;

        for ( kg = 1; kg < 20; kg ++)
        {
            float pound = (float) (kg*2.2);
            System.out.printf("%-10d%10.1f\n", kg, pound);
        }

    }

    public void twoHighestScores()
    {
        /*
        (Find the two highest scores) Write a program that prompts the user to enter the number of students
        and each student’s name and score,
        and finally displays the student with the highest score and the student with the second-highest score.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of students");
        int studentNumber = scanner.nextInt();
        int highestScore = 0;
        int secondHighestScore = 0;
        String thatStudent = " ";
        String that2Student = " ";

        for (int i = 1; i <= studentNumber; i++)
        {
            System.out.println("Enter student #" + i + " name ");
            Scanner scanner3 = new Scanner(System.in);
            String name = scanner3.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter student #" + i + " score");
            int score = scanner2.nextInt();

            if (score > highestScore)
            {
                secondHighestScore = highestScore;
                that2Student = thatStudent;

                highestScore=score;
                thatStudent = name;
            }
        }
        System.out.println(thatStudent + " has the highest score, score is " + highestScore);
        System.out.println(that2Student + " has the second highest score, score is " + secondHighestScore);
    }

    public void anotherGCDSolution() {
        /*
       (Compute the greatest common divisor) Another solution
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit ");
        int digit1 = scanner.nextInt();

        System.out.println("Enter second digit ");
        int digit2 = scanner.nextInt();

        int smallestInput;
        int gcd = 1;

        boolean la = digit1 > digit2;

        if (la) {
            smallestInput = digit2;
            gcd = digit2;
        }
        else {
            smallestInput = digit1;
            gcd = digit1;
        }

        System.out.println(" And " + smallestInput + " this is the smallest number");

        while (smallestInput <=1) {
            if (digit1 % smallestInput == 0 && digit2 % smallestInput == 0) {
                gcd = smallestInput;
                smallestInput--;
            }
        }
        System.out.println("GCD = " + gcd);
    }

    /*(Find the factors of an integer)  //Nikola helped
    Write a program that reads an integer and displays all its smallest factors in increasing order.
    For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
*/
    public void findFactors() {
    int number = 120;
    int div =2;
        while (div <= number) {

        if ( number % div == 0) {

            System.out.println(div + ", ");
            number = number / div; //keep dividing without incrementing
        }
        else
            div ++;
    }
  }
   /*(Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15
     and displays a pyramid, as shown in the following sample run:
    */
   public void displayPyramid() {
       int input = 3;
       for (int i = 1; i <= input; i++) {
           for (int x = 1; x <= input - i; x++) {
               System.out.print("  ");
           }
           for (int k = i; k > 1; k--) {
               System.out.print(k + " ");
           }

           for (int j = 1; j <= i; j++) {
               System.out.print(j + " ");
           }

           System.out.println();

       }
   }
}


