package java3.myArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrList<T> {
    /* *
     * Return list with help of Arrays.asList
     */
    public List<T> asListMake(T[] arr) {
        List<T> list = Arrays.asList(arr);
        return list;
    }

    /**
     * Return list with help of cycle for
     */
    public List<T> toArrayList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}