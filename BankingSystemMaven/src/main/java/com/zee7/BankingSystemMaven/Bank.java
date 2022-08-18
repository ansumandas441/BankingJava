package com.zee7.BankingSystemMaven;

public interface Bank {
	
    
    public int getAccNo();
	public void setAccNo(int accNo);
	public String getName();
	public void setName(String name);
	public int getAmount();
	public void setAmount(int amount);
	public void displayAll();
	public void deposit(int amt);
	public void withdraw(int amt);
	public void checkBalance();
    

    
}
