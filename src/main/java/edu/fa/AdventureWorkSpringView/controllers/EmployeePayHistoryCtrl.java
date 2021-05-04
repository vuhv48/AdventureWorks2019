package edu.fa.AdventureWorkSpringView.controllers;


import edu.fa.AdventureWorkSpringView.model.entity.EmployeePayHistory;
import edu.fa.AdventureWorkSpringView.model.service.EmployeePayHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("humanresources")
public class EmployeePayHistoryCtrl {

    @Autowired
    private EmployeePayHistoryService employeePayHistoryService;


    @GetMapping("employeePayHistory")
    public List<EmployeePayHistory> getAll(){
        return employeePayHistoryService.getAll();
    }

}
