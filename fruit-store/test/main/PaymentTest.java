package main;

import org.junit.jupiter.api.Test;

import static main.FruitEnum.APPLE;
import static main.FruitEnum.GRAPE;
import static main.FruitEnum.WATERMELON;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentTest {

  @Test
  void return_0_if_0_fruits() {
    Payment payment = new Payment();
    assertEquals(0, payment.price(new FruitEnum[] {}));
  }

  @Test
  void return_0_30_if_1_apple() {
    Payment payment = new Payment();
    assertEquals(APPLE.getPrice(), payment.price(new FruitEnum[] {APPLE}));
  }

  @Test
  void return_3_50_if_1_watermelon() {
    Payment payment = new Payment();
    assertEquals(WATERMELON.getPrice(), payment.price(new FruitEnum[] {WATERMELON}));
  }

  @Test
  void return_3_55_if_1_watermelon_and_1_grape() {
    Payment payment = new Payment();
    assertEquals(
        WATERMELON.getPrice() + GRAPE.getPrice(),
        payment.price(new FruitEnum[] {WATERMELON, GRAPE}));
  }
}
