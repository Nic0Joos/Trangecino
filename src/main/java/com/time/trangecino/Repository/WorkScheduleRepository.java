package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
//written by Kaan
@Repository
public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Boolean> {
    WorkSchedule findByboolean(boolean Holiday);
    void deleteById(Integer ID);

}