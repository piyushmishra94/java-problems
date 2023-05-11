
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        // p<=q && q=>r
        int[] a = { 3, 5, 7, 7, 1, 1 };
        int[] b = { 7, 5, 9 };
        int[] c = { 7, 9, 11, 11, 13 };
        // remove duplicate

        FindRepeatation(a, a.length);

    }

    public static void FindRepeatation(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        System.out.println("The value of set is : " + set);
        Iterator itr = set.iterator();
        while (itr.hasNext()) {

            System.out.println(" the value of a is : " + itr.next());
        }

    }
}
