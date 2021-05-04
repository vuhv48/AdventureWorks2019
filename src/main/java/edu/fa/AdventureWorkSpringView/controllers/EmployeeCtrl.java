package edu.fa.AdventureWorkSpringView.controllers;


import edu.fa.AdventureWorkSpringView.controllers.util.PaginationUtil;
import edu.fa.AdventureWorkSpringView.model.entity.Employee;
import edu.fa.AdventureWorkSpringView.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/humanresources")
public class EmployeeCtrl {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/employees")
    public ResponseEntity<List<Employee>> findAll(Pageable pageable){
        Page<Employee> employees = service.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders((Page) employees, "/humanresources/employees");
        return new ResponseEntity<>(employees.getContent(), headers, HttpStatus.OK);
    }

    @RequestMapping("/employee")
    public String hello(){
        return "humanresources/employees";
    }

}
