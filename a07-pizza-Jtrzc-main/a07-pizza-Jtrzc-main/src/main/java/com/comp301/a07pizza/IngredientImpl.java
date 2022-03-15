package com.comp301.a07pizza;

public class IngredientImpl implements Ingredient {

  private String name;
  private Boolean isVegetarian;
  private Boolean isVegan;

  public IngredientImpl(String name, Boolean isVegetarian, Boolean isVegan) {
    this.name = name;
    this.isVegetarian = isVegetarian;
    this.isVegan = isVegan;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isVegetarian() {
    return isVegetarian;
  }

  @Override
  public boolean isVegan() {
    return isVegan;
  }
}
