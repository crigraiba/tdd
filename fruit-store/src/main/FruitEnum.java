package main;

public enum FruitEnum {
  APPLE(0.3),
  WATERMELON(3.5),
  GRAPE(0.05),
  ORANGE(0.7);

  FruitEnum(double price) {
    this.price = price;
  }

  private double price;

  public double getPrice() {
    return price;
  }
}
