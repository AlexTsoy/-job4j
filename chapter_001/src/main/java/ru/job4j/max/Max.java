package ru.job4j.max;

public class Max {
    public int max(int first, int second){
        int max = first<second ? second:first;
        return max;
    }

    public int max(int first, int second, int third){
        return max(third, this.max(first, second));
    }
}
