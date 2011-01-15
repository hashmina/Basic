package org.basic.datastrutcures.sorting;

public abstract class Sorter {
    abstract int[] sort(int[] array, int a, int b);
    public int[] sort(int[] array) {
        return sort(array, 0, array.length-1);
    }
}

