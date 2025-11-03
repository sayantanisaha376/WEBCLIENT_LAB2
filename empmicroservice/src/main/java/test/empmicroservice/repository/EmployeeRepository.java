package test.empmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.empmicroservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
        }