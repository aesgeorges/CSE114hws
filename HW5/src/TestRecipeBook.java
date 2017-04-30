// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.L10

import java.util.ArrayList;
import java.util.Scanner;
public class TestRecipeBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RecipeBook book1 = new RecipeBook("Nice Food 114");
		
		RecipeIngredient[] cookieIngredients = {new RecipeIngredient("Egg", "egg", 78, (float)1.0), new RecipeIngredient("flour", "cups", 455, (float)2.25),
					new RecipeIngredient("Sugar", "cup", 773, (float)0.75), new RecipeIngredient("Vanilla", "teaspoon", 12, (float)1)};
		RecipeIngredient[] mcncheeseIngredients = {new RecipeIngredient("Dried Macaroni", "cups", 390, (float)4), new RecipeIngredient("Milk", "cups", 103, (float)2.5), new RecipeIngredient("Butter", "tablespoon", 102, (float)4),
					new RecipeIngredient("Egg", "egg", 78, (float)1), new RecipeIngredient("Cheddar", "pound", 1831, (float)1)};
		
		book1.addRecipe("Mac n Cheese", mcncheeseIngredients);
		book1.addRecipe("Cookie", cookieIngredients);
		System.out.print(book1.toString());
		
		System.out.println("\n Testing findRecipesLowCalories method... ");
		CookingRecipe[] lowCalories = book1.findRecipesLowCalories();
		for (int i = 0; i < lowCalories.length; i++) {
			if (lowCalories[i] != null) {
				System.out.println(lowCalories[i] + "is low calories.");
			}
		}
		
		System.out.println("\n Testing findRecipes method...\n with mac n cheese ingredients as parameter...");
		CookingRecipe[] results = book1.findRecipes(mcncheeseIngredients);
		for (int i = 0; i < results.length; i++) {
			if(results[i] != null) {
				System.out.println(results[i]);
			}
		}
		
		System.out.println("\n Testing findRecipesWithFewIngredients method...\n with recipes w/ less than 5 ingredients...");
		CookingRecipe[] results2 = book1.findRecipesWithFewIngredients(5);
		for (int i = 0; i < results2.length; i++) {
			if (results2[i] != null) {
				System.out.println(results2[i]);
			}
		}
		
		System.out.println("\n Testing removeRecipeIngredient(String)...\n remove an ingredient from Cookie Recipe(Enter name as String)...");
		ArrayList<CookingRecipe> cookie = book1.getRecipes();
		String ingredientName = input.next();
			cookie.get(1).removeRecipeIngredient(ingredientName);
			System.out.println(ingredientName + " was removed from Cookie");
		
		System.out.println("\n Replace it with another ingredient (like chocolate chips?)");
		System.out.println("Enter name of new Ingredient: ");
		String newName = input.nextLine();
		System.out.println("Enter measurement unit of new Ingredient: ");
		String newMeasure = input.nextLine();
		System.out.println("Enter amount of calories per unit for new Ingredient: ");
		int newCalories = input.nextInt();
		System.out.println("Enter quantity of new Ingredient: ");
		float newQuantity = input.nextFloat();
		Ingredient newIngredient = new Ingredient(newName, newMeasure, newCalories);
		cookie.get(0).addOrUpdateRecipeIngredient(newIngredient, newQuantity);
		System.out.println("Cookie Recipe is now: ");
		System.out.println(cookie.get(0).toString());
		
		System.out.println("\n Change name of Book: ");
		String name = input.nextLine();
		book1.setBookName(name);
		System.out.println("Remove a recipe from Book (Enter name of recipe): ");
		CookingRecipe recip = book1.removeRecipe(input.nextLine());
		if (recip != null) {
			System.out.println(recip.getName() + " was removered.");
		} else {
			System.out.println("This recipe wasn't found, nothing was removed");
		}
		System.out.print(book1.toString());
		
		input.close();
	}
}
