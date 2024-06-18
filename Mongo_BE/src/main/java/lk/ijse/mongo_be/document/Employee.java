package lk.ijse.mongo_be.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "employees")
public class Employee {
    @Id
    private String employeeCode;
    private String employeeName;
    private String employeeEmail;
    private String employeePic;
}