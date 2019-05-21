package edu.cnm.deepdive;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";

  public static String fizzBuzzValue(int value) {
    if (value <= 0) {
      throw new IllegalArgumentException();
    }
    String result = "";
    if (isFizz(value)) {
      result += FIZZ;
    }
    if (isBuzz(value)) {
      result += BUZZ;
    }
    if (result.isEmpty()) {
      result += value;
    }
    return result;
  }

  public static boolean isFizz(int value) {
    return value % 3 == 0;
  }

  public static boolean isBuzz(int value) {
    return value % 5 == 0;
  }

}
