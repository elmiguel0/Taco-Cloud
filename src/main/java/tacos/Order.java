package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

//@Data is a convenient shortcut annotation that bundles the features of 
//@ToString, @EqualsAndHashCode, @Getter / @Setter and 
//@RequiredArgsConstructor together 
//is not supported by IDE
public class Order {
	  @NotBlank(message="Name is required")
	  private String name;

	  @NotBlank(message="Street is required")
	  private String street;

	  @NotBlank(message="City is required")
	  private String city;

	  @NotBlank(message="State is required")
	  private String state;

	  @NotBlank(message="Zip code is required")
	  private String zip;

	  @CreditCardNumber(message="Not a valid credit card number")
	  private String ccNumber;

	  @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
	           message="Must be formatted MM/YY")
	  private String ccExpiration;

	  @Digits(integer=3, fraction=0, message="Invalid CVV")
	  private String ccCVV;
	
	public Order() {
	}

	public Order(String name, String street, String city, String state, String zip, String ccNumber,
			String ccExpiration, String ccCVV) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.ccNumber = ccNumber;
		this.ccExpiration = ccExpiration;
		this.ccCVV = ccCVV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcExpiration() {
		return ccExpiration;
	}

	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}

	public String getCcCVV() {
		return ccCVV;
	}

	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", ccNumber=" + ccNumber + ", ccExpiration=" + ccExpiration + ", ccCVV=" + ccCVV + "]";
	}
	
}
