package edu.cnm.deepdive;

/**
 * Exercises (as a simple console application) the methods of the {@link FizzBuzz} class.
 *
 * @author Dylan Vance &amp; Deep Dive Coding Java+Android Cohort 7
 * @version 1.0.0
 */
public class Main {

  /**
   * Computes and displays the fizz buzz values corresponding to the input values 1&ndash;100.
   *
   * @param args Command line arguments (ignored).
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }

}
