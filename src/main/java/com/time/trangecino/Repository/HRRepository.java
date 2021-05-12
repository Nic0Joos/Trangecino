package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


 //Written by Alex
public interface HRRepository extends JpaRepository <HR,Long>{

    //@Query("select u from HR u where current_date >=u.startDate and current_date <=u.endDate and u.Employee =:employee")
    //Optional<HR> findByEmployee(@Param("employee") Employee employee);
}
