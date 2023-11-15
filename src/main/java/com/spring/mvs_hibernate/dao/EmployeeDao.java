package dao;

import com.example.spring_mvc_hibirnate.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
}
