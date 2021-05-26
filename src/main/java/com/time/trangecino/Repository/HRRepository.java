package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



 //Written by Alex
@Repository
public interface HRRepository extends JpaRepository<HR, Long> {

     HR findByEmail(String email);
     void deleteById(HR ID);
     List<HR> findbyID(long HRID);

}
