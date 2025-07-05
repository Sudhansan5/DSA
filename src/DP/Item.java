package DP;

public class Item {

  private final int value;
  private final int weight;
  private final double capacity;

  Item(int value, int weight) {
    this.value = value;
    this.weight = weight;
    this.capacity = (double) value / weight;
  }

  public int getValue() {
    return value;
  }

  public double getCapacity() {
    return capacity;
  }

  public int getWeight() {
    return weight;
  }
}
