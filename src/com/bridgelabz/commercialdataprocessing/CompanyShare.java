package com.bridgelabz.commercialdataprocessing;

public class CompanyShare {

	String stockSymbol;
	int numberOfShare;
	long date_time;
	
	public CompanyShare(String stockSymbol, int numberOfShare, long date_time) {
		super();
		this.stockSymbol = stockSymbol;
		this.numberOfShare = numberOfShare;
		this.date_time = date_time;
			
	}
	
	public String toString()
	{
		return "stockSymbol: "+stockSymbol+" numberOfShare : "+numberOfShare+" date_time : "+date_time;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public long getDate_time() {
		return date_time;
	}

	public void setDate_time(long date_time) {
		this.date_time = date_time;
	}
	
	
	
}
