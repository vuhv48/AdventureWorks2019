package edu.fa.AdventureWorkSpringView.controllers;


import edu.fa.AdventureWorkSpringView.model.dto.DepartmentDTO;
import edu.fa.AdventureWorkSpringView.model.entity.Department;
import edu.fa.AdventureWorkSpringView.model.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/humanresources")
public class DepartmentCtrl {

    @Autowired
    DepartmentService service;

 //   @ModelAttribute("departments")
    @GetMapping("/department")
    public List<Department> getAll(){
//        model.addAttribute("str", "strea");
//        model.addAttribute("departments", service.getAll());

        return service.getAll();
    }

    //đã chạy
//    @GetMapping("/deparmentByID/{deparmentByID}")
//    public List<Department> selectAll(@PathVariable("deparmentByID") short departmentID){
//        return service.selectAll(departmentID);
//    }

    @GetMapping("/deparmentByID/{deparmentByID}/{name}")
    public List<Department> selectAll(@PathVariable("deparmentByID") Integer departmentID,
                                      @PathVariable("name")String name){

        return service.selectAll(departmentID, name);
    }


    @GetMapping("/deparmentOrderBy")
    public List<Department> getDepartmentByOrOrderByDepartmentID(){
        return service.getDepartmentByOrOrderByDepartmentID();
    }

    @DeleteMapping("/deparmentByID/{deparmentID}")
    public void deleteByDepartmentID(@PathVariable("deparmentID") Integer deparmentID){

        service.deleteByDepartmentID(deparmentID);
    }
    @PostMapping("/addNew")
    public Department saveAndFlush(@RequestBody Department department){

        if(service.saveAndFlush(department) == null){
            System.out.println("faillllllllllllllllllllllll");


        }
        return service.saveAndFlush(department);
    }

    @GetMapping("/department_sp")
    public List<Department> selectAllStoreProc(){
        return service.selectAllStoreProc();
    }


    @GetMapping("/department_spbyid/{deparmentID}")
    public List<Department> selectAllStoreProcByID(@PathVariable("deparmentID") Integer deparmentID){
        return service.selectAllStoreProcByID(deparmentID);
    }

    @GetMapping("/department_fc")
    public List<Department> selectAllFunc(){
        return service.selectAllFunc();
    }


    @RequestMapping("/hello")
    public String hello(){
        return "/humanresources/wellcome";
    }
}
