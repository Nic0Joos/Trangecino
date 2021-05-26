package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



 //Written by Alex
@Repository
public interface HRRepository extends JpaRepository<HR, Long> {

     String findByEmail(String email);
     void deleteById(HR ID);

}
