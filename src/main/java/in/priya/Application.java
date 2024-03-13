package in.priya;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.priya.dto.EmployeeDTO;
import in.priya.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
		
		EmployeeService bean=context.getBean(EmployeeService.class);
		
		List<EmployeeDTO> list=bean.getOnlyIdAndName();
		
		//System.out.println(list);
		
		list.forEach(System.out::println);
		
		
		//bean.saveData();
	}

}
