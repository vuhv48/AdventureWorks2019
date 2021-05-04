package edu.fa.AdventureWorkSpringView.controllers;


import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistory;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistoryID;
import edu.fa.AdventureWorkSpringView.model.service.EmployeeDepartmentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/humanresources")
public class EmployeeDepartmentHistoryCtrl {
    @Autowired
    private EmployeeDepartmentHistoryService employeeDepartmentHistoryService;

    @GetMapping("/employeeDepartmentHistory")
    public List<EmployeeDepartmentHistory> getAll(){
        return employeeDepartmentHistoryService.getAll();
    }


    @RequestMapping("/employeeDepartmentHistoryByID/{businessEntityID}" )
    public List<EmployeeDepartmentHistory> getByBusinessEntityID(@Param(value = "businessEntityID") Integer businessEntityID){
        return employeeDepartmentHistoryService.getByBusinessEntityID(businessEntityID);
    }
}
