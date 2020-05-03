/**
 * 
 */
package com.cg.obs.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.obs.model.Transaction;

/**
 * @author sohel
 *
 */
@RestController
public class TransactionController {
	@GetMapping(path = "/transactions")
	public List<Transaction> getAllTransactions(){
		System.out.println("This will return list of all transactions");
		return new ArrayList<Transaction>();
	}
	
	@GetMapping(path = "/transactions/{accountNo}")
	public List<Transaction> getTransactionByAccountNo(@PathVariable String accountNo){
		System.out.println("this will return transaction for account");
		return new ArrayList<Transaction>();
	}
	
	@PostMapping(path = "/transactions")
	public String addTransaction(@RequestBody Transaction transaction) {
		System.out.println("this will add transaction into db");
		return "transaction added";
	}
}
