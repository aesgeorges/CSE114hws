// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.L10

public class RecipeIngredient extends Ingredient {
	private float quantity;
	public RecipeIngredient(String name, String unit, int calories, float quantity) {
		super(name, unit, calories);
		this.quantity = quantity;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public boolean equals(RecipeIngredient recipeIngredient2) {
		boolean equals = false;
		if (((Ingredient) this).equals((Ingredient) recipeIngredient2)) {
			if (this.getQuantity() == recipeIngredient2.getQuantity()) {
				equals = true;
			}
		}
		return equals;
	}
	public String toString() {
		String response = super.toString() + " " + quantity;
		return response;
	}
}