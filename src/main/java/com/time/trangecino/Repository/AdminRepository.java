package com.time.trangecino.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.time.trangecino.Data.Domain.Admin;

import java.util.List;


//written by Lennart

public interface AdminRepository extends JpaRepository<Admin, Long> {

    String findbyEmail(String email);
    void deleteById(Admin ID);

    List<Admin> findbyID(long adminID);
}
