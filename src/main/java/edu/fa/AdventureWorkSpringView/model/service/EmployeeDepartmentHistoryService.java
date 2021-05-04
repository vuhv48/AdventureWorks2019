package edu.fa.AdventureWorkSpringView.model.service;


import edu.fa.AdventureWorkSpringView.model.dao.EmployeeDepartmentHistoryRepository;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistory;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeeDepartmentHistoryID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDepartmentHistoryService {

    @Autowired
    private EmployeeDepartmentHistoryRepository employeeDepartmentHistoryRepository;
    public List<EmployeeDepartmentHistory> getAll(){
        return employeeDepartmentHistoryRepository.findAll();
    }

    public List<EmployeeDepartmentHistory> getByBusinessEntityID(Integer businessEntityID){

        return employeeDepartmentHistoryRepository.getByBusinessEntityID(businessEntityID);
    }
}
