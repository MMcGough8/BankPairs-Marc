package io.zipcoder;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(Object accountHolder, Double balance, String accountNumber, Double interestRate) {
        super(accountHolder, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        this.balance = this.balance + (this.balance * interestRate);
    }

    @Override
    public void debit(Double amount) {
       if (amount > getBalance()) {
            return;
    }
        super.debit(amount);
    }
}
