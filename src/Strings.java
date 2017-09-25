import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by anastasia on 6/27/16.
 */
public class Strings {
    static Scanner input  =  new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("####0.0");



//        String [] cats  = {"Koshka", "Ana", "Macedonia", "654835723852386583276", "skdufgsjbdfklj"};
//        String longestS = null;
//        int longest = 0;
//        for (String s: cats)
//        {
//            if (s.length() > longest)
//
//            longest = s.length();
//            longestS = s;
//        }
//        System.out.println("Longesqwe   wqeqt string in the array is " + longestS);





    public static void test001(){
        String name = "namename";
        String reverse = new StringBuffer(name).reverse().toString();
        System.out.print(reverse);

    }
    public static void reverseString(){
        String normal = "I need sleep";
        String reverse;
        System.out.println(reverse =  new StringBuffer(normal).reverse().toString()); //constructor
    }

    // Use print statements to find out the ASCII code for '1', 'A', 'B', 'a', and 'b'.
    // Use print statements to find out the character for the decimal codes 40, 59, 79, 85, and 90.
    // Use print statements to find out the character for the hexadecimal code 40, 5A, 71, 72, and 7A.

    private static void findASCIIcode()
        {
//            char one = (char) 'z';
//            char ch = (char) 62.25;
//            char cha;
//            cha = '\t';
//            char bb = (char) 40;
//            // int i = '1';
//            int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
//            int k = 'a';
//
//            int i = 97;
//            char c = (char) i;
//
//            System.out.println("jj\n\"ii\"");
//            System.out.println(i);

            //receives an ASCII code (an integer between 0 and 127) and displays its character.
            Scanner input  =  new Scanner(System.in);
            System.out.println("plase enter number between 0 and 127: ");
            int inputASCII = input.nextInt();
            char[] ascii = Character.toChars(inputASCII);
            System.out.println(ascii);

}

//receives a character and displays its Unicode.
    public static void displayUnicodeforChar()
        {
            System.out.println("plase enter character: ");
            String ch = input.nextLine();
            char exractChar = ch.charAt(0);
            int uni = (int)exractChar;

            System.out.println("The Unicode for the character" + ch + " is " + uni );

       }
    //prompts the user to enter an integer between 0 and 15
    // and displays its corresponding hex number
    public static void decToHex()
        {
        System.out.println("Enter a decimal value (0 to 15): ");
        int enter = input.nextInt();
        String abc = Integer.toHexString(enter).toUpperCase();
        System.out.println(abc);
         }
    public static void hexToDec()
        {
            System.out.println("enter hex value");
            String hex = input.next();
            int dec = Integer.parseInt(hex,16);
            System.out.println("Decimal value for " + hex + " is " + dec);
        }
    public static void hextoBinary()
     {
         System.out.println("Please enter your hex number : ");
         String hex = input.nextLine();
         String binary = Integer.toBinaryString(Integer.parseInt(hex, 16));
         System.out.println("binary for " + hex + " is " + binary);

     }
    public static void randomUppercaseLetter()
        {
            int random = (int)(64 +  Math.random() * (91 - 64) );
            char rand = (char)random;


            System.out.println(random + "  random  " + rand);

        }
    //Write a program that prompts the user to enter a string and dis- plays its length and its first character.
    public static void processString()
        {
            String in = input.nextLine();
            char firstChar = in.charAt(0);
            System.out.println(firstChar + " is the first letter of your " + in);
            int length = in.length();
            System.out.println("The length of your string " + in + "  is " + length);
        }

    public static void sum()
        {
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);
    }
    public static void generateRandomLowercaseLetter()
        {
        Random r = new Random();
        int x = r.nextInt(123-97) + 97;
        char xx = (char)x;
        System.out.println(xx);

        System.out.println('a' < 'b');

    }
    public static void stringGame()
        {
            String one = "Anastasia Shpak";
            int k = one.indexOf(' ');
            String fn = one.substring(0,k);
            String ln = one.substring(k+1);
            String intString = "09328421";
            int intInt = Integer.parseInt(intString);

            String b = intInt + "";
            String a = b.concat("haha");
            System.out.println(a);

            String s1 = "Welcome to Java";
            String s2 = "Programming is fun";
            String s3 = "welcome to Java";
            int abc = s1.indexOf('e',0);

            System.out.println(abc);
        }

   public static void printfExamples()
        {
            System.out.printf("%6d %d", 1, 2, 3);
            System.out.printf("amount is %f %e\n", 32.32, 32.32);
            System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);//left justified
            System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63); // right justified
            System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
        }


    //Check substring) Write a program that prompts the user to enter two strings
    // and reports whether the second string is a substring of the first string.
    //
    //
    //
    public static void checkSubstring()
        {
            System.out.println("please enter String1 ");

        String in1 = input.nextLine();
            System.out.println("please enter String2 ");

        String in2 = input.nextLine();
            boolean t = in1.contains(in2);
            if (t)
                {
                    System.out.println(in1 + " contains " + in2);
                }
            else {
                System.out.println("no");
            }

    }

    static void fuckingReverseString(String input) {
        String result =  "";
        for (int i = input.length()-1; i >=0; i--)

        {
            result = result + input.charAt(i);
        }
        System.out.println(result);
    }
}
