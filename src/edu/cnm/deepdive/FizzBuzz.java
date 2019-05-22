package edu.cnm.deepdive;

/**
 * Includes several public methods and constants for computing FizzBuzz values.
 * <p>This class includes <code>static</code> methods that take <code>int</code>
 * parameters and return <code>boolean</code> or {@link String}
 * results, indicating whether the specified values are divisible by 3 (fizz) or 5 (buzz).</p>
 *
 * @author Dylan Vance &amp; Deep Dive Coding Bootcamp Java+Android Cohort 7.
 * @version 1.0.0
 */
public class FizzBuzz {

  /** {@link String} value indicating a number divisible by 3.  */
  public static final String FIZZ = "Fizz";
  /** {@link String} value indicating a number divisible by 5.  */
  public static final String BUZZ = "Buzz";

  private FizzBuzz() {}
  
  /**
   * Computes and returns "Fizz", "Buzz", or a {@link String} representation of <code>value</code>,
   * depending on whether <code>value</code> is divisible by 3 or 5.
   *
   * @param value integer value to be tested for divisibility by 3 and 5.
   * @return "Fizz", "Buzz", or value as a {@link String}.
   */
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

  /**
   * Indicates divisibilty of <code>value</code> by 3 by returning a <code>boolean</code> results.
   *
   * @param value Intger value to be tested.
   * @return <code>boolean</code> result.
   */
  public static boolean isFizz(int value) {
    return value % 3 == 0;
  }
  /**
   * Indicates divisibilty of <code>value</code> by 5 by returning a <code>boolean</code> results.
   *
   * @param value Intger value to be tested.
   * @return <code>boolean</code> result.
   */
  public static boolean isBuzz(int value) {
    return value % 5 == 0;
  }

}
