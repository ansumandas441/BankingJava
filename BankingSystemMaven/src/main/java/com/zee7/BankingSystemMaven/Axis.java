package com.zee7.BankingSystemMaven;

public class Axis implements Bank{
	private int accNo;
    private String name;
    private int amount;
    
    Axis(int accNo, String name, int amount){
    	this.accNo=accNo;
    	this.name=name;
    	this.amount=amount;
    }
    
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void deposit(int amt){
		amount+=amt;
        System.out.println("\nThe current amount is "+amount);
	}
	public void withdraw(int amt){
		if(amt>amount){
            System.out.println("\nInsufficient balance ");
        }else{
            amount-=amt;
            System.out.println("\nThe current amount is "+amount);

        }
	}
	public void checkBalance(){
		System.out.println("\nYour balance is "+amount);
	}
	public void displayAll(){
        System.out.println("\nAccount information.");
        System.out.println("Name : "+name);
        System.out.println("Acc no. :  "+accNo);
        System.out.println("Balance : "+amount);

    }
    
    
    
    
}
