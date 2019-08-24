package com.eluo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eluo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
