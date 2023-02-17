package org.codewars.ku5.friendCheating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class RemovedNumbers {

    public static List<long[]> removNb(long n) {

        List<long[]> result = new ArrayList<>();

        long sum = (n * (n + 1)) / 2;

        for (int b = 1; b <= n + 1; b++) {

            long a = (sum - b) / (b + 1);

            if (a < n && a * b == sum - a - b) {
                result.add(new long[] {b, a});
            }
        }

        return result;

//        return LongStream.rangeClosed(1, n)
//                .filter( i -> (sum + 1) % (i + 1) == 0)
//                .mapToObj( i -> new long[] { i, (sum + 1) / (i + 1) - 1})
//                .filter( i -> i[0] != i[1] && i[1] <= n)
//                .collect(Collectors.toList());
    }

}
