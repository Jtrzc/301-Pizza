package com.comp301.a07pizza;

public class Cheese extends IngredientImpl {
  private Cheese(String name, Boolean isVegetarian, Boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }

  public static final Cheese MOZZARELLA = new Cheese("mozzarella", true, false);
  public static final Cheese BLEND = new Cheese("blend", true, false);
  public static final Cheese VEGAN = new Cheese("vegan", true, true);
}
