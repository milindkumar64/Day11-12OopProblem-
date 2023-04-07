package com.bridgelabz.account;

import java.util.*;

class Account {

	long balance;

	public Account(long balance) {
		this.balance = balance;
	}

	public void debit(long withdrawAmount) {
		if (balance > withdrawAmount)
			balance = balance - withdrawAmount;
		else
			System.out.println("balance is not sufficient to withdraw amount");
		System.out.println("Current balance is :" + balance);
	}

	public static void main(String[] args) {

		Account user = new Account(5000);
		Scanner sc = new Scanner(System.in);
		System.out.println("How much want to withdraw ?");
		int withdraw = sc.nextInt();
		user.debit(withdraw);
	}
}