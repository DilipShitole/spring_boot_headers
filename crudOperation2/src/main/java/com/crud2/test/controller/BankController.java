package com.crud2.test.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud2.test.model.BankModel;
import com.crud2.test.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@PostMapping("/save")
	private BankModel saveBankDetails(@RequestBody BankModel bankModel) {
		BankModel BankModel1=bankService.saveBankDetails(bankModel);
		
		return BankModel1;
		}
	
	@GetMapping("/getalldata")
	private List<BankModel> getBankDetails(HttpServletRequest request,@RequestHeader String ip,@RequestHeader String nm){
		System.out.println("IP of device  "+ip);
		System.out.println("name of device "+nm);
		System.out.println(request.getLocalPort());
		System.out.println(request.getMethod());	
		System.out.println(request.getLocalPort());
		
		
		List<BankModel> bankmodel1=bankService.getBankDetails();
		return bankmodel1;
	}
	
	@GetMapping("/getbyid/{id}")
	private Optional<BankModel> getBankDetailsById(@PathVariable int id) {
		Optional<BankModel> bankModel1=bankService.getBankDetailsById(id);
		return bankModel1;
	}

	@DeleteMapping("/delete/{id}")
	private String deleteBankDetailsById(@PathVariable int id) {
		bankService.deleteBankDetailsById(id);
		return "deleted";
	}
	
	@PutMapping("/update/{id}")
	private void updateBankDetailsById(@PathVariable Integer id,@RequestBody BankModel bankModel  ) {
		bankService.updateBankDetailsById(id,bankModel);
		
	}
	
	@PutMapping("/updatedbyid/{id}")
	private String updateByName(@PathVariable int id,@RequestBody BankModel bankModel ) {
		bankService.updatedById(id,bankModel);
		return "updated";
		
	}
	
	
	
	
}
