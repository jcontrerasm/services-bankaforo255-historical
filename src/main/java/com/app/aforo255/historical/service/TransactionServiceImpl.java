package com.app.aforo255.historical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.historical.model.entity.Transaction;
import com.app.aforo255.historical.model.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaction save(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByAccountId(Integer accountId) {
		return transactionRepository.findByAccountId(accountId);
	}

	@Override
	public Iterable<Transaction> findAll() {
		return transactionRepository.findAll();
	}
}
