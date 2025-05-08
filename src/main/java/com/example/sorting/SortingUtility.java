package com.example.sorting;

public class SortingUtility {

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int pos = 0;

        while (pos < data.length) {

            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {

                pos++;

            } else {

                swap(data, pos, pos - 1);

                pos--;

            }

        }

    }

    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {

        boolean swapped;

        do {

            swapped = false;

            for (int i = 0; i < data.length - 1; i++) {

                if (data[i].compareTo(data[i + 1]) > 0) {

                    swap(data, i, i + 1);

                    swapped = true;

                }

            }

            if (swapped == false) {

                break;

            }

            swapped = false;

            for (int i = data.length - 1; i > 0; i--) {

                if (data[i].compareTo(data[i - 1]) > 0) {

                    swap(data, i, i + 1);

                    swapped = true;

                }

            }

        } while (swapped = true);

    }

    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO: Implement a Shell Sort here.

    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

}