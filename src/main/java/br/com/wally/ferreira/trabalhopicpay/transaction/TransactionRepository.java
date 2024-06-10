package br.com.wally.ferreira.trabalhopicpay.transaction;

import org.springframework.data.repository.ListCrudRepository;

public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {

}
