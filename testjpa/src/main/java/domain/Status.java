package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author mamadian
 *
 */

@Entity
public class Status {
	
	private Long Id;
	private String name;
	
	public Status(){
		super();
	}
	public Status(String name) {
		super();
		this.name = name;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return Id;
	}
	
	@Id
	@GeneratedValue
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
