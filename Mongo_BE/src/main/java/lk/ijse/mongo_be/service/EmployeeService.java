package lk.ijse.mongo_be.service;

import lk.ijse.mongo_be.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeService {
    void saveEmployee(EmployeeDTO employeeDTO);
    boolean existsByEmployeeCode(String employeeCode);
    EmployeeDTO getEmployeeByEmployeeCode(String employeeCode);
    List<EmployeeDTO> getAllEmployees();
    String getLastEmployeeCode();
    void updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(String employeeCode);
}