package br.com.wally.ferreira.trabalhopicpay.transaction;

public class InvalidTransactionException extends RuntimeException {

  public InvalidTransactionException(String message) {
    super(message);
  }

}
