package solved.p15596;

import java.util.Arrays;

public class Test {

    long sum(int[] a) {
        return Arrays.stream(a).mapToLong(i -> (long) i).sum();
    }

}
