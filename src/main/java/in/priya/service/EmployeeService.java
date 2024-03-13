package in.priya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.priya.dto.EmployeeDTO;
import in.priya.entity.Employee;
import in.priya.projections.EmployeeProjection;
import in.priya.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository empRepo;

	public EmployeeService(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}
	
	public void saveData()
	{
		Employee emp=new Employee();
		
		emp.setId(2);
		emp.setName("Akshay");
		emp.setGender("Male");
		emp.setSalary("200000");
		empRepo.save(emp);
	}
	
	public List<EmployeeDTO> getOnlyIdAndName()
	{
		  List<EmployeeProjection> list=empRepo.findOnlyIdAndName();
		  
		  List<EmployeeDTO> list1=new ArrayList<EmployeeDTO>();
		  
		  for(EmployeeProjection emp:list)
		  {
			 list1.add( new EmployeeDTO(emp.getId(),emp.getName()));
		  }
		
		return list1;
	}
}
