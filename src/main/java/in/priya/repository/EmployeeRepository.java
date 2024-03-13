package in.priya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.priya.entity.Employee;
import in.priya.projections.EmployeeProjection;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select id,name from employee", nativeQuery=true)
	 List<EmployeeProjection> findOnlyIdAndName();

}
