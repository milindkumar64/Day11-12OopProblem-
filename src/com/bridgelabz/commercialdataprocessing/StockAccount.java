package com.bridgelabz.commercialdataprocessing;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class StockAccount implements StockAccountInterface {

	ArrayList<CompanyShare> companyShares = new ArrayList<>();

	public double valueOf() {
		return 0;
	}

	public void buy(int amount, String symbol) {

		int numberOfShare = amount / 10;
		CompanyShare share = new CompanyShare(symbol, numberOfShare, System.currentTimeMillis());
		this.companyShares.add(share);

	}

	public void sell(int amount, String symbol) {
		// int numberOfShare = amount / 10;
		Iterator<CompanyShare> itr = companyShares.iterator();

		while (itr.hasNext()) {
			CompanyShare share = itr.next();
			if (share.stockSymbol.equals(symbol)) {
				companyShares.remove(share);
				System.out.println(symbol + " Share has been sold out");
			}

		}

	}

	public void save(String filename) {
	}

	public void printReport() {
		for (CompanyShare share : companyShares) {
			System.out.println(share);
		}

	}

	public static void main(String args[]) {
		StockAccount stockAccount = new StockAccount();
		stockAccount.buy(5000, "Trends");
		stockAccount.buy(6000, "Zudio");
		stockAccount.buy(8000, "Zomato");

		stockAccount.printReport();

		stockAccount.sell(5000, "Trends");
		stockAccount.sell(8000, "Zomato");

	}

}
