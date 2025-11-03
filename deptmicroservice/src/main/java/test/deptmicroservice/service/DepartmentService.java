package test.deptmicroservice.service;

import test.deptmicroservice.dto.DepartmentDto;

public interface DepartmentService
{
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}