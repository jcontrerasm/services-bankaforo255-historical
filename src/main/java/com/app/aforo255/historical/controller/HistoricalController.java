package com.app.aforo255.historical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.historical.model.entity.Transaction;
import com.app.aforo255.historical.service.ITransactionService;

@RestController
public class HistoricalController {

	@Autowired
	private ITransactionService transactionService;

	@GetMapping("/v1/transaction/{accountId}")
	public ResponseEntity<?> getTransactions(@PathVariable Integer accountId) {
		Iterable<Transaction> iterableTransaction = transactionService.findByAccountId(accountId);
		return ResponseEntity.ok(iterableTransaction);
	}

	@GetMapping("/v1/transaction")
	public List<Transaction> list() {
		return (List<Transaction>) transactionService.findAll();
	}
}
