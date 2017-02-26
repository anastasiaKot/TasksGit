public class Training
{
    public static void main (String[]args)
    {
        int currentINLine = 1;


        for (int i = 1; i <= 1000; i++)
        {
           if (isPrime(i))
           {
               System.out.print(i + " ");
               currentINLine++;

            if (currentINLine == 10)
            {
                currentINLine = 1;
                System.out.println();
            }
          }
        }
    }

   static boolean isPrime(int number)

   { if (number <= 0 || number == 2 || number % 2 == 0)
           return  false;
       for (int i = 2; i < number; i++)
       {
           if (number % i == 0)
           return false;
       }
           return true;
   }
}

