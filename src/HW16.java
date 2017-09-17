import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by anastasia on 10/9/16.
 */
public class HW16 {

    static Long calculateArrayList(int seconds) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        long st1 = System.currentTimeMillis();;
        for (int i = 0; i < seconds; i++) {
            myList.add(i);
        }
        for (int i = 0; i < seconds; i++) {
            myList.get(i);
        }
        for (int i = seconds - 1; i <= 0; i--) {
            myList.remove(i);
        }
        long end1 = System.currentTimeMillis();;
        long duration = end1 - st1;
        return duration;
    }
    static Long calculateVector(int seconds) {
        Vector<Integer> myList = new Vector<Integer>();

        long st1 = System.currentTimeMillis();;
        for (int i = 0; i < seconds; i++) {
            myList.add(i);
        }
        for (int i = 0; i < seconds; i++) {
            myList.get(i);
        }
        for (int i = seconds - 1; i <= 0; i--) {
            myList.remove(i);
        }
        long end1 = System.currentTimeMillis();;
        long duration = end1 - st1;
        return duration;
    }
    static Long calculateLinkedList(int seconds) {
        LinkedList<Integer> myList = new LinkedList<Integer>();

        long st1 = System.currentTimeMillis();;
        for (int i = 0; i < seconds; i++) {
            myList.add(i);
        }
        for (int i = 0; i < seconds; i++) {
            myList.get(i);
        }
        for (int i = seconds - 1; i <= 0; i--) {
            myList.remove(i);
        }
        long end1 = System.currentTimeMillis();;
        long duration = end1 - st1;
        return duration;
    }
}