package java3.myArrList;

import java.util.List;

public class AppMyArrList {
    public static void main(String[] args) {
        Integer[] arrTest = new Integer[]{1, 2, 3, 4};
        MyArrList<Integer> mArrLInt = new MyArrList<>();

        List<Integer> integers1 = mArrLInt.asListMake(arrTest);
        integers1.forEach(elem -> System.out.print(elem + " "));

        System.out.println();

        List<Integer> integers2 = mArrLInt.toArrayList(arrTest);
        integers2.forEach(elem -> System.out.print(elem + " "));
    }
}
