package com.hsbc.PizzaStore.domain;

import java.util.Objects;

public class Pizza {
	String pizzaName;
    String description;
    int sizeInCms;
    String majorIngredientOne;
    String majorIngredientTwo;
    String majorIngredientThree;
    int weight;
    float price;
    
    

    @Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", description=" + description + ", sizeInCms=" + sizeInCms
				+ ", majorIngredientOne=" + majorIngredientOne + ", majorIngredientTwo=" + majorIngredientTwo
				+ ", majorIngredientThree=" + majorIngredientThree + ", weight=" + weight + ", price=" + price + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(description, majorIngredientOne, majorIngredientThree, majorIngredientTwo, pizzaName, price,
				sizeInCms, weight);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return Objects.equals(description, other.description)
				&& Objects.equals(majorIngredientOne, other.majorIngredientOne)
				&& Objects.equals(majorIngredientThree, other.majorIngredientThree)
				&& Objects.equals(majorIngredientTwo, other.majorIngredientTwo)
				&& Objects.equals(pizzaName, other.pizzaName)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && sizeInCms == other.sizeInCms
				&& weight == other.weight;
	}



	public void preparation() {
        // Method implementation for pizza preparation
    }

}
