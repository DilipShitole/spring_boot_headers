package com.crud2.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud2.test.model.BankModel;
@Repository
public interface BankRepository extends CrudRepository<BankModel, Integer> {

	



}
