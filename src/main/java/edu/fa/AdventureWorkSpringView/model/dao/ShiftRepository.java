package edu.fa.AdventureWorkSpringView.model.dao;

import edu.fa.AdventureWorkSpringView.model.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer> {


}
