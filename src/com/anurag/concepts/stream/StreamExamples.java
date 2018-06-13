package com.anurag.concepts.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) throws IOException {

		// Empty Stream
		Stream<String> emptyStream = Stream.empty();

		// Stream Builder
		Stream.builder().add("a").add("b").add("c");

		// Array of Stream
		String[] arr = new String[] { "a", "b", "c" };
		Arrays.stream(arr);

		// Stream.generate
		Stream.generate(() -> "Element").limit(10);

		// Stream.iterate
		Stream.iterate(40, n -> n + 2).limit(10).forEach((n) -> System.out.println(n));

		// Stream of primitives
		IntStream intStream = IntStream.range(1, 3);

		// Stream of String
		IntStream streamOfChars = "abc".chars();
		Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");

		// Stream of File
		//Path path = Paths.get("C:\\file.txt");
		//Stream<String> streamOfStrings = Files.lines(path);

		// Refrencing a Stream
		List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				.collect(Collectors.toList());
		Optional<String> anyElement = elements.stream().findAny();
		Optional<String> firstElement = elements.stream().findFirst();
		
		//Stream pipeline
		Stream.of("abc","cde","efg").skip(1).forEach((n)->System.out.println(n));
		Stream.of("abc","cde","efg").skip(1).map((e)->e.substring(0, 2)).forEach((n)->System.out.println(n));
		
		

	}
}
