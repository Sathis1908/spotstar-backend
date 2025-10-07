package com.example.spotstar.Repository;

import com.example.spotstar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
