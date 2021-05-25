package com.time.trangecino.Repository;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.time.trangecino.Data.Domain.WorkSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//written by Kaan
@Repository
public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Boolean> {
    WorkSchedule findByOutOfOffice(boolean OutOfOffice);
    void deleteById(Long ID);
    void findById(Long ID);
    //List <WorkSchedule> findAllFromUser (Long ID);
}