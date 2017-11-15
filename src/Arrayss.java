public class Arrayss {

    public void shiftElementsToLeft() {

        int[] array = {1, 7, 2, 3, 4, 5, 7, 8, 8};

        int first = array[0];//1

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[(array.length - 1) - i];
        }
        array[array.length - 1] = first;

        for (int i : array) {
            System.out.print(array[i]);
        }
    }

    public void findLardestIndexOfLargestElement() {
        int[] array = {5, 7, 3, 2, 4, 8, 9, 4, 9};
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

                index = i;
            }
        }
        System.out.println("\"The first largest element is " + max + " and it's index is " + index + ".\"");

    }

    public void findSmallestElement() {
        int[] array = {0, 7, 3, 2, 4, 80, 1, 9, 4, 9};
        int smallest = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println(smallest + " smallest");
    }

    public void copyArray() {
        int[] source = {3, 4, 5};
        int[] source2 = new int[2];

        System.arraycopy(source, 0, source2, 1, source.length - 2);
        for (int u : source2) {
            System.out.print(u);
        }
    }

    public int[] reverseArray() {

        int[] list = {1, 2, 3, 5, 4, 7, 0, 55, 66};
        int mid = list.length / 2;
        for (int i = 0, j = list.length - 1; i < mid; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;
    }

    public void countOccuranceOfTheLetterInTheArrayOfChars() {

        char[] arrayChar = new char[100];
        for (int i = 0; i < arrayChar.length; i++) {
            //arrayChar[i] = (char)('a' + Math.random() * ('z' - 'a') );//generate random char
            arrayChar[i] = (char) (97 + Math.random() * (123 - 97));

        }
        for (char u : arrayChar) {
            System.out.print(u);
        }

        System.out.println();

        int[] arrayInt = new int[26];
        for (int i = 0; i < arrayChar.length; i++) {

            arrayInt[arrayChar[i] - 97]++;
        }

        System.out.println();

        for (int u = 0; u < arrayInt.length; u++) {
            System.out.print((char) (u + 97) + " -> " + arrayInt[u] + "; ");
        }

    }

    public int linearSearch() {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int key = -3;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch() {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int key = 120;
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
        return -low - 1;


    }

    public void sortingArrays() {

        int[] array = {10, 17, 3, 2, 4, 80, 1, 9, 4, 6, 0};

        int smallest;

        for (int i = 0; i < array.length - 1; i++) {
            smallest = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallest) ///change this to ddicrease/increase
                {
                    smallest = array[j];
                    array[j] = array[i];
                    array[i] = smallest;
                }
            }
        }
//        if (array[0] > array[array.length-1])
//        {
//            int a = array[0];
//            array[0] = array[array.length-1];
//            array[array.length-1] = a;
//        }

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    public void sortingArray() {

        int[] array = {10, 17, 3};
        //int utility = Arrays.binarySearch(array.33);

        int min;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        for (int t: array){
            System.out.print(t + ", ");
        }
    }
}
