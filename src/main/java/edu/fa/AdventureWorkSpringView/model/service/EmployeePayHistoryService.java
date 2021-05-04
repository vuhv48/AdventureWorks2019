package edu.fa.AdventureWorkSpringView.model.service;


import edu.fa.AdventureWorkSpringView.model.dao.EmployeePayHistoryRepository;
import edu.fa.AdventureWorkSpringView.model.entity.EmployeePayHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayHistoryService {

    @Autowired
    private EmployeePayHistoryRepository employeePayHistoryRepository;

    public List<EmployeePayHistory> getAll(){
        return employeePayHistoryRepository.findAll();
    }
}
