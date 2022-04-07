package ru.otus.hello;

import com.google.common.math.LongMath;
import java.math.RoundingMode;

public class HelloOtus {

  public static void main(String[] args) {
    System.out.println(LongMath.sqrt(45L, RoundingMode.UP));
  }
}
