package in.priya.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDTO {
	
	@Id
	private Integer id;
	
	private String name;

	public EmployeeDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmployeeDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + "]";
	}
	
	

}
