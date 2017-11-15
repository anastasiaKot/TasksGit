import java.util.Arrays;

public class Arrayss_PointersNIkola {
        public static void main(String[] args) {

            int[] list = {1, 2, 3, 4, 5};
            reeverse(list);
            System.out.println("after??? reversing " + Arrays.toString(list));
        }
        public static int[] reeverse(int[] list) {

            for (int i = 0; i < list.length; i++)
                list[i] = list[list.length - 1 - i];
            return list;
        }


        public static void hjkghj() {

//        int number = 0;
//        int[] numbers = new int[1];
//        m(number, numbers);
//
//
//        System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
//    }
//
//    public static void m(int x, int[] y) {
//        x = 3;
//        y[0] = 3;

//        int number = 10;
//
//        System.out.println("before change to zero "+number);
//
//        changeToZero(number);
//
//        //System.out.println("after change to zero "+number);
//
//        Integer changedNumber = 150;
//
//        System.out.println("really before change to zero "+changedNumber);
//
//        System.out.println("zkjdfhklajsgbkjasfhkas "+ reallyChangeToZero(changedNumber) + " !!!" + changedNumber);
//
//        //System.out.println("really after change to zero "+changedNumber);
//
            int[] list = {1, 2, 3, 4, 5}; //heap
            System.out.println("Before reversing" + Arrays.toString(list) + " memory address is: " + list);
            ; //pointer

            list = reverseWithReturn(list);
            System.out.println("After reversing with return " + Arrays.toString(list) + " memory address is: " + list);

            System.out.println("---------------------");

            reverse(list);
            System.out.println("After reversing " + Arrays.toString(list) + " memory address is: " + list);

        }

        // this is called IN PLACE algorithm , which means the items are changed in place no new arrays are allocated in memory

        public static void reverse(int[] list) {

            for (int i = 0; i < list.length; i++) {
                list[i] = list[list.length - 1 - i];
            }
//        printArray(list);
////        printArray(newList);
//
////        list = newList;
//
//        printArray(list);
//        printArray(newList);
        }

        //this is called IN PLACE algorithm , which means the items are changed in place no new arrays are allocated in memory
        public static int[] reverseWithReturn(int[] list) {

            int[] newList = new int[list.length]; //create new one
            for (int i = 0; i < list.length; i++) {

                newList[i] = list[list.length - 1 - i]; //starting from end
//            System.out.print(newList[i] + " this is newList");
            }

            System.out.println("INSIDE THE FUNCTION / STACK  array: " + newList + " " + Arrays.toString(newList));

            return newList;
//        printArray(list);
////        printArray(newList);
//
////        list = newList;
//
//        printArray(list);
//        printArray(newList);

        }

//    public static void changeToZero(int numberToChange) {
//        numberToChange = 0;
//    }
//
//    public static int reallyChangeToZero(Integer numberToChange) { //150
//        numberToChange = 0;
//        return numberToChange;
//
//    }

        public static void printArray(int[] list) {
            System.out.println("Printing array: " + list + " " + Arrays.toString(list));
        }
    }


//
//        if (str.charAt(i) == str.charAt(i + 1)) {
//            lastcharCount++;
//        } else {
//
//            if (lastcharCount > maxCount) {
//                maxChar = str.charAt(i);
//                maxCount = lastcharCount;
//            }
//            lastcharCount = 1;
//        }




