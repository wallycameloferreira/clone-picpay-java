package br.com.wally.ferreira.trabalhopicpay.transaction;

public class UnauthorizedTransactionException extends RuntimeException {
  public UnauthorizedTransactionException(String message) {
    super(message);
  }
}
