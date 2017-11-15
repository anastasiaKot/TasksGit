package DoEveryDay;

public class Training {

    public void printPrimeNumbers10inRow() {
        int currentINLine = 1;
        for (int i = 1; i <= 50; i++)
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

   static boolean isPrime(int number) {

        if (number <= 0 || number == 2 || number % 2 == 0)
           return  false;
       for (int i = 2; i < number; i++)
       {
           if (number % i == 0)
           return false;
       }
           return true;
   }
    public String reverseString(String string) {
        String builder = "";
        for(int i = string.length()-1; i>=0; i--)
        {
            builder = builder + string.charAt(i);
        }
         return builder;
   }
    public int binarySearch() {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key = 12;
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int med = (low + high) / 2;

            if (key == list[med]) {
                return med;
            } else if (key > list[med]) {
                low = med + 1;
            } else if (key < list[med]) {
                high = med - 1;

            }
        }
        return -1;


    }
}

