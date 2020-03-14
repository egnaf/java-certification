package stream_api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Creation {

    @SuppressWarnings({"RedundantOperationOnEmptyContainer", "unused", "CatchMayIgnoreException"})
    public static void main(String[] args) {

        /* -------------------------------------------------------------------------------
         * Empty
         */
        Stream<Object> stream     = Stream.empty();
        IntStream intStream       = IntStream.empty();
        LongStream longStream     = LongStream.empty();
        DoubleStream doubleStream = DoubleStream.empty();

        /* -------------------------------------------------------------------------------
         * From values
         */
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        /* -------------------------------------------------------------------------------
         * With a stream builder
         */
        Stream<Integer> streamBuilder = Stream.<Integer>builder().add(1).add(2).add(3).build();

        /* -------------------------------------------------------------------------------
         * From function (ordered)
         */

        /* -------------------------------------------------------------------------------
         * From function (unordered)
         */
        Stream<Integer> randomList = Stream
                .generate(() -> new Random().nextInt())
                .limit(5);

        /* -------------------------------------------------------------------------------
         * From arrays
         */
        Stream<String> s14  = Arrays.stream(new String[] {"A", "B"});
        Stream<Integer> s15 = Arrays.stream(new Integer[] {1, 2, 3});
        IntStream s16       = Arrays.stream(new int[] {1, 2, 3});

        /* -------------------------------------------------------------------------------
         * From collections
         */
        Stream<String> s17 = new ArrayList<String>().stream();
        Stream<String> s18 = new ArrayList<String>().parallelStream();

        /* -------------------------------------------------------------------------------
         * From File
         */
        try {
            Stream<String> lines = Files.lines(Paths.get("file.txt"));
        } catch (IOException e) {
        }
    }
}
