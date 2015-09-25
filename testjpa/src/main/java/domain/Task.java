package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Task {
	
	  private Long id;

	  private String name;
	  
	  @OneToOne
	  private Status status;
	  
	  @OneToOne 
	  private Priority priority;
	  
	  private Developper developper = new Developper();
	  
	  public Task(){
		  super();
	  }
	  public Task(String name, Status status, Priority priority, Developper developper) {
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
	
	@ManyToOne
	public Developper getDevelopper() {
		return developper;
	}
	public void setDevelopper(Developper developper) {
		this.developper = developper;
	}
	  

}
