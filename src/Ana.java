public class Ana

{
//    String lala;
//
//    static String bla = "OMG";
//

//        Ana a = new Ana();
//        System.out.println(a.mmm("whatever"));
//        a.lala = "omg";
//        Erik myErik = new Erik("Vasya");
//        Erik myErik2 = new Erik();
//        Erik myErik3 = new Erik("ANgelina");
//
//        System.out.println(myErik.name + "  with Parametr when creating an Object");
//        System.out.println(myErik2.name + "  with no Parametrs");
//        System.out.println(myErik.name + myErik3.name);
//        Erik(bla);
//        System.out.println(a.factorial(19));
//
//    }
//
////    void  maybe(boolean h){
////        h = false;
////        maybe(!h);
////    }
//
//
//     int factorial(int x) {
//        if (x == 1) return 1;
//        else return x * factorial (x - 1);
//    }
//
//
//    String  mmm (String name1)
//    {
//        Erik myErik4 = new Erik(bla);
//        name1 = bla;
//        String hh = bla + "  AND  " + myErik4.name;
//        return hh;
//    }
//       static String Erik(String bla)
//        {
//            return bla;
//        }
//
//
//
//
//
//
//
//
//
    static Void recursive(String one) {
        //if (one.length() == 0||one.length()==1);
        //     return one;
        // return recursive(one.substring(1) + one.charAt(0));

        //char c = one.charAt(one.length()-1);

        if (one.length()>=1)
        {
            System.out.println(one.substring(0,1));

            String shortString = one.substring(1);

            return recursive(shortString);
        }
       else
        {
            return null;
        }

    }
}













//        String bla  = "";
//        Ana ana = new Ana();
//        ana.fuckingReverseString2(bla);
//        fuckingReverseString(bla);



//    void fuckingReverseString2(String string) {
//
//        int[] array = new int[5];
//
//        for (int a = 0; a < array.length; a++) // Assign values to empty array
//        {
//            array[a] = a;
//        }
//        System.out.println("These are all the elements of the array " + Arrays.toString(array));
//
//        int total = 0;//sum of the elements of the array
//        int minValue = 9;//min value in the array
//
//        for (int i = 0; i < array.length; i++) {
//            total += array[i];
//            if (array[i] < minValue) {
//                minValue = array[i];
//            }
//        }
//
//        System.out.println("sum of the elements of the array " + total);
//        System.out.println("min Value in the array is " + minValue);
//
//        String[] arrayOfStrings = new String[]{"tg", "45g23", "haha", "popapa"};
//        int minString = 11;
//        for (int i = 0; i < arrayOfStrings.length; i++) {
//            if (arrayOfStrings[i].length() < minString) {
//                minString = i;
//            }
//        }
//        System.out.println("Thw shortest string in the array is " + arrayOfStrings[minString]);
//
//        String normal = "I need sleep";
//        String reverse;
//        System.out.println(reverse = new StringBuffer(normal).reverse().toString());
//    }
//
//    static void fuckingReverseString(String input) {
//        String result =  "";
//        for (int i = input.length()-1; i >=0; i--)
//
//        {
//            result = result + input.charAt(i);
//        }
//        System.out.println(result);
//    }
//
//
//    boolean isPrime(int number) {
//        for (int divisor = 2; divisor <= number / 2; divisor++) {
//            if (number % divisor == 0) {
//                return false;
//            }
//        }
//        return true;
//    }




