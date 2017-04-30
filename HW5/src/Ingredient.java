// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.L10

public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	public Ingredient(String name, String unit, int calories) {
		this.name = name;
		this.measuringUnit = unit;
		this.caloriesPerUnit = calories;
	}
	public String getName() {
		return name;
	}
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMeasuringUnit(String unit) {
		this.measuringUnit = unit;
	}
	public void setCaloriesPerUnit(int calories) {
		this.caloriesPerUnit = calories;
	}
	public boolean equals(Ingredient ingredient2) {
		boolean equals = false;
		if (this.getName().equals(ingredient2.getName())) {
			if (this.getCaloriesPerUnit() == ingredient2.getCaloriesPerUnit()) {
				if (this.getMeasuringUnit().equals(ingredient2.getMeasuringUnit())) {
					equals = true;
				}
			}
		}
		return equals;
	}
	public String toString() {
		String response = "Ingredient\n" + "name=" + name + "\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit=" + caloriesPerUnit;
		return response;
	}
}

