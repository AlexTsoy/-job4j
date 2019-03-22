package ru.job4j.array;

public class ArraySort {
    public int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        for (int i = 0; i < merge.length/2; i++) {
            if (left[i] > right[i]) {
                merge[i + i] = right[i];
                merge[i + i + 1] = left[i];
            } else {
                merge[i + i] = left[i];
                merge[i + i + 1] = right[i];
            }
        }
        for (int i = 0; i < merge.length-1; i++) {
            int res = merge[i];
            if (merge[i] > merge[i + 1]) {
                merge[i] = merge[i + 1];
                merge[i + 1] = res;
            }
        }
        return merge;
    }
}
