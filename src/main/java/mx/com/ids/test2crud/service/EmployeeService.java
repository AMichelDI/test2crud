package mx.com.ids.test2crud.service;


import mx.com.ids.test2crud.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee (Employee employee);
    Employee updateEmployee (Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(long employeeId);
    void deleteEmployee(long id);
}
