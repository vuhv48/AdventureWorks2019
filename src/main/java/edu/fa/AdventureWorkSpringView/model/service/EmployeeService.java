package edu.fa.AdventureWorkSpringView.model.service;



import edu.fa.AdventureWorkSpringView.model.dao.EmployeeRepository;
import edu.fa.AdventureWorkSpringView.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Transactional(readOnly = true)
    public Page<Employee> findAll(Pageable pageable){
        
        return  repository.findAll(pageable);
//        Page<Employee> employees = repository.findAll(pageable);
//        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders((Page) employees, "/humanresources/employees");
//        return new ResponseEntity(employees.getContent(), headers, HttpStatus.OK);
    }

}
