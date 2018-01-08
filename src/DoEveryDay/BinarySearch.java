package DoEveryDay;

public class BinarySearch {

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