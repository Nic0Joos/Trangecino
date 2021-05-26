package com.time.trangecino.Repository;


import com.time.trangecino.Data.Domain.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//written by Kaan
@Repository
public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Long> {
    List <WorkSchedule> findAllbyEmployeeID (Long ID);
}