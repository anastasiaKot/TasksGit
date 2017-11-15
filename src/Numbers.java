import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numbers{
    static Scanner input = new Scanner(System.in);
    //new Scanner(System.in).nextInt();
    static DecimalFormat df = new DecimalFormat("####0.0");
    public static void  palindrome()
        {
            System.out.println("Enter 3 digit number:");
            int candidate = new Scanner(System.in).nextInt();
            int reverse = 0;
            int reminder1 = candidate % 10 ;
            int trimRem = ((candidate - reminder1) / 10 ) % 10;
            int trim2 = (reminder1 - trimRem ) /10;
            int build = (trim2 + trimRem + reminder1);
            System.out.println(build);
        }

    //Sort three integers
    public static void sortIntegers()throws IOException
        {
            System.out.println("Enter first number");
            Integer firstInt = input.nextInt();
            System.out.println("Enter second number");
            Integer secondInt = input.nextInt();
            System.out.println("Enter third number");
            Integer thirdInt = input.nextInt();

            if (firstInt >= secondInt && firstInt >= thirdInt)
                {
                    if (secondInt >= thirdInt)
                        {
                            System.out.println(firstInt + ",  " + secondInt + ",  " + thirdInt);
                        }

                    else
                        {
                            System.out.println(firstInt + ",  " + thirdInt + ",  " + secondInt);
                        }
                }

            if (secondInt >= firstInt && secondInt >= thirdInt)
                {
                    if (firstInt >= thirdInt)
                        {
                            System.out.println(secondInt + ", " + firstInt + ", " + thirdInt);
                        }
                    else
                        {
                            System.out.println(secondInt + ", " + thirdInt + ", " + secondInt);
                        }
                }
            if (thirdInt > firstInt && thirdInt > secondInt)
                {
                    if (firstInt >= secondInt)
                        {
                            System.out.println(thirdInt + ", " + firstInt + ", " + secondInt);
                        }
                    else
                        {
                            System.out.println(thirdInt + ", " + secondInt + ", " + firstInt);
                        }
                }


            else
                {
                    System.out.println(" you enterd equal numbers");
                }
        }






   // (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English
    //month name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
    public static void randomMonthgenerator()
        {
            int random = (int) (Math.random() * 13);
            switch (random)
                {
                    case 1:
                        System.out.println("January"); break;
                    case 2:
                        System.out.println("Febuary"); break;
                    case 3:
                        System.out.println("March"); break;
                    case 4:
                        System.out.println("April"); break;
                    case 5:
                        System.out.println("May"); break;
                    case 6:
                        System.out.println("June"); break;
                    case 7:
                        System.out.println("July"); break;
                    case 8:
                        System.out.println("August"); break;
                    case 9:
                         System.out.println("September"); break;
                    case 10:
                        System.out.println("October"); break;
                    case 11:
                        System.out.println("November"); break;
                    case 12:
                        System.out.println("December"); break;

                }


        }

   //(Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week
   // (Sunday is 0, Monday is 1, ..., and Saturday is 6).
   //enter the number of days after today for a future day and display the future day of the week.
//(6 (which day is now) + 10) % 7 is 2 (answer is Tuesday)
    public static void findFutureDates()
        {
            System.out.println("Enter today day: ");
            String todayString = input.next();
            short todayInt= 0;

            switch(todayString){
                case "Monday": todayInt = 1; break;
                case "Tuesday": todayInt = 2; break;
                case "Wednesday": todayInt = 3; break;
                case "Thursday": todayInt = 4; break;
                case "Friday": todayInt = 5; break;
                case "Saturday": todayInt = 6; break;
                case "Sunday": todayInt = 0; break;
            }

            System.out.println("Enter number of days after today");
            int futureDate = input.nextInt();
            int result = (todayInt + 10) % 7;
            switch(result){
                case 0: System.out.println("Sunday"); break;
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Friday"); break;
                case 5: System.out.println("Saturday"); break;
                case 6: System.out.println("Sunday"); break;
                           }
        }

    public static void switchExample() {
        int x = 1, a = 3;
        switch (a)
            {
                case 1:
                    System.out.println( x += 5); break;
                case 2:
                    System.out.println(x += 10);break;
                case 3:
                    System.out.println(x += 16);break;
                case 4:
                    System.out.println(x += 34);

            }

    }
    public static void zodiakYear() {
        System.out.print("Enter a year: ");

        int year = input.nextInt();

        switch (year % 12)
            {
                case 0:
                    System.out.println("monkey");break;
                                      case 1:
                    System.out.println("rooster");break;
                case 2:
                    System.out.println("dog");break;
                case 3:
                    System.out.println("pig");break;
                case 4:
                    System.out.println("rat");break;
                case 5:
                    System.out.println("ox");break;
                case 6:
                    System.out.println("tiger");break;
                case 7:
                    System.out.println("rabbit");break;
                case 8:
                    System.out.println("dragon");break;
                case 9:
                    System.out.println("snake");break;
                case 10:
                    System.out.println("horse"); break;
                case 11:
                    System.out.println("sheep");
            }
    }

    public static void bmi()
        {
            System.out.println("Enter your mass in kg : ");
            double mass  = input.nextDouble();
            System.out.println("enter your height in m");
             double height = input.nextDouble();
             double pre  = mass/(height * height);
            System.out.println(df.format(pre));
        }

    public static void calculateNumberDevidedBy2_or_5()
        {
            System.out.println("Enter  a number ");

            int number = input.nextInt();
            if (number % 2 == 0) System.out.println
                  (number + " is even");

            if (number % 5 == 0)
            System.out.println
                  (number + " is multiple of 5");
            double number1 = 9.298174817837982739123;
            System.out.println(Math.abs(number1));


        }

    public static void calculateRandomNumbersSum()
        {
            //int number1 = (int)(System.currentTimeMillis()/ 2 % 10);
            //int number2 = (int) (System.currentTimeMillis()/ 7 % 10);
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            System.out.println("What is " + number1 + " + " + number2 + "? ");
            int number  = input.nextInt();

            System.out.println(number1 + " - "+ number2 + " = " + number  +" is " + (number1 + number2 == number));
        }

    public static void calculateRandomNumbersSubstruction()
        {
            //int number1 = (int)(System.currentTimeMillis()/ 2 % 10);
            //int number2 = (int) (System.currentTimeMillis()/ 7 % 10);
            int number1 = (int)(Math.random() * 100);
            int number2 = (int)(Math.random() * 100);
            System.out.println("What is " + number1 + " - " + number2 + "? ");
            int number  = input.nextInt();

            System.out.println(number1 + " - "+ number2 + " = " + number  +" is " + (number1 - number2 == number));
            System.out.println("Correct answer is : " + (number1 - number2));
        }

public static void ConvertFeetIntoMeters()
    {
        DecimalFormat df = new DecimalFormat("####0.0");
        System.out.println("Enter a value for feet: ");

        double feetInput = input.nextDouble();
        double meters = Double.parseDouble(df.format(feetInput)) * 0.35;
        if (feetInput < 0)
            {
                System.out.println("Wrong input");
            }
        else
            {
                System.out.println(feetInput + " feet is " + df.format(meters) + " meters");
            }


    }
public static void convertCelsiusToFarenheit(){


System.out.println("Enter a degree in Celsius: ");

double celsius = input.nextDouble();
double far =(9.0 /5) * celsius + 32;
System.out.println(celsius + " Celsius is " + far + " Fahrenheit");

}

public static void ComputeVolumeOfCylinder()//volume = (radius*radius*Pi) * lenght
            {
                    System.out.println("Enter a radius of a Cylinder: ");
                    double radiusInput = input.nextDouble();
                    System.out.println("Enter a length of a Cylinder: ");
                    double lenghtInput = input.nextDouble();
                    double area = Double.parseDouble(df.format(radiusInput*radiusInput*Math.PI));
                    double volume = Double.parseDouble(df.format(area * lenghtInput));
                    System.out.println("The area is  " + area + ", the volume is " + volume);

            }

public static void calculatingTaxes(){
double purchaseAmount = 546;
double tax = purchaseAmount * 0.06;

System.out.println("Sales tax is $" + (int)(tax * 100) / 100.00);
}

static public void showCurrentTime()
	  {
	  long time = System.currentTimeMillis()/1000;
	  long currentSecond =  time % 60;

	  long currentMinute = time/60;
	  long cur1 = currentMinute % 60;

	  long currentHour = ((time/60) % 24 ) -10;

	  System.out.println("Current time is " + currentHour + ":"
		  + cur1 + ":" + currentSecond);

	  }
    static void even_Numbers()

    {
        for (int i = 0; i < 20; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        else
                {
                System.out.println("the number is not even");
                }
        }

    }


    static void odd_Numbers()
    {
        for (int i = 0; i < 100; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }

    static void prime_Numbers(int limit)

    {
        for (int number = 2; number <= limit; number++)
            if (isPrime(number))
            {
                System.out.println(number);
            }
    }

    public static void prime_Numbers()
    {
        for (int i = 0; i < 100; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i + ", ");
            }
        }
    }

    public static boolean isPrime(int number)
    {
        if (number % 2 == 0)
            return false;

        if (number == 2)
            return true;

        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
            {
                return false;
            }
        return true;
    }
    public static void CheckPassFail(int mark)
    //a program called CheckPassFail
    // which prints "PASS" if the int variable "mark"
    // is more than or equal to 50; or prints "FAIL" otherwise.
    // The program shall always print “DONE” before exiting.

    {
        System.out.println("Maximum point is "+ mark);
        if (mark >= 50)
        {
            System.out.println("PASS");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("DONE");

    }
    public int fromGit(int N)
    {
//            int N = null;
        int sum = 0;

        for (int i = 2; i <= N; i = i * 2)

            for (int j = 2; j <= N; j = j * 2)
            {
                System.out.print(j);
                for (int k = 1; k <= j; k++)
                    sum++;
            }
        return sum;


    }

    public static void CheckOddEven(int oddOrEven)
    {
        if(oddOrEven%2!=0)
        {
            System.out.println(oddOrEven + " is Odd Number");
        }
        else if (oddOrEven%2 == 0)
        {
            System.out.println(oddOrEven +" is Even Number");
        }
        else
        {
            System.out.println("What the fuck is that????");
        }
        System.out.println("BYE!");

}
    public static void PrintNumberInWord(int number){
        switch (number)
        {
            case 1:
            System.out.println("MOnday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
        }
    }













    }











