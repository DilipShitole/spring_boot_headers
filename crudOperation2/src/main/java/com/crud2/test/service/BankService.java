package com.crud2.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud2.test.exception.NoBankFound;
import com.crud2.test.model.BankModel;
import com.crud2.test.repository.BankRepository;

@Service
public class BankService {

	
	@Autowired
	BankRepository bankRepository;

	public BankModel saveBankDetails(BankModel bankModel) {
		// TODO Auto-generated method stub
		return bankRepository.save(bankModel);
	}

	public List<BankModel> getBankDetails() {
		List<BankModel> bankmodel1=(List<BankModel>) bankRepository.findAll();
		return bankmodel1;
	}
	
	public Optional<BankModel> getBankDetailsById(int id) {
	
	Optional<BankModel> bankModel=bankRepository.findById(id);
	BankModel bankMode2 =bankModel.get();
	if(bankMode2.getId()>0) {
		throw new NoBankFound("no such bank found in records");
	}
	return bankModel;
}
	
	
	
	
	
	

//	public Optional<BankModel> getBankDetailsById(int id) {
//		
//		Optional<BankModel> bankModel=bankRepository.findById(id);
//		return bankModel;
//	}

	public void deleteBankDetailsById(int id) {
		bankRepository.deleteById(id);
		
	}

	public BankModel updateBankDetailsById(Integer id, BankModel bankModel) {
		Optional<BankModel> BankModel1=bankRepository.findById(id);
		BankModel BankModel2=BankModel1.get();
		BankModel2.setId(bankModel.getId());
		BankModel2.setName(bankModel.getName());
		
		
		return bankRepository.save(BankModel2);
	}

	public void updatedById(int id, BankModel bankModel) {
		Optional<BankModel> BankModel1=bankRepository.findById(id);
		BankModel bankModel2=BankModel1.get();
		bankModel2.setId(bankModel.getId());
	
		bankModel2.setName(bankModel.getName());
		bankRepository.save(bankModel2);
		
	}
}
