package domain;

/**
 * 
 * @author mamadian
 *
 */

public class Status {
	
	private Long Id;
	private String name;
	
	public Status(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return Id;
	}
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
