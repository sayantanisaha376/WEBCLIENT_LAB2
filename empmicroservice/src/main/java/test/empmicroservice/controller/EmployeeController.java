package test.empmicroservice.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.empmicroservice.dto.APIResponseDto;
import test.empmicroservice.dto.EmployeeDto;
import test.empmicroservice.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;



    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
}


//    // Build Get Employee REST API
//    @GetMapping("{id}")
//    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId){
//        EmployeeDto apiResponseDto = employeeService.getEmployeeById(employeeId);
//        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
//    }
}