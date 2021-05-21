package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


 //Written by Alex
@Repository
public interface HRRepository extends JpaRepository<HR, Long> {

     HR findByEmail(String email);
     void deleteById(HR ID);

}
