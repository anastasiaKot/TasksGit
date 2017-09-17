public class Erik
{
//    String name = "Pushok";
//
//    void catMeow()
//
//    {
//        System.out.println("myau-maya");
//    }
//
//    //constructor
//    Erik(String name)
//    {
//       this.name = name;
//    }
//    Erik()
//    {
////       name = name;


    static void brackets(final int N) {
        brackets(N, 0, 0, new char[N * 2]);
    }
    static void brackets(int openStock, int closeStock, int index, char[] arr) {
        while (closeStock >= 0) {
            if (openStock > 0) {
                arr[index] = '<';
                brackets(openStock-1, closeStock+1, index+1, arr);
            }
            if (closeStock-- > 0) {
                arr[index++] = '>';
                if (index == arr.length) {
                    System.out.println(arr);
                }
            }
        }
    }
}

//use this keyword with a field
// to point to the instance variable instead of the local variable.
