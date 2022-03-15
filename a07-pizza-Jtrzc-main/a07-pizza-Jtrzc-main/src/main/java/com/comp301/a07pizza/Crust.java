package com.comp301.a07pizza;

public class Crust extends IngredientImpl {

  private Crust(String name, Boolean isVegetarian, Boolean isVegan) {
    super(name, isVegetarian, isVegan);
  }

  public static final Crust HAND_TOSSED = new Crust("hand-tossed", true, true);
  public static final Crust THIN = new Crust("thin", true, true);
  public static final Crust DEEP_DISH = new Crust("deep dish", true, true);
}
