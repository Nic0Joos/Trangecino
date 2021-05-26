package com.time.trangecino.Repository;

import com.time.trangecino.Data.Domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//written by Lennart
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    String findbyEmail(String email);
    void deleteByID(Admin ID);
}
