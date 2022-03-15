package com.comp301.a07pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza {

  private Size size;
  private Crust crust;
  private Sauce sauce;
  private Cheese cheese;
  private Topping[] toppings;

  public PizzaImpl(Size size, Crust crust, Sauce sauce, Cheese cheese, Topping[] toppings) {
    this.size = size;
    this.crust = crust;
    this.sauce = sauce;
    this.cheese = cheese;
    this.toppings = toppings;
  }

  @Override
  public boolean isVegetarian() {
    boolean value = true;
    for (int i = 0; i < toppings.length; i++) {
      if (!toppings[i].isVegetarian()) {
        value = false;
        break;
      }
    }
    return value;
  }

  @Override
  public boolean isVegan() {
    boolean value = true;
    for (int i = 0; i < toppings.length; i++) {
      if (!toppings[i].isVegan()) {
        value = false;
        break;
      }
    }
    if (cheese == Cheese.BLEND || cheese == Cheese.MOZZARELLA) {
      value = false;
    }
    if (sauce == Sauce.ALFREDO || sauce == Sauce.RANCH) {
      value = false;
    }
    return value;
  }

  @Override
  public double getPrice() {
    if (size == Size.SMALL) {
      return 7 + (0.25 * toppings.length);
    }
    if (size == Size.MEDIUM) {
      return 9 + (0.50 * toppings.length);
    }
    if (size == Size.LARGE) {
      return 11 + (0.75 * toppings.length);
    }
    return 0;
  }

  @Override
  public Size getSize() {
    return size;
  }

  @Override
  public Ingredient getSauce() {
    return sauce;
  }

  @Override
  public Ingredient getCheese() {
    return cheese;
  }

  @Override
  public Ingredient getCrust() {
    return crust;
  }

  @Override
  public Ingredient[] getToppings() {
    return toppings;
  }

  @Override
  public Ingredient[] getIngredients() {
    Ingredient[] total = new Ingredient[toppings.length + 3];
    for (int i = 0; i < toppings.length; i++) {
      total[i] = toppings[i];
    }
    total[toppings.length] = sauce;
    total[toppings.length + 1] = cheese;
    total[toppings.length + 2] = crust;
    return total;
  }
}
