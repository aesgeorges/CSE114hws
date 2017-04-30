// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.L10

import java.util.ArrayList;

public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> recipes = new ArrayList<CookingRecipe>(); 
	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public ArrayList<CookingRecipe> getRecipes() {
		return recipes;
	}
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		boolean inList = false;
		CookingRecipe newRecipe = new CookingRecipe(name);
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getName().equals(name)) {
				inList = true;
			}
		}
		if (inList == false) {
			for (int i = 0; i < ingredients.length; i++) {
				newRecipe.addOrUpdateRecipeIngredient((Ingredient) ingredients[i], ingredients[i].getQuantity());
			}
			recipes.add(newRecipe);
		}
		return newRecipe;
	}
	public CookingRecipe removeRecipe(String name) {
		CookingRecipe temp = null;
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getName().equals(name)) {
				temp = recipes.get(i);
				recipes.remove(i);
			}
		}
		return temp;
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		CookingRecipe[] list = new CookingRecipe[recipes.size()];
		int count = 0;
		int countRecipes = 0;
		for (int i = 0; i < recipes.size(); i++) {
			for (int j = 0; j < ingredients.length; j++) {
				if (recipes.get(i).getRecipeIngredient(ingredients[j]) != null) {
					count++;
				}
			}
			if (count == recipes.get(i).getNumberOfIngredients()) {
				list[countRecipes] = recipes.get(i);
				countRecipes++;
			}
		}
		return list;
	}
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		CookingRecipe[] list = new CookingRecipe[recipes.size()];
		int count = 0;
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getNumberOfIngredients() < numberOfIngredients) {
				list[count] = recipes.get(i);
				count++;
			}
		}
		return list;
	}
	public CookingRecipe[] findRecipesLowCalories() {
		CookingRecipe[] list = new CookingRecipe[recipes.size()];
		int count = 0;
		float min = Float.MAX_VALUE;
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).calculateCalories() < min) {
				min = recipes.get(i).calculateCalories();
			}
		}
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).calculateCalories() == min) {
				list[count] = recipes.get(i);
				count++;
			}
		}
		return list;
	}

	public boolean equals(RecipeBook book2) {
		boolean equals = false;
		if (this.getBookName().equals(book2.getBookName())) {
			if (this.getRecipes() == book2.getRecipes()) {
				return true;
			}
		}
		return equals;
	}
	public String toString() {
		String response = "Book Name: " + this.getBookName() + "\n" + "Recipes: \n";
		for (int i = 0; i < recipes.size(); i++) {
			response += "> " + recipes.get(i).toString() + "\n";
		}
		return response;
	}
}