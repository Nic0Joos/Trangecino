package com.time.trangecino.Repository;


import com.time.trangecino.Data.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import com.time.trangecino.Data.Domain.Admin;
import org.springframework.stereotype.Repository;

//written by Lennart

public interface AdminRepository extends JpaRepository<Admin, Long> {

    String findbyEmail(String email);
    void deleteById(Admin ID);
}
