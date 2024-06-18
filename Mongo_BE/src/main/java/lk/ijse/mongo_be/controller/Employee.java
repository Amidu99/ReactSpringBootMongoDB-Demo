package lk.ijse.mongo_be.controller;

import lk.ijse.mongo_be.dto.EmployeeDTO;
import lk.ijse.mongo_be.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class Employee {
    final static Logger logger = LoggerFactory.getLogger(Employee.class);
    private final EmployeeService employeeService;


}