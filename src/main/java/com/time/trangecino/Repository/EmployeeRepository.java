package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//written by Luca Weisskopf

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    Employee findByEmail (String email);
}
