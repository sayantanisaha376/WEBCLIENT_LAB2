package test.empmicroservice.service;


import test.empmicroservice.dto.APIResponseDto;
import test.empmicroservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

}
