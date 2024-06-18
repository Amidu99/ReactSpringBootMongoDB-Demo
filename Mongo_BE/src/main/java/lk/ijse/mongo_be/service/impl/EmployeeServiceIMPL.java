package lk.ijse.mongo_be.service.impl;

import lk.ijse.mongo_be.document.Employee;
import lk.ijse.mongo_be.dto.EmployeeDTO;
import lk.ijse.mongo_be.repo.EmployeeRepo;
import lk.ijse.mongo_be.service.EmployeeService;
import lk.ijse.mongo_be.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {
    private final EmployeeRepo repo;
    private final Mapping mapping;

    @Override
    public void saveEmployee(EmployeeDTO employeeDTO) {
        repo.save(mapping.toEmployeeEntity(employeeDTO));
    }

    @Override
    public boolean existsByEmployeeCode(String employeeCode) {
        return repo.existsByEmployeeCode(employeeCode);
    }

    @Override
    public EmployeeDTO getEmployeeByEmployeeCode(String employeeCode) {
        return mapping.toEmployeeDTO(repo.getEmployeeByEmployeeCode(employeeCode));
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return mapping.toEmployeeDTOList(repo.findAll());
    }

    @Override
    public String getLastEmployeeCode() {
        Employee employee = repo.findTopByOrderByEmployeeCodeDesc();
        return employee != null ? employee.getEmployeeCode() : null;
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDTO) {
        Employee existingEmployee = repo.getEmployeeByEmployeeCode(employeeDTO.getEmployeeCode());
        existingEmployee.setEmployeeName(employeeDTO.getEmployeeName());
        existingEmployee.setEmployeeEmail(employeeDTO.getEmployeeEmail());
        existingEmployee.setEmployeePic(employeeDTO.getEmployeePic());
        repo.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(String employeeCode) {
        repo.deleteById(employeeCode);
    }
}