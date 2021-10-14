package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

// @Data is a convenient shortcut annotation that bundles the features of 
// @ToString, @EqualsAndHashCode, @Getter / @Setter and 
// @RequiredArgsConstructor together 
// @RequiredArgsConstructor this was not able to create issue with this IDE also @Data
public class Ingredient {

	private String id = "";
	private String name = "";
	private Type type = null;
	
	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public static enum Type{
		WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
	}

}
