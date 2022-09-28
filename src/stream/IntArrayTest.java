package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);
        //스트림생성

        IntStream stream = Arrays.stream(arr);
        int count = (int)stream.count();
        System.out.println("count = " + count);
    }
}
