package lk.ijse.mongo_be.repo;

import lk.ijse.mongo_be.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
    boolean existsByEmployeeCode(String employeeCode);
    Employee getEmployeeByEmployeeCode(String employeeCode);
    @Query(value = "{}", sort = "{ 'employeeCode' : -1 }")
    Employee findTopByOrderByEmployeeCodeDesc();
}