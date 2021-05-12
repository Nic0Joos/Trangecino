package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


//Luca

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    Employee findByEmail (String email);
}
