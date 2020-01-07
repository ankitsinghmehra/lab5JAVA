package entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int customerId;
	private String name;
	public int getCustomerId(){
		return customerId;
	}
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
