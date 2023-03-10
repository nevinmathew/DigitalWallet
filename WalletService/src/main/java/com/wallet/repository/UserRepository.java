package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByAccountNumber(String accountNumber);

	boolean existsByAccountNumber(String accountNumber);

}
