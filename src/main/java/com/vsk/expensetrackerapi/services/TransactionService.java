package com.vsk.expensetrackerapi.services;

import com.vsk.expensetrackerapi.domain.Transaction;
import com.vsk.expensetrackerapi.exception.EtBadRequestException;
import com.vsk.expensetrackerapi.exception.EtResourceNotFoundException;
import org.springframework.transaction.reactive.TransactionalOperator;

import java.util.List;

public interface TransactionService {
    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);
    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;
    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;
    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

}
