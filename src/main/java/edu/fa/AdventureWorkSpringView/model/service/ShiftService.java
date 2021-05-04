package edu.fa.AdventureWorkSpringView.model.service;


import edu.fa.AdventureWorkSpringView.model.dao.ShiftRepository;
import edu.fa.AdventureWorkSpringView.model.dto.ShiftDTO;
import edu.fa.AdventureWorkSpringView.model.mapping.ShiftMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShiftService {
    @Autowired
    private ShiftRepository repository;

    @Autowired
    private ShiftMapper mapper;

    public List<ShiftDTO> getAll(){
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }



}
