package edu.fa.AdventureWorkSpringView.controllers;


import edu.fa.AdventureWorkSpringView.model.dto.ShiftDTO;
import edu.fa.AdventureWorkSpringView.model.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/humanresources")
public class ShiftCtrl {
    @Autowired
    private ShiftService service;

    @GetMapping("/shift")
    public List<ShiftDTO> getAll(){
        return service.getAll();
    }
}
