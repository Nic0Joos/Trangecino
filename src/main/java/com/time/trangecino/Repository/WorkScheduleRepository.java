package com.time.trangecino.Repository;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


//written by Kaan
@Repository
public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Boolean> {
    WorkSchedule findByOutOfOffice(boolean OutOfOffice);
    void deleteByID(Long ID);
    void deleteByEmployeeAndDate(Employee employee, Date date);
    List <WorkSchedule> findAllbyEmployeeID (Long ID);
    List<WorkSchedule> findOneWorkSchedule(Long WorkScheduleID);
}