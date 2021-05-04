package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface HRRepository extends JpaRepository <HR,Long>{

    @Query("select u from HRAdminEntity u where current_date >=u.startDate and current_date <=u.endDate and u.employeeEntity =:employee")
    Optional<HR> findByEmployee(@Param("employee") Employee employee);
}
