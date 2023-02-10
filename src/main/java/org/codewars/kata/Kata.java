package org.codewars.kata;

public class Kata {

    public static int[] DataReverse(int[] data) {

        int[] dataReverse = new int[data.length];

        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, i, dataReverse, j, 8);
        }

        return dataReverse;

//        return java.util.stream.IntStream.range(0, data.length)
//                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
//                .toArray();
    }
}
