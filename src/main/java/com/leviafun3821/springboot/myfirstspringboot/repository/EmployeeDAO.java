package com.leviafun3821.springboot.myfirstspringboot.repository;


import com.leviafun3821.springboot.myfirstspringboot.model.Employee;

import java.util.List;


public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
