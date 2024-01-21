package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pet.store.entity.Customer;
import pet.store.entity.Employee;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
public class PerStoreData {

	private Long petStoreId;
	private String petStoreName;
	private String petStoreAddress;
	private String petStoreCity;
	private String petStoreState;
	private Integer petStoreZip;
	private String petStorePhone;

	private Set<Customer> customers = new HashSet<>();

	private Set<Employee> employees = new HashSet<>();
	
	@Data
	@NoArgsConstructor
	public static class PetStoreCustomer{
		private Long customerId;
		private String customerFirstName;
		private String customerLastName;
		private String customerEmail;
		
		
	}
}
