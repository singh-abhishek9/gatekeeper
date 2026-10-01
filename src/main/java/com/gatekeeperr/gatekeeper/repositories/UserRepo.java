package com.gatekeeperr.gatekeeper.repositories;

import com.gatekeeperr.gatekeeper.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDto, Long> {


}
