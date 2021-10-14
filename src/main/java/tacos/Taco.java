package tacos;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

//@Data is a convenient shortcut annotation that bundles the features of 
//@ToString, @EqualsAndHashCode, @Getter / @Setter and 
//@RequiredArgsConstructor together 
// is not supported by IDE
public class Taco {

	@NotNull 
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
	
	public Taco() {
	}

	public Taco(String name, List<String> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Taco [name=" + name + ", ingredients=" + ingredients.toString() + "]";
	}
	
	
}
