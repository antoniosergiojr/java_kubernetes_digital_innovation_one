package com.antonio.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.antonio.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

