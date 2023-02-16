package org.codewars.uniqueNumber;

import java.util.Arrays;

public class Kata {

    public double findUniq(double[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .filter(a -> Arrays.stream(arr)
                        .filter(b -> a == b).count() == 1)
                .reduce((a, b) -> {
                    throw new IllegalStateException();
                })
                .getAsDouble();
    }
}
