package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//written by Luca Weisskopf

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    Employee findByEmail (String email);
    void deleteById(Employee ID);
    List<Employee> findbyID(long employeeID);
}
