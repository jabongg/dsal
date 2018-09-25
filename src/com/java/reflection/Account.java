package com.java.reflection;

public class Account {

	private Integer balance = 6000;
	
	/**
	 * this method returns the current balance in the account.
	 * @return
	 */
	public Integer getBalance() {
		return balance;
	}
	
	/**
	 * updates balance after withdrawal
	 * @param amount
	 */
	public void withdraw(Integer amount) {
		/*
		 * trying to handle this balance update, so that any change by other thread is immediately
		 * visible to other thread... 
		 * 
		 * but it seems not working. how to do ??? 
		 * 
		 */
		synchronized(this) {
			balance = balance - amount;

		}
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		return true;
	}
	
	
}
