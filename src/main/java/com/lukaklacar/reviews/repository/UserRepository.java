package com.lukaklacar.reviews.repository;

import com.lukaklacar.reviews.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Luka on 9/3/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String username);

}