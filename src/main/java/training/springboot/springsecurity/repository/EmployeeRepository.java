package training.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.springboot.springsecurity.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findByUsername(String username);
}
