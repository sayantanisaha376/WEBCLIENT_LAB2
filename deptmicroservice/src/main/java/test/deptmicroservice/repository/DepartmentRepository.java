package test.deptmicroservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import test.deptmicroservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>
{
    Department findByDepartmentCode(String departmentCode);
}