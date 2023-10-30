package com.baeldung.i.polluted;

import java.util.Collections;
import java.util.List;

public class BankPayment implements Payment {

  public void initiatePayments() {

  }

  public Object status() {
    return null;
  }

  public List<Object> getPayments() {
    return Collections.emptyList();
  }

  public void intiateLoanSettlement() {
    throw new UnsupportedOperationException("This is not a loan payment");
  }

  public void initiateRePayment() {
    throw new UnsupportedOperationException("This is not a loan payment");
  }
}
