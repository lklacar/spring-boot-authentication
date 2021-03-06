package com.lukaklacar.reviews.repository;

import com.lukaklacar.reviews.model.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Luka on 9/3/2016.
 */
@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

    @Query("select a.role from UserRole a, User b where b.userName=?1 and a.userid=b.userId")
    List<String> findRoleByUserName(String username);

}
