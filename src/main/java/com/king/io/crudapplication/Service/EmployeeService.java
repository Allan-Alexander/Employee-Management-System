package com.king.io.crudapplication.Service;
import com.king.io.crudapplication.Service.EmployeeService;
import com.king.io.crudapplication.Model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPagenated(int pageNo, int pageSize);
}
