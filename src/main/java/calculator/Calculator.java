package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Calculator {

  public int add(String text) {
    if (text == null || text.isEmpty()) {
      return 0;
    }

    String[] numbers = split(text);
    return sum(toInts(numbers));
  }

  private String[] split(String text) {
    Matcher m = Pattern.compile("//(.)\\n(.*)").matcher(text);
    if (m.find()) {
      String customDelimiter = m.group(1);
      return m.group(2).split(Pattern.quote(customDelimiter));
    }
    return text.split(",|:");
  }

  private int[] toInts(String[] numbers) {
    return Arrays.stream(numbers)
        .mapToInt(this::toInt)
        .toArray();
  }

  private int toInt(String number) {
    try {
      int num = Integer.parseInt(number.trim());
      if (num < 0) {
        throw new IllegalArgumentException();
      }
      return num;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException();
    }
  }

  private int sum(int[] numbers) {
    return IntStream.of(numbers).sum();
  }
}
