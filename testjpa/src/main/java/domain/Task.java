package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Task {
	
	  private Long id;

	  private String name;
	  
	  private Status status;
	  
	  private Priority priority;
	  
	  private List<Developper> developper = new ArrayList<Developper>();
	  
	  public Task(){
		  super();
	  }
	  public Task(String name, Status status, Priority priority, List<Developper> developper) {
			super();
			this.name = name;
			this.status = status;
			this.priority = priority;
			this.developper = developper;
	  }
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	@OneToMany(mappedBy = "task", cascade = CascadeType.PERSIST)
	public List<Developper> getDevelopper() {
		return developper;
	}
	public void setDevelopper(List<Developper> developper) {
		this.developper = developper;
	}
	  

}
