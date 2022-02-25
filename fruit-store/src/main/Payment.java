package main;

import java.util.Arrays;

import static main.FruitEnum.APPLE;
import static main.FruitEnum.GRAPE;
import static main.FruitEnum.ORANGE;
import static main.FruitEnum.WATERMELON;

public class Payment {

  public double price(FruitEnum[] fruits) {
    if (fruits.length > 0) {
      return Arrays.stream(fruits)
          .mapToDouble(
              f -> {
                if (APPLE.equals(f)) return APPLE.getPrice();
                if (WATERMELON.equals(f)) return WATERMELON.getPrice();
                if (GRAPE.equals(f)) return GRAPE.getPrice();
                return ORANGE.getPrice();
              })
          .sum();
    }
    return 0;
  }
}
