package io.ambpro.openapigenrator.controller;

import java.util.Arrays;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.ambpro.openapigenrator.api.EmployeeApi;
import io.ambpro.openapigenrator.model.Employee;

@RestController
public class EmployeeController implements EmployeeApi {


  @Override
  public ResponseEntity<String> addEmployee(@Valid Employee employee) {
    return ResponseEntity.ok("Employee with id "+employee.getId()+" is added");
  }

  @Override
  public ResponseEntity<List<Employee>> getEmployees() {
    return ResponseEntity.ok(Arrays.asList(new Employee()));
  }
}