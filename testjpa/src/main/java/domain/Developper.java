package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Developper {
	
	public Developper() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long id;

	 private String name;
	 
	 private List<Task> task = new ArrayList<Task>();
	 
	 public Developper(String name, List<Task> developper) {
			super();
			this.name = name;
			this.task = task;
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
	
	@OneToMany(mappedBy="developper")
	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}
	 
	 
}
