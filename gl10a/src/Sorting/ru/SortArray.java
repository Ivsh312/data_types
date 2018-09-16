package Sorting.ru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortArray implements ISortArray{

    private ArrayList<String> array;

    public SortArray(ArrayList<String> array) {
        this.array = array;
    }

    public void setArray(ArrayList<String> array) {
        this.array = array;
    }

    public ArrayList<String> getArray() {
        return this.array;
    }

    public void sortAray() {
        Collections.sort(this.array, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
    }
}
