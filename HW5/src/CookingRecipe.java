// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.L10

import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> ingredients;
	public CookingRecipe(String name) {
		this.name = name;
		this.ingredients = new ArrayList<RecipeIngredient>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		boolean inList = false;
		RecipeIngredient newIngredient = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), 
				ingredient.getCaloriesPerUnit(), quantity);
		for (int i = 0; i < this.ingredients.size(); i++) {
			if (newIngredient.equals(ingredients.get(i))) {
				inList = true;
				ingredients.get(i).setQuantity(quantity);
				ingredients.get(i).setName(ingredient.getName());
				ingredients.get(i).setMeasuringUnit(ingredient.getMeasuringUnit());
				ingredients.get(i).setCaloriesPerUnit(ingredient.getCaloriesPerUnit());
			}
		}
		if (inList == false) {
			ingredients.add(newIngredient);
		} else if (inList == true) {
			
		}
		
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		RecipeIngredient found = null;
		for (int i = 0; i < this.ingredients.size(); i++) {
			if (((Ingredient)ingredients.get(i)).equals(ingredient)) {				
				found = ingredients.get(i);
			}
		}
		 return found;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		RecipeIngredient found = null;
		for (int i = 0; i < this.ingredients.size(); i++) {
			if (ingredients.get(i).getName().equals(ingredientName)) {
				found = ingredients.get(i);
			}
		}
		return found;
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		RecipeIngredient temp = null;
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredients.get(i).getName().equals(ingredient.getName())) {
				if (ingredients.get(i).getMeasuringUnit().equals(ingredient.getMeasuringUnit())) {
					if (ingredients.get(i).getCaloriesPerUnit() == ingredient.getCaloriesPerUnit()) {
						temp = ingredients.get(i);
						ingredients.remove(i);
					}
				}
			}
		}
		return temp;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		RecipeIngredient temp = null;
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredients.get(i).getName().equals(ingredientName)) {
				temp = (RecipeIngredient) ingredients.get(i);
				ingredients.remove(i);
			}
		}
		return temp;
	}
	public float calculateCalories() {
		float sum = 0;
		for (int i = 0; i < ingredients.size(); i++) {
			sum += ingredients.get(i).getCaloriesPerUnit();
		}
		return sum;
	}
	public int getNumberOfIngredients() {
		int count = 0;
		for (int i = 0; i < ingredients.size(); i++) {
			count++;
		}
		return count;
	}
	public boolean equals(CookingRecipe recipe2) {
		boolean equals = false;
		if (this.getName().equals(recipe2.getName())) {
			if (this.ingredients.equals(recipe2.ingredients)) {
				equals = true;
			}
		}
		return equals;
	}
	public String toString() {
		String response = this.getName() + " (" + this.calculateCalories() + " calories)" + "\n" + "Ingredients: ";
		int count = 1;
		for (int i = 0; i < ingredients.size(); i++) {
			response += "\n \t" +  count + ") ";
			response += this.ingredients.get(i).getQuantity() + " " + this.ingredients.get(i).getMeasuringUnit()
					+ " " + this.ingredients.get(i).getName() + " (" + this.ingredients.get(i).getCaloriesPerUnit() + " calories/" 
					+ this.ingredients.get(i).getMeasuringUnit() + ")";
			count++;
		}
		return response;
	}
}